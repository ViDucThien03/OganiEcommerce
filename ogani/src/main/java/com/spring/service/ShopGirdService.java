package com.spring.service;

import com.spring.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ShopGirdService {
    public List<Product> getAllProduct();
    public List<Product> getLastestProduct();
    public List<Product> getSaleProduct();

}
