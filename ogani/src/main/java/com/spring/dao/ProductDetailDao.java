package com.spring.dao;

import com.spring.model.MapperProduct;
import com.spring.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDetailDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Product getProducDetail(int producid) {
        String sql = "SELECT * FROM product WHERE producid = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{producid}, new MapperProduct());
    }
}
