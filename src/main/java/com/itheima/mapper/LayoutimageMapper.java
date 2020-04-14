package com.itheima.mapper;

import com.itheima.entity.Layoutimage;
import com.itheima.entity.LayoutimageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LayoutimageMapper {
    long countByExample(LayoutimageExample example);

    int deleteByExample(LayoutimageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Layoutimage record);

    int insertSelective(Layoutimage record);

    List<Layoutimage> selectByExample(LayoutimageExample example);

    Layoutimage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Layoutimage record, @Param("example") LayoutimageExample example);

    int updateByExample(@Param("record") Layoutimage record, @Param("example") LayoutimageExample example);

    int updateByPrimaryKeySelective(Layoutimage record);

    int updateByPrimaryKey(Layoutimage record);
}