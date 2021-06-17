package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    private Address to;
    private Address from;

    public DeliveryManager(Address from, Address to) {
        this.to = to;
        this.from = from;
    }

    public DeliverCenter allocate(){
        if (isSameCity()){
            return DeliverCenter.LOCAL;
        }
        if (isSameProvince()) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

    private boolean isSameProvince() {
        return getProvince(to.getAddress()).equals(getProvince(from.getAddress()));
    }

    private boolean isSameCity() {
        return isSameProvince() && getCity(to.getAddress()).equals(getCity(from.getAddress()));
    }

    private String getCity(String address) {
        return address.substring(address.indexOf("省") + 1, address.indexOf("市"));
    }

    private String getProvince(String address) {
        return address.substring(0, address.indexOf("省"));
    }
}
