package jmu.hkx.service;

import java.util.List;

import jmu.hkx.vo.Revert;
import jmu.hkx.vo.RevertExample;

public interface RevertService {
	
	    int deleteByPrimaryKey(Integer revertid);
	    
	    int deleteByExample(RevertExample example);
	    
	    int insert(Revert record);

	    int insertSelective(Revert record);

	    List<Revert> selectByExample(RevertExample example);

	    Revert selectByPrimaryKey(Integer revertid);

	    List<Revert> selectByExampleWithUser(RevertExample example);

	    Revert selectByPrimaryKeyWithUser(Integer revertid);

}
