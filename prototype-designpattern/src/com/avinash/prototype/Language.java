package com.avinash.prototype;

abstract class Language implements Cloneable{

    protected String language;

    abstract void addLanguage();

    public Object clone()
    {
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }
}

