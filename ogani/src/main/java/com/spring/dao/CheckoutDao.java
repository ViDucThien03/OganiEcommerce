package com.spring.dao;

import com.spring.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CheckoutDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public int addBill(Checkout checkout){
        String sql = "INSERT INTO checkout (fristname, lastname, email, address, phone, note,quantity,total,userid) VALUES (?, ?, ?, ?, ?,?,?,?,?)";
        return jdbcTemplate.update(sql, checkout.getFirstName(), checkout.getLastName(), checkout.getEmail(),
                checkout.getAddress(), checkout.getPhone(), checkout.getNote(),checkout.getQuantity(),checkout.getTotal(),checkout.getUserid());
    }
    public int getIDLastBill(){
        String sql = "select max(checkoutid) from checkout";
        int checkoutid = jdbcTemplate.queryForObject(sql,new Object[]{},Integer.class );
        return checkoutid;
    }
    public int addBillDetail(CheckoutDetail checkoutDetail){
        String sql = "INSERT INTO checkoutdetail (productid, checkoutid, quantity, totalprice) VALUES (?, ?, ?, ?)";
        int insert = jdbcTemplate.update(sql, checkoutDetail.getProductid(), checkoutDetail.getCheckoutid(),
                checkoutDetail.getQuantity(), checkoutDetail.getTotal());
        return insert;
    }
    public List<Checkout> getOrder(int userid){
        List<Checkout> list = new ArrayList<Checkout>();
        String sql = "select * from checkout where userid =?";
        list = jdbcTemplate.query(sql, new Object[]{userid}, new MapperCheckout());
        return list;
    }
    public List<OrderDetail>  getOrderDetail(int checkoutid){
        String sql = "select productname, totalprice, checkoutdetail.quantity from checkoutdetail inner join checkout on checkout.checkoutid = checkoutdetail.checkoutid inner join product on checkoutdetail.productid = product.producid where checkout.checkoutid=?";
        return jdbcTemplate.query(sql, new Object[]{checkoutid}, new MapperOrderDetail());
    }
}
