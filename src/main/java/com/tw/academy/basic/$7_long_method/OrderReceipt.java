package com.tw.academy.basic.$7_long_method;

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

        double totalSalesTax = 0d;
        double totalAmountWithSalesTax = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            printedReceipt.append(lineItem.getDescription());
            printedReceipt.append('\t');
            printedReceipt.append(lineItem.getPrice());
            printedReceipt.append('\t');
            printedReceipt.append(lineItem.getQuantity());
            printedReceipt.append('\t');
            printedReceipt.append(lineItem.totalAmount());
            printedReceipt.append('\n');

            double salesTax = lineItem.totalAmount() * .10;
            totalSalesTax += salesTax;

            totalAmountWithSalesTax += lineItem.totalAmount() + salesTax;
        }

        printedReceipt.append("Sales Tax").append('\t').append(totalSalesTax);

        printedReceipt.append("Total Amount").append('\t').append(totalAmountWithSalesTax);
        return printedReceipt.toString();
    }
}