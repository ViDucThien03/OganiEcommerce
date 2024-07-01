package com.spring.model;

public class OrderDetail {
    private String productName;
    private double totalPrice;
    private int quantity;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public OrderDetail() {
    }

    public OrderDetail(String productName, double totalPrice, int quantity) {
        this.productName = productName;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
    }
}
