package com.borichevskiy.task2.arrayapp;

public class ArrayFactory {
    public static ArrayEntity createArray(int[] values) throws ArrayException {
        if (!ArrayValidator.isValid(values)) {
            throw new ArrayException("Not valid data");
        }
        return new ArrayEntity(values);
    }
}