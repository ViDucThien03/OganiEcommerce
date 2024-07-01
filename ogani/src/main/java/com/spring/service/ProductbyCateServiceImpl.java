package com.spring.service;

import com.spring.dao.CategoryDao;
import com.spring.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductbyCateServiceImpl implements ProductbyCateService{
    @Autowired
    private CategoryDao categoryDao;
    @Override
    public List<Product> getByCategory(String categoryid) {
        return categoryDao.getByCategory(categoryid);
    }
}
