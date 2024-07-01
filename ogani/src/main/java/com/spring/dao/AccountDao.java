package com.spring.dao;

import com.spring.model.MapperProduct;
import com.spring.model.MapperUser;
import com.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public int addAccount(User user){
        String sql = "INSERT INTO users (password, username) VALUES (?, ?)";
        int insert = jdbcTemplate.update(sql, user.getPassword(), user.getUserName());
        return insert;
    }
    public User getUser(User user){
        String sql = "SELECT * FROM users WHERE username = ?";
        User result = jdbcTemplate.queryForObject(sql, new Object[]{user.getUserName()}, new MapperUser());
        return result;
    }
}
