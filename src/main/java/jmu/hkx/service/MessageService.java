package jmu.hkx.service;

import java.util.List;

import jmu.hkx.vo.Message;
import jmu.hkx.vo.MessageExample;

public interface MessageService {
	    //根据ID删除一条留言
	    int deleteByPrimaryKey(Integer messageid);

	    //插入一条留言
	    int insert(Message record);

	    int insertSelective(Message record);

	    //按条件查询
	    List<Message> selectByExample(MessageExample example);
	    //带user的条件查询
	    List<Message> selectByExampleWithUser(MessageExample example);
	    Message selectByPrimaryKey(Integer messageid);

	    Message selectByPrimaryKeyWithUser(Integer messageid);
	    //更新一条留言
	    int updateByPrimaryKey(Message record);
}
