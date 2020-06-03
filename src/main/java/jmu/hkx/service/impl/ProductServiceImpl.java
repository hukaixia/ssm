package jmu.hkx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jmu.hkx.dao.ProductMapper;
import jmu.hkx.service.ProductService;
import jmu.hkx.vo.Product;
import jmu.hkx.vo.ProductExample;
@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer productid) {
		return productMapper.deleteByPrimaryKey(productid);
	}

	@Override
	public int insert(Product record) {
		
		return productMapper.insert(record);
	}

	@Override
	public List<Product> selectByExample(ProductExample example) {
		return productMapper.selectByExample(example);
	}

	@Override
	public int updateByPrimaryKey(Product record) {
		
		return productMapper.updateByPrimaryKey(record);
	}

	@Override
	public Product selectByPrimaryKey(Integer productid) {
		// TODO Auto-generated method stub
		return productMapper.selectByPrimaryKey(productid);
	}

	@Override
	public List<Product> selectByPart(String productpart) {
		// TODO Auto-generated method stub
		return productMapper.selectByPart(productpart);
	}

}
