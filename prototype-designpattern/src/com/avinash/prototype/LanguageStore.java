package com.avinash.prototype;

import java.util.HashMap;
import java.util.Map;

public class LanguageStore {
    private static Map<String, Language> languageMap = new HashMap<String, Language>();

    static
    {
        languageMap.put("Telugu", new Telugu());
        languageMap.put("English", new English());
    }

    public static Language getLanguage(String LanguageName)
    {
        return (Language) languageMap.get(LanguageName).clone();
    }
}
