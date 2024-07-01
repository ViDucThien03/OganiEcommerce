package com.spring.service;

import com.spring.dao.AccountDao;
import com.spring.model.User;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountDao accountDao;
    @Override
    public int addAccount(User user) {
        user.setPassword(BCrypt.hashpw(user.getPassword(),BCrypt.gensalt(12)));
        return accountDao.addAccount(user);
    }

    @Override
    public User checkAccount(User user) {
        String pass = user.getPassword();
        user = accountDao.getUser(user);
        if(user != null) {
            if (BCrypt.checkpw(pass, user.getPassword())) {
                return user;
            } else {
                return null;
            }
        }
        return null;
    }
}
