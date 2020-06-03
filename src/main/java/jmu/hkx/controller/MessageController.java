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
import jmu.hkx.vo.Message;
import jmu.hkx.vo.MessageExample;
import jmu.hkx.vo.Product;
import jmu.hkx.vo.ProductExample;
import jmu.hkx.vo.ResponseMessage;
import jmu.hkx.vo.User;

@Controller
public class MessageController {
   
	@Autowired
	private MessageService messageService;
	@Autowired
	private ProductService productService;
	//用户添加一条记录
	@RequestMapping("/addMessage")
	public String product(@RequestParam(value="messageContent" )String messageContent,
		           	@RequestParam(value="proID" )Integer productID,HttpSession session,Model model){
		//获取留言时间
		SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        Date date =new Date();  
        String d = myFormatter.format(date); 
        User user = (User)session.getAttribute("loginUser");
        Message message = new Message(0,messageContent,d,0,productID,user.getUserid());
        System.out.println(user.getUserid());
        int count = messageService.insertSelective(message);
		Product product = productService.selectByPrimaryKey(productID);
		MessageExample me = new MessageExample();
		me.createCriteria().andProductidEqualTo(productID);
		List<Message> mlist = messageService.selectByExampleWithUser(me);
		model.addAttribute("product", product);
		model.addAttribute("mcount",mlist.size());
        return "product";
	}
	
	
	 
    //发送ajax请求获取数据
	@ResponseBody
	@RequestMapping("/messagelist")
	public ResponseMessage product(@RequestParam(value="pn",defaultValue="1" )Integer pn,
			              @RequestParam(value="proID")Integer proID){
		System.out.println(proID+"  "+pn);
		PageHelper.startPage(pn, 5);
        MessageExample me = new MessageExample();
        me.createCriteria().andProductidEqualTo(proID);
		List<Message> list = messageService.selectByExampleWithUser(me);
//		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i).toString());
		//使用pageinfo包装,封装了详细的信息,传入连续显示的页数
		PageInfo page = new PageInfo(list,5);
		return ResponseMessage.success().addObject("mlist", page);
	}
}
