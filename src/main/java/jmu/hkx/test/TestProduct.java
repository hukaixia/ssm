package jmu.hkx.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import com.github.pagehelper.PageInfo;

import jmu.hkx.vo.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"classpath:applicationContext.xml","classpath:springmvc.xml"})
public class TestProduct {
	@Autowired
	WebApplicationContext context;
	MockMvc mockMvc;
	@Before
	public void initMokeMvc(){
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	
	}
	@Test
	public void testPage() throws Exception{
		MvcResult result =  mockMvc.perform(MockMvcRequestBuilders.get("/pro").param("pn", "2")).andReturn();
		//请求成功后拿到productInfo
		MockHttpServletRequest request = result.getRequest();
		PageInfo pi = (PageInfo)request.getAttribute("productInfo");
		System.out.println("当前页码:"+pi.getPageNum());
		System.out.println("总页码:"+pi.getPages());
		System.out.println("总记录数:"+pi.getTotal());
		System.out.println("在页面需要连续显示的页码:");
		int []num = pi.getNavigatepageNums();
		for(int i:num)
			System.out.print(i+ " ");
		//获取商品数据
		List<Product> p = pi.getList();
		for(int i=0;i<p.size();i++)
			System.out.println(p.get(i).toString());
		 
	}

}
