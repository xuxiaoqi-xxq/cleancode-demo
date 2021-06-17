package com.tw.academy.basic.$3_feature_envy.practiceOne;

import java.util.List;

public class OrderService {

    public double calculateTotalPrice(List<LineItem> lineItems) {
        return lineItems.stream()
                .mapToDouble(LineItem::calculateSubTotal)
                .sum();
    }
}
