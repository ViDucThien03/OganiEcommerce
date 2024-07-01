package com.spring.service;

import com.spring.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductbyCateService {
    @Autowired
    public List<Product> getByCategory(String categoryid);
}
