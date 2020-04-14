package com.itheima.mapper;

import com.itheima.entity.Imgcategory;
import com.itheima.entity.ImgcategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImgcategoryMapper {
    long countByExample(ImgcategoryExample example);

    int deleteByExample(ImgcategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Imgcategory record);

    int insertSelective(Imgcategory record);

    List<Imgcategory> selectByExample(ImgcategoryExample example);

    Imgcategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Imgcategory record, @Param("example") ImgcategoryExample example);

    int updateByExample(@Param("record") Imgcategory record, @Param("example") ImgcategoryExample example);

    int updateByPrimaryKeySelective(Imgcategory record);

    int updateByPrimaryKey(Imgcategory record);
}