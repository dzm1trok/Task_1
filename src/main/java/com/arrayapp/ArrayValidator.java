package com.arrayapp;

public class ArrayValidator {
    public static boolean isValid(int[] values) {
        return values != null && values.length > 0;
    }
}