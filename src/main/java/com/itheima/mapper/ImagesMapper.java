package com.itheima.mapper;

import com.itheima.entity.Images;
import com.itheima.entity.ImagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImagesMapper {
    long countByExample(ImagesExample example);

    int deleteByExample(ImagesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Images record);

    int insertSelective(Images record);

    List<Images> selectByExample(ImagesExample example);

    Images selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Images record, @Param("example") ImagesExample example);

    int updateByExample(@Param("record") Images record, @Param("example") ImagesExample example);

    int updateByPrimaryKeySelective(Images record);

    int updateByPrimaryKey(Images record);
}