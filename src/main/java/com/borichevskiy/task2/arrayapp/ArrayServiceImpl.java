package com.borichevskiy.task2.arrayapp;

public class ArrayServiceImpl implements ArrayService {

    @Override
    public int findMin(ArrayEntity array) {
        int min = array.getValues()[0];
        for (int val : array.getValues()) {
            if (val < min) min = val;
        }
        return min;
    }

    @Override
    public int findMax(ArrayEntity array) {
        int max = array.getValues()[0];
        for (int val : array.getValues()) {
            if (val > max) max = val;
        }
        return max;
    }

    @Override
    public int sum(ArrayEntity array) {
        int sum = 0;
        for (int val : array.getValues()) {
            sum += val;
        }
        return sum;
    }

    @Override
    public int[] sortBubble(ArrayEntity array) {
        int[] arr = array.getValues().clone();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    @Override
    public int[] sortSelection(ArrayEntity array) {
        int[] arr = array.getValues().clone();
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int tmp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = tmp;
        }
        return arr;
    }
}