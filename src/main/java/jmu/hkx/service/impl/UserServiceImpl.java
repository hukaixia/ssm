package jmu.hkx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jmu.hkx.dao.UserMapper;
import jmu.hkx.service.UserService;
import jmu.hkx.vo.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	@Override
	public int insert(User record) {
		
		return userMapper.insert(record);
	}

	@Override
	public User selectByPrimaryKey(String userid) {
		System.out.println("service层");
		return userMapper.selectByPrimaryKey(userid);
	}

	@Override
	public int updateByPrimaryKey(User record) {
		return userMapper.updateByPrimaryKey(record);
	}

}
