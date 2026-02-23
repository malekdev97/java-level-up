package com.company.app;

import java.util.*;

import static java.time.chrono.JapaneseEra.values;

public class App {
    public static void main(String[] args) {


        String name = "joN";
        System.out.println(isLowerCase(name));
    }

    public static boolean isLowerCase(String str) {
        for(char c : str.toCharArray()) {
            if(!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}