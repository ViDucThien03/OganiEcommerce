package com.spring.model;

import java.util.Date;

public class Product {
    private int productid;
    private String productName;
    private double price;
    private String description;
    private int quantity;
    private String weight;
    private String image;
    private Date updates;
    private int categoryid;
    private double sale;
    private String title;

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getUpdates() {
        return updates;
    }

    public void setUpdates(Date updates) {
        this.updates = updates;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Product(int productid, String productName, double price, String description, int quantity, String weight, String image, Date updates, int categoryid, double sale, String title) {
        this.productid = productid;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.weight = weight;
        this.image = image;
        this.updates = updates;
        this.categoryid = categoryid;
        this.sale = sale;
        this.title = title;
    }

    public Product() {
    }
}
