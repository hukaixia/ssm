package jmu.hkx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jmu.hkx.dao.RevertMapper;
import jmu.hkx.service.RevertService;
import jmu.hkx.vo.Revert;
import jmu.hkx.vo.RevertExample;

@Service
public class RevertServiceImpl implements RevertService {

	@Autowired
	private RevertMapper revertMapper;
	@Override
	public int deleteByPrimaryKey(Integer revertid) {
		return revertMapper.deleteByPrimaryKey(revertid);
	}

	@Override
	public int insert(Revert record) {
		// TODO Auto-generated method stub
		return revertMapper.insert(record);
	}

	@Override
	public int insertSelective(Revert record) {
		// TODO Auto-generated method stub
		return revertMapper.insertSelective(record);
	}

	@Override
	public List<Revert> selectByExample(RevertExample example) {
		// TODO Auto-generated method stub
		return revertMapper.selectByExample(example);
	}

	@Override
	public Revert selectByPrimaryKey(Integer revertid) {
		// TODO Auto-generated method stub
		return revertMapper.selectByPrimaryKey(revertid);
	}

	@Override
	public List<Revert> selectByExampleWithUser(RevertExample example) {
		// TODO Auto-generated method stub
		return revertMapper.selectByExampleWithUser(example);
	}

	@Override
	public Revert selectByPrimaryKeyWithUser(Integer revertid) {
		// TODO Auto-generated method stub
		return revertMapper.selectByPrimaryKeyWithUser(revertid);
	}

	@Override
	public int deleteByExample(RevertExample example) {
		// TODO Auto-generated method stub
		return revertMapper.deleteByExample(example);
	}

}
