package com.tw.academy.basic.$3_feature_envy.practiceOne;

import java.util.List;

public class Order {
    String customerName;
    String address;
    List<LineItem> lineItems;

    public Order(String customerName, String address, List<LineItem> lineItems) {
        this.customerName = customerName;
        this.address = address;
        this.lineItems = lineItems;
    }

    public double calculateTotalPrice() {
        return lineItems.stream()
                .mapToDouble(LineItem::calculateSubTotal)
                .sum();
    }

}
