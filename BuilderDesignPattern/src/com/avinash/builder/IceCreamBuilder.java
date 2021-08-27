package com.avinash.builder;

public class IceCreamBuilder
{
    private String toppings;
    private int noOfScoops;



    public IceCreamBuilder setToppings(String toppings) {
        this.toppings = toppings;
        return this;
    }

    public IceCreamBuilder setNoOfScoops(int noOfScoops) {
        this.noOfScoops = noOfScoops;
        return this;
    }

    public Vanilla getVanilla()
    {
        return new Vanilla(toppings,noOfScoops);
    }

    public Chocolate getChocolate()
    {
        return new Chocolate(toppings,noOfScoops);
    }
}
