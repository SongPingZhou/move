package com.itheima.mapper;

import com.itheima.entity.User;
import com.itheima.entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);//简答的理解就是第一个对象是要修改的对象（如果某个属性为Null就忽略更新），第二哥个事查询条件对象
    //第一个参数 是要修改的部分值组成的对象，其中有些属性为null则表示该项不修改
    // 第二个参数 是一个对应的查询条件的类， 通过这个类可以实现 order by 和一部分的where 条件。
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);//和上面的区别是第一个对象的某一个属性为NULL的话也就是不传则就会更新为NULL

    int updateByPrimaryKeySelective(User record);//会对字段进行判断再更新(如果为Null就忽略更新)，

    int updateByPrimaryKey(User record);//对你注入的字段全部更新，将为空的字段在数据库中置为NULL

    User selectByUserNameAndPwd(String username,String pwd);//登录时根据用户名密码查询

}