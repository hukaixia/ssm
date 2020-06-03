package jmu.hkx.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import jmu.hkx.service.MessageService;
import jmu.hkx.service.RevertService;
import jmu.hkx.service.UserService;
import jmu.hkx.vo.Message;
import jmu.hkx.vo.MessageExample;
import jmu.hkx.vo.ResponseMessage;
import jmu.hkx.vo.RevertExample;
import jmu.hkx.vo.User;

@Controller
public class UserPageController {
	
	@Autowired
	private MessageService messageService;
	@Autowired
	private UserService userService;

	@Autowired
	private RevertService revertService;
	
	@RequestMapping("/userpage")
	public String UserPage(){
		return "userpage";
	}
	
	@ResponseBody
	@RequestMapping("/myMessage")
	public ResponseMessage product(@RequestParam(value="pn",defaultValue="1" )Integer pn,
			                      HttpSession session){
		User user = (User)session.getAttribute("loginUser");
		PageHelper.startPage(pn, 5);
        MessageExample me = new MessageExample();
        me.createCriteria().andUseridEqualTo(user.getUserid());
		List<Message> list = messageService.selectByExample(me);
		//使用pageinfo包装,封装了详细的信息,传入连续显示的页数
		PageInfo page = new PageInfo(list,7);
		return ResponseMessage.success().addObject("mylist", page);
	}
	
	//用户退出（注销）
	@ResponseBody
	@RequestMapping("/logout")
	public ResponseMessage Logout( HttpSession session){
		
	    session.invalidate();
		return ResponseMessage.success();
	}
	
	//用户修改个人信息
	@RequestMapping("/updateUser")
	public String addProduct(MultipartFile upFile,HttpServletRequest request,@RequestParam(value="userName")String userName,
			@RequestParam(value="userPassword")String userPassword)throws IOException{

		 String path = request.getSession().getServletContext().getRealPath("/static/images/");
		 File file=new File(path);
		 if(!file.exists())
			 file.mkdirs();
		 
		 String filename = upFile.getOriginalFilename();
		 String uuid = UUID.randomUUID().toString().replace("-", "");
		 filename = uuid+"_"+filename;
		 System.out.println(filename);
		 String f = ""+request.getContextPath()+"/static/images/"+filename;
		 upFile.transferTo(new  File(path,filename));
		 User user = (User)request.getSession().getAttribute("loginUser");
		 user.setUserimage(f);
		 user.setUsername(userName);
		 user.setUserpassword(userPassword);
		 int count = userService.updateByPrimaryKey(user);
		 request.getSession().setAttribute("loginUser", user);
		 System.out.println(user.toString());
		return "userpage";
	}
	@ResponseBody
	@RequestMapping("/deleteMessage")
	public ResponseMessage DeleteMessage(@RequestParam(value="messageid")Integer messageid)
	{
	   int count = messageService.deleteByPrimaryKey(messageid);
	   return ResponseMessage.success();
	}
}
