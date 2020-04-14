package com.itheima.comtroller;

import com.itheima.entity.News;
import com.itheima.entity.NewsExample;
import com.itheima.entity.Newscomment;
import com.itheima.entity.NewscommentExample;
import com.itheima.mapper.NewsMapper;
import com.itheima.mapper.NewscommentMapper;
import com.itheima.util.Times;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("news")
public class NewsController {


    @Autowired
    private NewsMapper newsMapper;

    //获取全部新闻列表
    @RequestMapping("getNewsList")
    public List<News> getNewsList(){
        NewsExample example=new NewsExample();
        example.setDistinct(true);
        example.setOrderByClause(" id desc");
        List<News> news = newsMapper.selectByExample(example);
        return news;
    }

    //点击新闻列表点击量+1
    @RequestMapping("addClick/{newsid}")
    public int addClick(@PathVariable Integer newsid){
        News news = newsMapper.selectByPrimaryKey(newsid);
        news.setClick(news.getClick()+1);
        int i = newsMapper.updateByPrimaryKeySelective(news);
        return i;
    }

    //单个新闻
    @RequestMapping("getNewsInfoId/{id}")
    public News getNewsInfoId(@PathVariable Integer id){
        News news = newsMapper.selectByPrimaryKey(id);
        return news;
    }

    @Autowired
    private NewscommentMapper newscommentMapper;

    //加载评论
    @RequestMapping("getNewsInfoId/{newsid}/{pageindex}")
    public List<Newscomment> selectNewIdAll(@PathVariable("newsid") Integer newsid,
                                            @PathVariable("pageindex") Integer pageindex){
        Integer page=(pageindex-1)*10;
        Integer limit=10;
        List<Newscomment> newscomments = newscommentMapper.selectNewsCommentByLimit(newsid, page,limit);
        return newscomments;
    }

    //添加评论
    @RequestMapping("addNewComment")
    public int addNewComment(Newscomment newscomment){
        newscomment.setCommenttime(Times.getTime());
        int i = newscommentMapper.insertSelective(newscomment);
        return i;
    }


}
