package com.spring.service;

import com.spring.dao.CartDao;
import com.spring.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class CartServiceImpl implements CartService{
    @Autowired
    private CartDao cartDao = new CartDao();
    @Override
    public HashMap<Integer, Cart> addCart(int producid, HashMap<Integer, Cart> cart) {
        return cartDao.addCart(producid,cart);
    }

    @Override
    public HashMap<Integer, Cart> editCart(int producid, int quantity, HashMap<Integer, Cart> cart) {
        return cartDao.editCart(producid, quantity, cart);
    }

    @Override
    public HashMap<Integer, Cart> deleteCart(int producid, HashMap<Integer, Cart> cart) {
        return cartDao.deleteCart(producid, cart);
    }

    @Override
    public int totalQuantity(HashMap<Integer, Cart> cart) {
        return cartDao.totalQuantity(cart);
    }

    @Override
    public double totalPrice(HashMap<Integer, Cart> cart) {
        return cartDao.totalPrice(cart);
    }
}
