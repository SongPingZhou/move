package com.itheima.mapper;

import com.itheima.entity.Imagecomment;
import com.itheima.entity.ImagecommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImagecommentMapper {
    long countByExample(ImagecommentExample example);

    int deleteByExample(ImagecommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Imagecomment record);

    int insertSelective(Imagecomment record);

    List<Imagecomment> selectByExample(ImagecommentExample example);

    Imagecomment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Imagecomment record, @Param("example") ImagecommentExample example);

    int updateByExample(@Param("record") Imagecomment record, @Param("example") ImagecommentExample example);

    int updateByPrimaryKeySelective(Imagecomment record);

    int updateByPrimaryKey(Imagecomment record);

    List<Imagecomment> selectImagecommentByLimit(Integer imagesid, Integer page, Integer limit);
}