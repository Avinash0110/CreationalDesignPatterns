package com.avinash.objectpoolpattern;

public class Client
{
    private static final ReusablePool reusablePool;
    static {
        reusablePool=new ReusablePool();
    }
    public String getObject(){
        return reusablePool.acquireInstance();
    }
    public void releaseObject(){
        reusablePool.releaseInstance();
    }
}
