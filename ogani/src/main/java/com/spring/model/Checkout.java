package com.spring.model;

public class Checkout {
    private int checkoutid;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String email;
    private String note;
    private int quantity;
    private double total;
    private double userid;
    public int getCheckoutid() {
        return checkoutid;
    }

    public void setCheckoutid(int checkoutid) {
        this.checkoutid = checkoutid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

    public double getUserid() {
        return userid;
    }

    public void setUserid(double userid) {
        this.userid = userid;
    }

    public Checkout() {
    }

    public Checkout(int checkoutid, String firstName, String lastName,
                    String address, String phone, String email, String note, int quantity, double total, double userid) {
        this.checkoutid = checkoutid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.note = note;
        this.quantity = quantity;
        this.total = total;
        this.userid = userid;
    }
}
