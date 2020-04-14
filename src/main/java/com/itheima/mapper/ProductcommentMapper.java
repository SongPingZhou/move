package com.itheima.mapper;

import com.itheima.entity.Productcomment;
import com.itheima.entity.ProductcommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductcommentMapper {
    long countByExample(ProductcommentExample example);

    int deleteByExample(ProductcommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Productcomment record);

    int insertSelective(Productcomment record);

    List<Productcomment> selectByExample(ProductcommentExample example);

    Productcomment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Productcomment record, @Param("example") ProductcommentExample example);

    int updateByExample(@Param("record") Productcomment record, @Param("example") ProductcommentExample example);

    int updateByPrimaryKeySelective(Productcomment record);

    int updateByPrimaryKey(Productcomment record);

    List<Productcomment> selectProductcommentByLimit(Integer productid, Integer page, Integer limit);
}