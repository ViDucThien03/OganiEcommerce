package com.spring.service;

import com.spring.model.*;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public interface CheckoutService {
    public int addBill(Checkout checkout);
    public void addBillDetail(HashMap<Integer, Cart> carts);
    public List<Checkout> getOrder(int userid);
    public List<OrderDetail> getOrderDetail(int checkoutid);

}
