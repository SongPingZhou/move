package com.itheima.mapper;

import com.itheima.entity.Ordersdetails;
import com.itheima.entity.OrdersdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersdetailsMapper {
    long countByExample(OrdersdetailsExample example);

    int deleteByExample(OrdersdetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ordersdetails record);

    int insertSelective(Ordersdetails record);

    List<Ordersdetails> selectByExample(OrdersdetailsExample example);

    Ordersdetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ordersdetails record, @Param("example") OrdersdetailsExample example);

    int updateByExample(@Param("record") Ordersdetails record, @Param("example") OrdersdetailsExample example);

    int updateByPrimaryKeySelective(Ordersdetails record);

    int updateByPrimaryKey(Ordersdetails record);
}