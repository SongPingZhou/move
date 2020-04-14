package com.itheima.comtroller;

import com.itheima.entity.Lunbo;
import com.itheima.entity.LunboExample;
import com.itheima.mapper.LunboMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("lunbo")
public class LunBoController {


    @Autowired
    private LunboMapper lunboMapper;

    @RequestMapping("selectLunboAll")
    public List<Lunbo> selectLunboAll(){

        LunboExample example=new LunboExample();
        example.setDistinct(true);//设置过滤
        example.setOrderByClause("id asc");//根据id正序
        List<Lunbo> lunbos = lunboMapper.selectByExample(example);
        return  lunbos;
    }
}
