package com.spring.service;

import com.spring.dao.ShopGirdDao;
import com.spring.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopGirdServiceImpl implements ShopGirdService{
    @Autowired
    private ShopGirdDao shopGirdDao;
    @Override
    public List<Product> getAllProduct() {
        return shopGirdDao.getAllProduct();
    }

    @Override
    public List<Product> getLastestProduct() {
        return shopGirdDao.getLastestProduct();
    }

    @Override
    public List<Product> getSaleProduct() {
        return shopGirdDao.getSaleProduct();
    }
}
