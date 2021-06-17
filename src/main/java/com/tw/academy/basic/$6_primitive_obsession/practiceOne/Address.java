package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class Address {

    String address;

    public Address(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return this.getAddress().substring(address.indexOf("省") + 1, address.indexOf("市"));
    }

    public String getProvince() {
        return this.getAddress().substring(0, address.indexOf("省"));
    }
}
