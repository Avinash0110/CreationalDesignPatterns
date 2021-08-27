package com.avinash.builder;



public class Customer {

    public static void main(String[] args) {


        //for vanilla ice cream
       System.out.println("Vanilla iceCream is being prepared with..");
        Vanilla vanilla = new IceCreamBuilder().setNoOfScoops(2).setToppings("Lemon and mint").getVanilla();
        System.out.println(vanilla);

        //for chocolate ice cream
        System.out.println("\n\n\nChocolate iceCream is being prepared with..");
        Chocolate chocolate=new IceCreamBuilder().setNoOfScoops(1).getChocolate();
        System.out.println(chocolate);
    }
}
