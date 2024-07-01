package com.spring.service;

import com.spring.model.Cart;

import java.util.HashMap;

public interface CartService {
    public HashMap<Integer, Cart> addCart(int producid, HashMap<Integer,Cart> cart);
    public HashMap<Integer,Cart> editCart(int producid,int quantity, HashMap<Integer,Cart> cart);
    public HashMap<Integer,Cart> deleteCart(int producid, HashMap<Integer,Cart> cart);
    public int totalQuantity(HashMap<Integer,Cart> cart);
    public double totalPrice(HashMap<Integer,Cart> cart);
}
