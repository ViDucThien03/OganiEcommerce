package com.spring.service;

import com.spring.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface ProductDetailService {
    @Autowired
    public Product getProductDetail(int producid);
}
