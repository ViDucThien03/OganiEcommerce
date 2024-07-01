package com.spring.dao;

import com.spring.model.MapperProduct;
import com.spring.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ShopGirdDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Product> getAllProduct(){
        List<Product> list = new ArrayList<Product>();
        String sql = "select * from product";
        list = jdbcTemplate.query(sql,new MapperProduct());
        return list;
    }
    public List<Product> getLastestProduct(){
        List<Product> list = new ArrayList<Product>();
        String sql = "SELECT * FROM product WHERE updates >= DATE_SUB(NOW(), INTERVAL 3 DAY)";
        list = jdbcTemplate.query(sql, new MapperProduct());
        return list;
    }
    public List<Product> getSaleProduct(){
        List<Product> list = new ArrayList<Product>();
        String sql = "SELECT * FROM product WHERE sale IS NOT NULL";
        list = jdbcTemplate.query(sql, new MapperProduct());
        return list;
    }
}
