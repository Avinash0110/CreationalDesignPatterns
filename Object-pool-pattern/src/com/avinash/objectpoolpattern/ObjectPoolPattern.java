package com.avinash.objectpoolpattern;

public class ObjectPoolPattern
{
    public static void main(String[] args) {

        Client client1=new Client();
        System.out.println("Client 1:"+client1.getObject());

        Client client2=new Client();
        System.out.println("Client 2:"+client2.getObject());

       client2.releaseObject();

        Client client3=new Client();
        System.out.println("Client 3:"+client3.getObject());


    }
}
