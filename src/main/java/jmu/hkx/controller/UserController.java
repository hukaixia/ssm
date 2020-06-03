package jmu.hkx.controller;

import java.io.File;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import jmu.hkx.service.UserService;
import jmu.hkx.service.impl.UserServiceImpl;
import jmu.hkx.vo.ResponseMessage;
import jmu.hkx.vo.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/loginPage")
	public String LoginPage(){
		return "login";
	}
	//验证用户ID和密码是否输入正确
	@ResponseBody // 序列化--> 类型转换--> jackson --> json
	@RequestMapping("/login")
	public ResponseMessage login(@RequestParam("userid")String userID,@RequestParam("userpassword")String userPassword,HttpSession session ){
		User user = userService.selectByPrimaryKey(userID);
		System.out.println(user.toString());
		
		if(user==null){
			return ResponseMessage.error();
		}else{
			if(user.getUserpassword().equals(userPassword))
			{
				session.setAttribute("loginUser", user);
				System.out.println(user.toString());
				return ResponseMessage.success().addObject("user", user);
			}
			else return ResponseMessage.error();
				
		}
	}
	
	//注册处理
	@ResponseBody // 序列化--> 类型转换--> jackson --> json
	@RequestMapping("/register")
	public ResponseMessage register(@RequestParam("userid")String userID,@RequestParam("userpassword")String userPassword,@RequestParam("username")String userName){
		User user = new User();
		user.setUserid(userID);
		user.setUsername(userName);
		user.setUserpassword(userPassword);
		user.setUserrole(0);
		user.setUserimage("/ssm/static/image/logo.png");
		int count = userService.insert(user);
		 return count == 1 ? ResponseMessage.success() : ResponseMessage.error();
	}
	
	//注册时验证用户ID是否可用
	@ResponseBody // 序列化--> 类型转换--> jackson --> json
	@RequestMapping("/checkuserID")
    //@PostMapping(value="/checkuserID", produces = {"application/json;charset=UTF-8"})
	public ResponseMessage  Register(@RequestParam("userid")String userID){
		User user = userService.selectByPrimaryKey(userID);
        return user == null ? ResponseMessage.success() : ResponseMessage.error();
	}
	//用户更改个人信息，如上传头像，重新设置密码等
//	@RequestMapping("/updateUser")
//	public String Userlist(MultipartFile userimage,Model model,HttpServletRequest request){
//		 String path = request.getSession().getServletContext().getRealPath("/static/images/");
//		 File file=new File(path);
//		 if(!file.exists())
//			 file.mkdirs();
//		 String filename = userimage.getOriginalFilename();
//		 String uuid = UUID.randomUUID().toString().replace("-", "");
//		 System.out.println(file);
//		 filename = uuid+"_"+filename;
//		 String f = ""+request.getContextPath()+"/static/images/"+filename;
//		 model.addAttribute("file", f);
//		 
//		 User user = (User)request.getSession().getAttribute("loginUser");
//		 System.out.println(f);
//		 user.setUserimage(f);
//		 
//		 int count = userService.updateByPrimaryKey(user);
//		 request.getSession().setAttribute("loginUser", user);
//	     return "homepage";
//	}
	
}
