package com.spring.service;

import com.spring.dao.HomeDao;
import com.spring.model.Category;
import com.spring.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private HomeDao homeDao;
    @Override
    public List<Category> getDataCategory() {
        return homeDao.getDataCategory();
    }

    @Override
    public List<Product> getFeaturedProduct() {
        return homeDao.getFeaturedProduct();
    }
}
