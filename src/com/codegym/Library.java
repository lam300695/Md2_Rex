package com.codegym;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Library {
    public static void main(String[] args) {
        String [] fullName = { "Nguyen Tung Lam", "Le Manh Hung", "Nguyen van Nam", "Le van Tuan"};
        String regex = ".*N.*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        for (int i = 0; i < fullName.length; i++){
            matcher = pattern.matcher(fullName[i]);
            if (matcher.find()){
                System.out.println(fullName[i]);
            }
        }
    }
}
