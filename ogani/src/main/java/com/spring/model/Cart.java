package com.spring.model;

public class Cart {
    private Product product;
    private double totalPrice;
    private int quantity;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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

    public Cart() {
    }

    public Cart(Product product, double totalPrice, int quantity) {
        this.product = product;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
    }
}
