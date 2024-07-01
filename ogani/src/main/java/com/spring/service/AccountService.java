package com.spring.service;

import com.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {
    @Autowired
    public int addAccount(User user);
    public User checkAccount(User user);

}
