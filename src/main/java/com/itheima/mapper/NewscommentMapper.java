package com.itheima.mapper;

import com.itheima.entity.Newscomment;
import com.itheima.entity.NewscommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewscommentMapper {
    long countByExample(NewscommentExample example);

    int deleteByExample(NewscommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Newscomment record);

    int insertSelective(Newscomment record);

    List<Newscomment> selectByExample(NewscommentExample example);

    Newscomment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Newscomment record, @Param("example") NewscommentExample example);

    int updateByExample(@Param("record") Newscomment record, @Param("example") NewscommentExample example);

    int updateByPrimaryKeySelective(Newscomment record);

    int updateByPrimaryKey(Newscomment record);

    /**
     * 分页查询数据
     * @return
     */
    List<Newscomment> selectNewsCommentByLimit(Integer newsid,Integer page,Integer limit);
}