package com.spring.dao;

import com.spring.model.Category;
import com.spring.model.MapperProduct;
import com.spring.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class CategoryDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Product> getByCategory(String categoryid){

        String sql = "SELECT * FROM product WHERE categoryid = ?";
        return jdbcTemplate.query(sql, new Object[]{categoryid}, new MapperProduct());
    }
}
