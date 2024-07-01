package com.spring.model;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MapperCheckout implements RowMapper<Checkout> {

    @Override
    public Checkout mapRow(ResultSet rs, int rowNum) throws SQLException {
        Checkout checkout = new Checkout();
        checkout.setCheckoutid(rs.getInt("checkoutid"));
        checkout.setFirstName(rs.getNString("fristname"));
        checkout.setLastName(rs.getNString("lastname"));
        checkout.setAddress(rs.getNString("address"));
        checkout.setPhone(rs.getString("phone"));
        checkout.setNote(rs.getNString("note"));
        checkout.setEmail(rs.getString("email"));
        checkout.setQuantity(rs.getInt("quantity"));
        checkout.setTotal(rs.getDouble("total"));
        checkout.setUserid(rs.getInt("userid"));
        return checkout;
    }
}
