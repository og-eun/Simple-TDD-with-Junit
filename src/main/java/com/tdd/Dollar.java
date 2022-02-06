package com.tdd;

public class Dollar {

    public int amount = 10;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public int times(int multiplier) {
        return this.amount * multiplier;
    }
}
