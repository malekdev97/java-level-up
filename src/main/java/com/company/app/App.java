package com.company.app;

import java.util.*;

import static java.time.chrono.JapaneseEra.values;

public class App {
    public static void main(String[] args) {

        // Enum Lesson one
        DaysOfWeek sunday = DaysOfWeek.SUNDAY;

        if(sunday == DaysOfWeek.SUNDAY) {
            System.out.println("Sunday!");
        }

        System.out.println(DaysOfWeek.valueOf("FRIDAY"));
        System.out.println(DaysOfWeek.SUNDAY.ordinal());
        System.out.println(DaysOfWeek.MONDAY.name());
        System.out.println(Arrays.toString(DaysOfWeek.values()) );
        if(DaysOfWeek.values() instanceof Object[]) {
            System.out.println(Boolean.valueOf(true)); // ✅ true
        }
        if(DaysOfWeek.values() instanceof DaysOfWeek[])
            System.out.println(); // ✅ true

        // if (DaysOfWeek.values() instanceof String[]) { // compiler error type mismatch
           //  System.out.println(true); // ❌ false


        // if(DaysOfWeek.values() instanceof java.util.List) // compiler error type mismatch
            // System.out.println(true); // ❌ false

        for(DaysOfWeek day : DaysOfWeek.values()) {
            if(day == DaysOfWeek.FRIDAY || day == DaysOfWeek.SATURDAY)
                System.out.println("Weekend");
            }
        }

}