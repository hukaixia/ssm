package jmu.hkx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jmu.hkx.dao.MessageMapper;
import jmu.hkx.service.MessageService;
import jmu.hkx.vo.Message;
import jmu.hkx.vo.MessageExample;

@Service("messageService")
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageMapper messageMapper;
	//根据主键删除一条message
	@Override
	public int deleteByPrimaryKey(Integer messageid) {
		return messageMapper.deleteByPrimaryKey(messageid);
	}

	//添加一条message
	@Override
	public int insert(Message record) {
		
		return messageMapper.insert(record);
	}

	
	@Override
	public int insertSelective(Message record) {
		// TODO Auto-generated method stub
		return messageMapper.insertSelective(record);
	}

	//按照条件查询message，并返回一个List集合
	@Override
	public List<Message> selectByExample(MessageExample example) {
		// TODO Auto-generated method stub
		return messageMapper.selectByExample(example);
	}

	//带有user类的条件查询，并返回一个list集合
	@Override
	public List<Message> selectByExampleWithUser(MessageExample example) {
		return messageMapper.selectByExampleWithUser(example);
	}

	//带主键查询一条message记录
	@Override
	public Message selectByPrimaryKey(Integer messageid) {
		
		return messageMapper.selectByPrimaryKey(messageid);
	}

	//带有user的主键查询
	@Override
	public Message selectByPrimaryKeyWithUser(Integer messageid) {
		return messageMapper.selectByPrimaryKeyWithUser(messageid);
	}

	@Override
	public int updateByPrimaryKey(Message record) {
		// TODO Auto-generated method stub
		return messageMapper.updateByPrimaryKey(record);
	}

}
