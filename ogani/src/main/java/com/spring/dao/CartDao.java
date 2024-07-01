package com.spring.dao;

import com.spring.model.Cart;
import com.spring.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CartDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    ProductDetailDao detailDao = new ProductDetailDao();

    public HashMap<Integer,Cart> addCart(int producid, HashMap<Integer,Cart> cart){
        Cart cartItem = new Cart();
        Product product = detailDao.getProducDetail(producid);
        if(product != null && cart.containsKey(producid)){
            cartItem = cart.get(producid);
            cartItem.setQuantity(cartItem.getQuantity()+1);
            cartItem.setTotalPrice(cartItem.getQuantity() * cartItem.getProduct().getPrice());

        }
        else {
            cartItem.setProduct(product);
            //int quantity = product.getQuantity();
            cartItem.setQuantity(1);
            cartItem.setTotalPrice(product.getPrice());
        }
        cart.put(producid, cartItem);
        return cart;
    }
    public HashMap<Integer,Cart> editCart(int producid,int quantity, HashMap<Integer,Cart> cart){
        if(cart == null){
            return cart;
        }
        Product product = detailDao.getProducDetail(producid);
        Cart cartItem = new Cart();
        if (cart.containsKey(producid)){
            cartItem = cart.get(producid);
            cartItem.setQuantity(quantity);
            double totalPrice = quantity * cartItem.getProduct().getPrice();
            cartItem.setTotalPrice(totalPrice);
        }

        cart.put(producid, cartItem);
        return cart;
    }
    public HashMap<Integer,Cart> deleteCart(int producid, HashMap<Integer,Cart> cart){
        if(cart == null){
            return cart;
        }
        if(cart.containsKey(producid)){
            cart.remove(producid);
        }
        return cart;
    }
    public int totalQuantity(HashMap<Integer,Cart> cart){
        int totalQuantities = 0;
        for(Map.Entry<Integer,Cart> cartItem : cart.entrySet()){
            totalQuantities += cartItem.getValue().getQuantity();
        }
        return totalQuantities;
    }
    public double totalPrice(HashMap<Integer,Cart> cart){
        double totalPrices = 0;
        for(Map.Entry<Integer,Cart> cartItem : cart.entrySet()){
            totalPrices += cartItem.getValue().getTotalPrice();
        }
        return totalPrices;
    }
}
