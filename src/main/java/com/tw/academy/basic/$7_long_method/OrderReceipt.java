package com.tw.academy.basic.$7_long_method;

import java.util.List;

/**
 * This class is a example for bad smell;
 *
 * @author  Thoughtworks
 * @version 1.0
 * @since   2018-1-1
 */
public class OrderReceipt {
    private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    //todo: rename -- Tom
    public String printReceipt() {
        StringBuilder printedReceipt = new StringBuilder();

        printedReceipt.append("======Printing Orders======\n");
        printedReceipt.append(order.getCustomerName());
        printedReceipt.append(order.getCustomerAddress());
        printedReceipt.append(generatePrintedItemInfo(order.getLineItems()));

        return printedReceipt.toString();
    }

    private StringBuilder generatePrintedItemInfo(List<LineItem> lineItems) {
        StringBuilder printedItemInfo = new StringBuilder();
        double totalSalesTax = 0d;
        double totalAmountWithSalesTax = 0d;
        for (LineItem lineItem : lineItems) {
            printedItemInfo.append(lineItem.getDescription());
            printedItemInfo.append('\t');
            printedItemInfo.append(lineItem.getPrice());
            printedItemInfo.append('\t');
            printedItemInfo.append(lineItem.getQuantity());
            printedItemInfo.append('\t');
            printedItemInfo.append(lineItem.totalAmount());
            printedItemInfo.append('\n');

            double salesTax = lineItem.totalAmount() * .10;
            totalSalesTax += salesTax;

            totalAmountWithSalesTax += lineItem.totalAmount() + salesTax;
        }
        printedItemInfo.append("Sales Tax").append('\t').append(totalSalesTax);
        printedItemInfo.append("Total Amount").append('\t').append(totalAmountWithSalesTax);

        return printedItemInfo;
    }
}