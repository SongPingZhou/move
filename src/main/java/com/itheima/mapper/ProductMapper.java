package com.itheima.mapper;

import java.util.List;

import com.itheima.entity.Product;
import com.itheima.entity.ProductExample;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    long countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    Product selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);



    //查询全部的商品列表
    List<Product> selectProductListAll(Integer page,Integer limit);

    //根据商品id查商品详情
    Product selectProductById(Integer pid);
}