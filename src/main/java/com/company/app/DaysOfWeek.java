package com.company.app;

/**
 * Enum is stored a group of fixed values such as month, days, etc.
 * Enum type is known at compiler time but its value is known at runtime.
 *
 */
public enum DaysOfWeek {
        SUNDAY("sunday"),
        MONDAY("monday"),
        TUESDAY("tuesday"),
        WEDNESDAY("wednesday"),
        THURSDAY("thursday"),
        FRIDAY("friday"),
        SATURDAY("saturday");

        private final String value;
        DaysOfWeek(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

