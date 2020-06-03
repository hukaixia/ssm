package jmu.hkx.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jmu.hkx.dao.ProductMapper;
import jmu.hkx.dao.UserMapper;
import jmu.hkx.service.ProductService;
import jmu.hkx.vo.Product;
import jmu.hkx.vo.ProductExample;

public class TestPro {


	
	@Test
	public void testexample(){
		ProductExample pe = new ProductExample();
		pe.createCriteria().andProductnameLike("%小%");
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductMapper productMapper=(ProductMapper) ac.getBean("productMapper");
		List<Product> product = productMapper.selectByExample(pe);
		for(int i=0;i<product.size();i++)
			System.out.println(product.get(i).toString());
	}

}
