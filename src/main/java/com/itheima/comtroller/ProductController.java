package com.itheima.comtroller;

import com.itheima.entity.*;
import com.itheima.mapper.ColorsizeMapper;
import com.itheima.mapper.ProductMapper;
import com.itheima.mapper.ProductcommentMapper;
import com.itheima.mapper.ProductimageMapper;
import com.itheima.service.ProductService;
import com.itheima.util.Times;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("product")
public class ProductController {

    @RequestMapping("test")
    public String test(){
        return "ok";
    }

    @Autowired
    private ProductcommentMapper productcommentMapper;

    //加载评论
    @RequestMapping("getProductInfoId/{productid}/{pageindex}")
    public List<Productcomment> selectNewIdAll(@PathVariable("productid") Integer productid,
                                               @PathVariable("pageindex") Integer pageindex){
        Integer page=(pageindex-1)*10;
        Integer limit=10;
        List<Productcomment> productcomments = productcommentMapper.selectProductcommentByLimit(productid, page,limit);
        return productcomments;
    }

    //添加评论
    @RequestMapping("addProductcomment")
    public int addProductcomment(Productcomment productcomment){
        productcomment.setCommenttime(Times.getTime());
        int i = productcommentMapper.insertSelective(productcomment);
        return i;
    }



    @Autowired
    private ProductService productService;

    @RequestMapping("selectProductAll/{pageindex}")
    public List<Product> selectProductAll(@PathVariable("pageindex") Integer pageindex){
        Integer page=(pageindex-1)*6;
        Integer limit=6;
        List<Product> products = productService.selectProductAll(page,limit);
        return products;
    }

    @Autowired
    private ProductMapper productMapper;

    //根据id查商品详情
    @RequestMapping("selectProductById/{pid}")
    public Product selectProductById(@PathVariable Integer pid){
        Product product = productMapper.selectProductById(pid);
        return product;
    }

    //设置商品点击量+1
    @RequestMapping("addClick/{id}")
    public int addClick(@PathVariable Integer id){
        Product product = productMapper.selectByPrimaryKey(id);
        Integer click=Integer.parseInt(product.getClick())+1;
        product.setClick(click+"");

        int i = productMapper.updateByPrimaryKeySelective(product);
        return i;
    }

    //购物车查看（传过来的ids返回对应的商品信息）
    @RequestMapping("selectProduct/{ids}")
    public List<Product> selectProduct(@PathVariable String ids){
        List<Integer> collect = Arrays.stream(ids.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        ProductExample example=new ProductExample();
        example.createCriteria().andIdIn(collect);
        List<Product> products = productMapper.selectByExample(example);
        return products;
    }


    @Autowired
    private ColorsizeMapper colorsizeMapper;

    //查询全部的颜色名称和对应颜色的数量
    @RequestMapping("selectColorSizeByPid/{pid}")
    public List<Colorsize> selectColorSizeByPid(@PathVariable Integer pid){
        ColorsizeExample example=new ColorsizeExample();
        example.createCriteria().andPidEqualTo(pid);
        List<Colorsize> colorsizes = colorsizeMapper.selectByExample(example);
        return colorsizes;
    }


    @Autowired
    private ProductimageMapper productimageMapper;

    //根据商品的id查询商品的所有配图
    @RequestMapping("selectProductimageByPid/{pid}")
    public List<Productimage> selectProductimageByPid(@PathVariable Integer pid){
        ProductimageExample example=new ProductimageExample();
        example.createCriteria().andPidEqualTo(pid);
        List<Productimage> productimages = productimageMapper.selectByExample(example);

        //查询主图赋值过去
        Product product = productMapper.selectByPrimaryKey(pid);
        Productimage productimage=new Productimage();
        productimage.setId(0);
        productimage.setProductimageurl(product.getImgurl());
        productimages.add(0,productimage);
        return  productimages;
    }




}
