package com.avinash.prototype;

public class PrototypePattern {
    public static void main(String[] args) {

           Language object;
           // first time
           object = LanguageStore.getLanguage("Telugu");
           System.out.println(object);
           object.addLanguage();
           object = LanguageStore.getLanguage("English");
           System.out.println(object);
           object.addLanguage();

           //second time
           object = LanguageStore.getLanguage("Telugu");
           System.out.println(object);
           object.addLanguage();
           object = LanguageStore.getLanguage("English");
           System.out.println(object);
           object.addLanguage();

         
    }
}
