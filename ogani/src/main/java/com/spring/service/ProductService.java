package com.spring.service;



import com.spring.model.Category;
import com.spring.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {
    @Autowired
    public List<Category> getDataCategory();
    @Autowired
    public List<Product> getFeaturedProduct();
}
