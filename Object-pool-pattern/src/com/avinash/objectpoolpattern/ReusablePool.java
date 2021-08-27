package com.avinash.objectpoolpattern;

public class ReusablePool extends Reusable{
    private int maxPoolSize=2,currentObject=1;
    public Reusable getInstance(){
        return new Reusable("Connection Instance:"+currentObject);
    }
    public void releaseInstance(){
        currentObject--;
    }
    public String acquireInstance(){
        String string;
        if(currentObject<=maxPoolSize) {
            string=  getInstance()+" "+currentObject;
            currentObject++;
        }
        else
            string= "Connection Object in Use...Wait until it is released by any of the client";
        return string;
    }
}
