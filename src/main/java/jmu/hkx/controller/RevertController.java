package jmu.hkx.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import jmu.hkx.service.MessageService;
import jmu.hkx.service.ProductService;
import jmu.hkx.service.RevertService;
import jmu.hkx.vo.Message;
import jmu.hkx.vo.MessageExample;
import jmu.hkx.vo.Product;
import jmu.hkx.vo.ResponseMessage;
import jmu.hkx.vo.Revert;
import jmu.hkx.vo.RevertExample;
import jmu.hkx.vo.User;

@Controller
public class RevertController {
	
	@Autowired
	private RevertService revertService;
	@Autowired
	private ProductService productService;
	@Autowired
	private MessageService messageService;
	
	//处理product页面跳转
	@RequestMapping("/revert")
	public String product(Model model,@RequestParam(value="messageid",defaultValue="1" )Integer messageid)
	{
		Message message = messageService.selectByPrimaryKeyWithUser(messageid);
        Product product = productService.selectByPrimaryKey( message.getProductid());
        RevertExample re = new RevertExample();
        re.createCriteria().andMessageidEqualTo(messageid);
        List<Revert> reverts = revertService.selectByExampleWithUser(re);
        System.out.println(product.toString());
		model.addAttribute("product", product);
		model.addAttribute("message", message);
		model.addAttribute("rcount",reverts.size());
		return "revert";
	}
	
	//处理回复
	@RequestMapping("/addRevert")
	public String AddRevert(@RequestParam(value="revertContent")String revertContent,
			@RequestParam(value="messageID")Integer messageID,Model model,HttpSession session){
		//获取时间
		SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        Date date =new Date();  
        String d = myFormatter.format(date); 
        //获取session中的user
        User user = (User)session.getAttribute("loginUser");
        System.out.println(user.toString());
        Revert revert = new Revert(0,revertContent,d,messageID,user.getUserid());
        int count = revertService.insert(revert);
        
		Message message = messageService.selectByPrimaryKeyWithUser(messageID);
		message.setCount(message.getCount()+1);
		messageService.updateByPrimaryKey(message);
		Product product = productService.selectByPrimaryKey(message.getProductid());
		RevertExample re = new RevertExample();
	    re.createCriteria().andMessageidEqualTo(messageID);
	    List<Revert> reverts = revertService.selectByExampleWithUser(re);
	    model.addAttribute("product", product);
		model.addAttribute("message", message);
		model.addAttribute("rcount",reverts.size());
		
		return "revert";
	}
	//处理ajax请求
	@ResponseBody
	@RequestMapping("/revertlist")
	public ResponseMessage product(@RequestParam(value="pn",defaultValue="1" )Integer pn,
			              @RequestParam(value="messageID")Integer messageID){
		System.out.println("ajax请求数据"+messageID);
		PageHelper.startPage(pn, 5);
        RevertExample re = new RevertExample();
        re.createCriteria().andMessageidEqualTo(messageID);
		List<Revert> rlist =revertService.selectByExampleWithUser(re);
		for(int i=0;i<rlist.size();i++)
			System.out.println(rlist.get(i).getUser().getUsername());
		//使用pageinfo包装,封装了详细的信息,传入连续显示的页数
		PageInfo page = new PageInfo(rlist,5);
		return ResponseMessage.success().addObject("rlist", page);
	}

}
