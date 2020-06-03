package jmu.hkx.controller;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import jmu.hkx.service.ProductService;
import jmu.hkx.vo.Product;
import jmu.hkx.vo.ProductExample;
import jmu.hkx.vo.ResponseMessage;

@Controller
public class AdminController {
	@Autowired
	private ProductService productService;
	
	//发送ajax请求获取数据
	@ResponseBody
	@RequestMapping("/adminList")
	public ResponseMessage product(@RequestParam(value="pn",defaultValue="1" )Integer pn,
		           	@RequestParam(value="searchContent",defaultValue="" )String searchContent){
		if(searchContent==""||searchContent==null)
			searchContent="%";
		else
			searchContent="%"+searchContent+"%";
		PageHelper.startPage(pn, 5);
		List<Product> list = productService.selectByPart(searchContent);
		//使用pageinfo包装,封装了详细的信息,传入连续显示的页数
		PageInfo page = new PageInfo(list,5);
		return ResponseMessage.success().addObject("uproduct", page);
	}
	//管理员添加和修改商品
	@RequestMapping("/adminAdd")
	public String pages(@RequestParam(value="productid")Integer productid,@RequestParam(value="productname")String productname,
			@RequestParam(value="productbrand")String productbrand,@RequestParam(value="productmodel")String productmodel,
		    @RequestParam(value="productprice")String productprice,@RequestParam(value="productdes")String productdes,MultipartFile upFile,HttpServletRequest request,Model model) throws IllegalStateException, IOException{
			    
			 String path = request.getSession().getServletContext().getRealPath("/static/images/");
			 File file=new File(path);
			 if(!file.exists())
				 file.mkdirs();
			 System.out.println(upFile);
			 String filename = upFile.getOriginalFilename();
			 String uuid = UUID.randomUUID().toString().replace("-", "");
			 System.out.println(file);
			 filename = uuid+"_"+filename;
			 String f = ""+request.getContextPath()+"/static/images/"+filename;
			 model.addAttribute("file", f);
             System.out.println(f);
			 upFile.transferTo(new  File(path,filename));
		
	        BigDecimal price = new BigDecimal(productprice);
	        Product product = new Product(productname,productbrand,productmodel,price,f,productdes);
	        //等于0处理插入
	        if(productid==0)
	        {
	        	 int num = productService.insert(product);
	        }else//处理修改
	        {
	        	product.setProductid(productid);
	        	int num = productService.updateByPrimaryKey(product);
	        }
	        System.out.println(productid);
	        PageHelper.startPage(1, 5);
	        List<Product> list = productService.selectByExample(null);
	        PageInfo page = new PageInfo(list,5);
	        model.addAttribute("productInfo",page);
		    return "admin";
	}
	//管理员页面
	@RequestMapping("/admin")
	public String AdminPages(@RequestParam(value="pn",defaultValue="1" )Integer pn){
		//在查询之前只需要调用，传入页码，以及每页的大小
//		System.out.println("forword跳转");
//		PageHelper.startPage(pn, 5);
//		List<Product> list = productService.selectByExample(null);
//		//使用pageinfo包装,封装了详细的信息,传入连续显示的页数
//		for(int i=0;i<list.size();i++)
//			System.out.println(list.get(i).toString());
//		PageInfo page = new PageInfo(list,5);
//		model.addAttribute("productInfo",page);
		return "admin";
	}
	//管理员修改时获取商品信息
	@ResponseBody
	@RequestMapping("/adminUpdate")
	public ResponseMessage AdminUpdate(@RequestParam("productid")Integer productid ){
		Product product = productService.selectByPrimaryKey(productid);
		System.out.println(product.toString());
		return ResponseMessage.success().addObject("uproduct", product);
	}
	
	//管理员删除商品
	@ResponseBody // 序列化--> 类型转换--> jackson --> json
    @PostMapping(value="/adminDelete", produces = {"application/json;charset=UTF-8"})
	public ResponseMessage  Login(@RequestParam("productid")Integer productid ){
		int count = productService.deleteByPrimaryKey(productid);
        System.out.println(count);
		 return count == 1 ? ResponseMessage.success() : ResponseMessage.error();
	}
}
