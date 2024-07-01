package com.spring.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MapperCheckoutDetail implements RowMapper<CheckoutDetail> {
    @Override
    public CheckoutDetail mapRow(ResultSet rs, int rowNum) throws SQLException {
        CheckoutDetail detail = new CheckoutDetail();
        detail.setId(rs.getInt("id"));
        detail.setCheckoutid(rs.getInt("checkoutid"));
        detail.setProductid(rs.getInt("productid"));
        detail.setQuantity(rs.getInt("quantity"));
        detail.setTotal(rs.getDouble("totalprice"));
        return detail;
    }
}
