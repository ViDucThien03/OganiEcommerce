package com.spring.service;

import com.spring.dao.ProductDetailDao;
import com.spring.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDetailServiceImpl implements  ProductDetailService{
    @Autowired
    private ProductDetailDao detailDao;
    @Override
    public Product getProductDetail(int producid) {
        return detailDao.getProducDetail(producid);
    }
}
