package com.spring.model;

public class CheckoutDetail {
    private int id;
    private int productid;
    private int checkoutid;
    private int quantity;
    private double total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getCheckoutid() {
        return checkoutid;
    }

    public void setCheckoutid(int checkoutid) {
        this.checkoutid = checkoutid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public CheckoutDetail() {
    }

    public CheckoutDetail(int id, int productid, int checkoutid, int quantity, double total) {
        this.id = id;
        this.productid = productid;
        this.checkoutid = checkoutid;
        this.quantity = quantity;
        this.total = total;
    }
}
