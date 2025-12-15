package com.borichevskiy.task2.arrayapp;

public interface ArrayService {
    int findMin(ArrayEntity array);
    int findMax(ArrayEntity array);
    int sum(ArrayEntity array);
    int[] sortBubble(ArrayEntity array);
    int[] sortSelection(ArrayEntity array);
}