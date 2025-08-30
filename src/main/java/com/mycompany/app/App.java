package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Maven!");
        System.out.println("Arguments received:");
        for (String arg : args) {
            System.out.println("- " + arg);
        }
    }
}