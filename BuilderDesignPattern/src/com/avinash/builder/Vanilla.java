package com.avinash.builder;

public class Vanilla
{
    private String toppings;
    private int noOfScoops;

    public Vanilla(String toppings, int noOfScoops) {
        this.toppings = toppings;
        this.noOfScoops = noOfScoops;
    }

    @Override
    public String toString() {
        return "{" +
                "toppings='" + toppings + '\'' +
                ", noOfScoops=" + noOfScoops +
                '}';
    }
}
