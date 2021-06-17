package com.tw.academy.basic.$2_magic_number;

public class FareCalculation {

    public static final int CUMULATIVE_EXPENSE_100 = 100;
    public static final int CUMULATIVE_EXPENSE_150 = 150;
    public static final int CUMULATIVE_EXPENSE_400 = 400;
    public static final double DISCOUNT_HALF = 0.5;
    public static final double DISCOUNT_ = 0.8;

    public double calculate(double originalPrice, double cumulativeExpensesThisMonth) {
        if (cumulativeExpensesThisMonth >= CUMULATIVE_EXPENSE_100 && cumulativeExpensesThisMonth < CUMULATIVE_EXPENSE_150) {
            return originalPrice * DISCOUNT_;
        }
        if (cumulativeExpensesThisMonth >= CUMULATIVE_EXPENSE_150 && cumulativeExpensesThisMonth < CUMULATIVE_EXPENSE_400) {
            return originalPrice * DISCOUNT_HALF;
        }
        return originalPrice;
    }
}
