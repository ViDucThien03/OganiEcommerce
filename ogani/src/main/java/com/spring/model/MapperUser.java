package com.spring.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MapperUser implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setId(rs.getInt("userid"));
        user.setUserName(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        user.setLastName(rs.getNString("lastname"));
        user.setFirstName(rs.getNString("fristname"));
        user.setAddress(rs.getNString("address"));
        user.setPhone(rs.getString("phone"));
        user.setEmail(rs.getString("email"));
        return user;
    }
}
