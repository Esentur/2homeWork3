package com.company;

public class LimitException extends Exception {
    private double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
        System.out.println("Остаток на балансе: "+getRemainingAmount());
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}
