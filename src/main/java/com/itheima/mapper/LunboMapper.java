package com.itheima.mapper;

import com.itheima.entity.Lunbo;
import com.itheima.entity.LunboExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LunboMapper {
    long countByExample(LunboExample example);

    int deleteByExample(LunboExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Lunbo record);

    int insertSelective(Lunbo record);

    List<Lunbo> selectByExample(LunboExample example);

    Lunbo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Lunbo record, @Param("example") LunboExample example);

    int updateByExample(@Param("record") Lunbo record, @Param("example") LunboExample example);

    int updateByPrimaryKeySelective(Lunbo record);

    int updateByPrimaryKey(Lunbo record);
}