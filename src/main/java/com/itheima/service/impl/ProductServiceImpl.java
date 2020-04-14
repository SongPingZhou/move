package com.itheima.service.impl;

import com.itheima.entity.Product;
import com.itheima.mapper.ProductMapper;
import com.itheima.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> selectProductAll(Integer page, Integer limit) {
        List<Product> products = productMapper.selectProductListAll(page,limit);
        return products;
    }
}
