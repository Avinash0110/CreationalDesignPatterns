package com.avinash.builder;

public class Chocolate
{
    private String toppings;
    private int noOfScoops;

    public Chocolate(String toppings, int noOfScoops) {
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
