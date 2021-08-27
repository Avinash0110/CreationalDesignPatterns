package com.avinash.prototype;

public class English extends Language{
    public English()
    {
        this.language = "English";
    }

    @Override
    void addLanguage()
    {
        System.out.println("English language added");
    }
}
