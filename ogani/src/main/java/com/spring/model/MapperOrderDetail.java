package com.spring.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MapperOrderDetail implements RowMapper<OrderDetail> {

    @Override
    public OrderDetail mapRow(ResultSet rs, int rowNum) throws SQLException {
        OrderDetail order = new OrderDetail();
        order.setProductName(rs.getNString("productname"));
        order.setTotalPrice(rs.getDouble("totalprice"));
        order.setQuantity(rs.getInt("quantity"));
        return order;
    }
}
