package com.itheima.mapper;

import com.itheima.entity.Colorsize;
import com.itheima.entity.ColorsizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColorsizeMapper {
    long countByExample(ColorsizeExample example);

    int deleteByExample(ColorsizeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Colorsize record);

    int insertSelective(Colorsize record);

    List<Colorsize> selectByExample(ColorsizeExample example);

    Colorsize selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Colorsize record, @Param("example") ColorsizeExample example);

    int updateByExample(@Param("record") Colorsize record, @Param("example") ColorsizeExample example);

    int updateByPrimaryKeySelective(Colorsize record);

    int updateByPrimaryKey(Colorsize record);
}