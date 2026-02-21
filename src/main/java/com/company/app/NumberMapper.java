package com.company.app;

public enum NumberMapper {
    ONE("one", 1),
    TWO("two", 2),
    THREE("three", 3);

    private final String word;
    private final int number;

    NumberMapper(String word, int number) {
        this.word = word;
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public int getNumber() {
        return number;
    }

    // Utility method: find enum by word
    public static NumberMapper fromWord(String word) {
        for (NumberMapper nm : values()) {
            if (nm.word.equalsIgnoreCase(word)) {
                return nm;
            }
        }
        return null;
    }

    // Utility method: find enum by number
    public static NumberMapper fromNumber(int num) {
        for (NumberMapper nm : values()) {
            if (nm.number == num) {
                return nm;
            }
        }
        return null;
    }
}
