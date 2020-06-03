package jmu.hkx.controller;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private MessageService messageService;
	//处理商品链接
	@RequestMapping("/product")
	public String product(Model model,@RequestParam(value="productid",defaultValue="1" )Integer productid)
	{
		Product product = productService.selectByPrimaryKey(productid);
		MessageExample me = new MessageExample();
		me.createCriteria().andProductidEqualTo(productid);
		List<Message> mlist = messageService.selectByExampleWithUser(me);
		model.addAttribute("product", product);
		model.addAttribute("mcount",mlist.size());
		return "product";
	}
	//添加商品
	@RequestMapping("/up")
	public String addProduct(MultipartFile upFile,HttpServletRequest request,Model model)throws IOException{


		 String path = request.getSession().getServletContext().getRealPath("/static/images/");
		 File file=new File(path);
		 if(!file.exists())
			 file.mkdirs();
		 
		 String filename = upFile.getOriginalFilename();
		 String uuid = UUID.randomUUID().toString().replace("-", "");
		 filename = uuid+"_"+filename;
		 System.out.println(filename);
		 String f = "/ssm/static/images/"+filename;
		 model.addAttribute("file", f);
		 System.out.println(path);
		 upFile.transferTo(new  File(path,filename));
		return "success";
	}
 
	
	@RequestMapping("/userlist")
	public String pages(@RequestParam(value="pn",defaultValue="1" )Integer pn,Model model,HttpServletRequest request){
		//在查询之前只需要调用，传入页码，以及每页的大小
//		PageHelper.startPage(pn, 5);
//		List<Product> list = productService.selectByExample(null);
//		//使用pageinfo包装,封装了详细的信息,传入连续显示的页数
////		for(int i=0;i<list.size();i++)
////			System.out.println(list.get(i).toString());
//		PageInfo page = new PageInfo(list,5);
//		model.addAttribute("productInfo",page);
//		System.out.println(list.size());
		return "homepage";
	}

	//用户查询商品
	@ResponseBody
	@RequestMapping("/prolist")
	public ResponseMessage product(@RequestParam(value="pn",defaultValue="1" )Integer pn,
		           	@RequestParam(value="searchContent",defaultValue="")String searchContent){
		System.out.println(searchContent);
		if(searchContent==""||searchContent==null)
			searchContent="%";
		else
			searchContent="%"+searchContent+"%";
		PageHelper.startPage(pn, 5);
		List<Product> list = productService.selectByPart(searchContent);
		PageInfo page = new PageInfo(list,5);
		return ResponseMessage.success().addObject("uproduct", page);
	}
	//处理搜索框
	@RequestMapping("/searchProduct")
	public String Search(@RequestParam(value="pn",defaultValue="1" )Integer pn,
			@RequestParam(value="searchContent")String searchContent,Model model){
		model.addAttribute("search", searchContent);
		return "homepage";
	}
}
