package com.spring.dao;

import com.spring.model.Category;
import com.spring.model.MapperCategory;
import com.spring.model.MapperProduct;
import com.spring.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HomeDao {
    @Autowired
    public JdbcTemplate jdbcTemplate;
    public List<Category> getDataCategory(){
        List<Category> list = new ArrayList<Category>();
        String sql = "select * from category";
        list = jdbcTemplate.query(sql, new MapperCategory());
        return list;
    }
    public List<Product> getFeaturedProduct(){
        List<Product> listFeaturedProduct = new ArrayList<Product>();
        String sql = "select * from product order by rand() limit 8";
        listFeaturedProduct = jdbcTemplate.query(sql, new MapperProduct());
        return listFeaturedProduct;
    }
}
