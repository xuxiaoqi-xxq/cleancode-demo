package com.tw.academy.basic.$5_data_clumps;

public class Order {

    private int orderNumber;

    private User user;

    public Order(int orderNumber, String buyerName, String buyerPhoneNumber, String buyerAddress) {
        this.orderNumber = orderNumber;

        this.setBuyerName(buyerName);
        this.setBuyerPhoneNumber(buyerPhoneNumber);
        this.setBuyerAddress(buyerAddress);
    }

    public String confirm(){
        return String.format("Please confirm buyer information: buyer name is %s, " +
                "buyer phone number is %s and buyer address is %s.", this.getBuyerName(), this.getBuyerPhoneNumber(), this.getBuyerAddress());
    }

    public String getBuyerName() {
        return this.user.getName();
    }

    public void setBuyerName(String buyerName) {
        this.user = new User(buyerName);
    }

    public String getBuyerPhoneNumber() {
        return this.user.getPhoneNumber();
    }

    public void setBuyerPhoneNumber(String buyerPhoneNumber) {
        this.user = new User(this.getBuyerName(), buyerPhoneNumber);
    }

    public String getBuyerAddress() {
        return this.user.getAddress();
    }

    public void setBuyerAddress(String buyerAddress) {
        this.user = new User(this.getBuyerName(), this.getBuyerPhoneNumber(), buyerAddress);
    }
}

