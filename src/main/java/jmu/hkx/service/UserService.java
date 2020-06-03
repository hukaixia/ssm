package jmu.hkx.service;

import jmu.hkx.vo.User;

public interface UserService {
	public int insert(User record);
	public User selectByPrimaryKey(String userid);
	public int updateByPrimaryKey(User record);
}
