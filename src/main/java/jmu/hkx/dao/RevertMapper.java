package jmu.hkx.dao;

import java.util.List;
import jmu.hkx.vo.Revert;
import jmu.hkx.vo.RevertExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RevertMapper {
    long countByExample(RevertExample example);

    int deleteByExample(RevertExample example);

    int deleteByPrimaryKey(Integer revertid);

    int insert(Revert record);

    int insertSelective(Revert record);

    List<Revert> selectByExample(RevertExample example);

    Revert selectByPrimaryKey(Integer revertid);

    List<Revert> selectByExampleWithUser(RevertExample example);

    Revert selectByPrimaryKeyWithUser(Integer revertid);

    int updateByExampleSelective(@Param("record") Revert record, @Param("example") RevertExample example);

    int updateByExample(@Param("record") Revert record, @Param("example") RevertExample example);

    int updateByPrimaryKeySelective(Revert record);

    int updateByPrimaryKey(Revert record);
}