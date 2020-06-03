package jmu.hkx.service;

import java.util.List;

import jmu.hkx.vo.Product;
import jmu.hkx.vo.ProductExample;

public interface ProductService {
	
	    //根据ID删除
	    int deleteByPrimaryKey(Integer productid);
        //添加一条记录
	    int insert(Product record);
	    
	    //根据条件查询
	    List<Product> selectByExample(ProductExample example);
	    //根据ID修改上坪商品信息
	    int updateByPrimaryKey(Product record);
	    //根据ID查找信息
	    Product selectByPrimaryKey(Integer productid);
	    //根据商品名和商品类型模糊查询
	    List<Product> selectByPart(String productpart);
	    

}
