package com.tdd;

public class Dollar {

    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public int times(int multiplier) {
        return this.amount * multiplier;
    }
}
