package com.spring.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MapperProduct implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product product = new Product();
        product.setProductid(rs.getInt("producid"));
        product.setProductName(rs.getNString("productname"));
        product.setPrice(rs.getDouble("price"));
        product.setDescription(rs.getNString("description"));
        product.setQuantity(rs.getInt("quantity"));
        product.setImage(rs.getString("image"));
        product.setWeight(rs.getString("weight"));
        product.setUpdates(rs.getDate("updates"));
        product.setCategoryid(rs.getInt("categoryid"));
        product.setSale(rs.getDouble("sale"));
        product.setTitle(rs.getNString("title"));
        return product;
    }
}
