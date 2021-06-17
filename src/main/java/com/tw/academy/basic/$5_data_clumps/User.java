package com.tw.academy.basic.$5_data_clumps;

public class User {

    private String name;
    private String phoneNumber;

    public User(String name) {
        this.name = name;
    }

    public User(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
