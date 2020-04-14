package com.itheima.service;

import com.itheima.entity.Product;

import java.util.List;

public interface ProductService {
    /**
     * 展示全部商品
     * @return
     */
    List<Product> selectProductAll(Integer page, Integer limit);
}
