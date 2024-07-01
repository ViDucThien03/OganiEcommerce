package com.spring.service;

import com.spring.dao.CheckoutDao;
import com.spring.model.Cart;
import com.spring.model.Checkout;
import com.spring.model.CheckoutDetail;
import com.spring.model.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CheckoutServiceImpl implements CheckoutService{
    @Autowired
    private CheckoutDao checkoutDao;
    @Override
    public int addBill(Checkout checkout) {
        return checkoutDao.addBill(checkout);
    }

    @Override
    public void addBillDetail(HashMap<Integer,Cart> carts) {
        int checkoutid = checkoutDao.getIDLastBill();
        for(Map.Entry<Integer,Cart> itemCart: carts.entrySet()){
            CheckoutDetail detail = new CheckoutDetail();
            detail.setCheckoutid(checkoutid);
            detail.setProductid(itemCart.getValue().getProduct().getProductid());
            detail.setQuantity(itemCart.getValue().getQuantity());
            detail.setTotal(itemCart.getValue().getTotalPrice());
            checkoutDao.addBillDetail(detail);
        }

    }

    @Override
    public List<Checkout> getOrder(int userid) {
        return checkoutDao.getOrder(userid);
    }

    @Override
    public List<OrderDetail> getOrderDetail(int checkoutid) {
        return checkoutDao.getOrderDetail(checkoutid);
    }
}
