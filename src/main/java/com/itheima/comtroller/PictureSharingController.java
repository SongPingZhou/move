package com.itheima.comtroller;

import com.itheima.entity.*;
import com.itheima.mapper.ImagecommentMapper;
import com.itheima.mapper.ImagesMapper;
import com.itheima.mapper.ImgcategoryMapper;
import com.itheima.mapper.LayoutimageMapper;
import com.itheima.util.Times;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("pictureSharing")
public class PictureSharingController {


    @Autowired
    private ImgcategoryMapper imgcategoryMapper;

    //查询全部图片类别名称
    @RequestMapping("selectImgCategoryAll")
    public List<Imgcategory> selectImgCategoryAll(){

        ImgcategoryExample example=new ImgcategoryExample();
        example.setDistinct(true);
        List<Imgcategory> imgcategories = imgcategoryMapper.selectByExample(example);
        return imgcategories;
    }

    @Autowired
    private ImagesMapper imagesMapper;
    //根据类别查询图片
    @RequestMapping("selectImagesByPid/{pid}")
    public List<Images> selectImagesByPid(@PathVariable Integer pid){
        ImagesExample example=new ImagesExample();
        example.setOrderByClause("id desc");
        if(pid!=0) {
            example.createCriteria().andPidEqualTo(pid);
        }
        List<Images> images = imagesMapper.selectByExample(example);
        return images;
    }

    //根据id查看图片详情
    @RequestMapping("selectImagesById/{id}")
    public Images selectImagesById(@PathVariable  Integer id){
        Images images = imagesMapper.selectByPrimaryKey(id);
        return images;
    }

    //点击新闻列表点击量+1
    @RequestMapping("addClick/{id}")
    public int addClick(@PathVariable Integer id){
        Images images  = imagesMapper.selectByPrimaryKey(id);
        images.setClick(images.getClick()+1);
        int i = imagesMapper.updateByPrimaryKeySelective(images);
        return i;
    }

    @Autowired
    private ImagecommentMapper imagecommentMapper;

    //加载图片评论
    @RequestMapping("getImagecomment/{imagesid}/{pageindex}")
    public List<Imagecomment> selectNewIdAll(@PathVariable("imagesid") Integer imagesid,
                                             @PathVariable("pageindex") Integer pageindex){
        Integer page=(pageindex-1)*10;
        Integer limit=10;
        List<Imagecomment> newscomments = imagecommentMapper.selectImagecommentByLimit(imagesid, page,limit);
        return newscomments;
    }

    //添加评论
    @RequestMapping("addImagecomment")
    public int addImagecomment(Imagecomment imagecomment){
        imagecomment.setCommenttime(Times.getTime());
        int i = imagecommentMapper.insertSelective(imagecomment);
        return i;
    }

    @Autowired
    private LayoutimageMapper layoutimageMapper;

    //加载图片页面的缩略图
    @RequestMapping("selectLayoutimageById/{id}")
    public List<Layoutimage> selectLayoutimageById(@PathVariable Integer id){
        Images images = imagesMapper.selectByPrimaryKey(id);
        LayoutimageExample example=new LayoutimageExample();
        example.createCriteria().andPidEqualTo(id);
        List<Layoutimage> layoutimages = layoutimageMapper.selectByExample(example);
        Layoutimage  layoutimage=new Layoutimage();
        layoutimage.setMsrc(images.getImgurl());
        layoutimage.setId(0);
        layoutimage.setTitle(images.getTitle());
        layoutimage.setPid(images.getId());
        layoutimages.add(0,layoutimage);
        return layoutimages;
    }
}
