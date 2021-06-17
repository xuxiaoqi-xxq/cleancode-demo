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
    public static final double SALES_TAX_RATE = .10;
    public static final String PRINTING_RECEIPT_HEADER = "======Printing Orders======\n";
    public static final String TOTAL_SALES_TAX_TITLE = "Sales Tax";
    public static final String TOTAL_AMOUNT_TITLE = "Total Amount";
    private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        return PRINTING_RECEIPT_HEADER +
                order.getCustomerName() +
                order.getCustomerAddress() +
                generatePrintedItemInfo(order.getLineItems());
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

            double salesTax = lineItem.totalAmount() * SALES_TAX_RATE;
            totalSalesTax += salesTax;

            totalAmountWithSalesTax += lineItem.totalAmount() + salesTax;
        }
        printedItemInfo.append(TOTAL_SALES_TAX_TITLE).append('\t').append(totalSalesTax);
        printedItemInfo.append(TOTAL_AMOUNT_TITLE).append('\t').append(totalAmountWithSalesTax);

        return printedItemInfo;
    }
}