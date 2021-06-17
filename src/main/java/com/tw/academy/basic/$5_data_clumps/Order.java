package com.tw.academy.basic.$5_data_clumps;

public class Order {

    private final User user;
    private int orderNumber;

    public Order(int orderNumber, User user) {
        this.orderNumber = orderNumber;

        this.user = user;
    }

    public String confirm(){
        return String.format("Please confirm buyer information: buyer name is %s, " +
                "buyer phone number is %s and buyer address is %s.", this.user.getName(), this.user.getPhoneNumber(), this.user.getAddress());
    }
}

