package com.example;

public class StringCompare {
    public boolean compareStr(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return true;
        } else if (str1.length() == str2.length()) {
            System.out.println("Equal strings length");
        }
        return true;
    }
}
