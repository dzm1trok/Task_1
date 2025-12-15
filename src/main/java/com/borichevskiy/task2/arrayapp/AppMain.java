package com.borichevskiy.task2.arrayapp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class AppMain {
    private static final Logger logger = LogManager.getLogger(AppMain.class);

    public static void main(String[] args) {
        String path = "data/arrays.txt";

        List<int[]> arrays = FileReaderUtil.readArrays(path);
        ArrayService service = new ArrayServiceImpl();

        for (int[] arr : arrays) {
            try {
                ArrayEntity entity = ArrayFactory.createArray(arr);

                logger.info("Array: {}", java.util.Arrays.toString(entity.getValues()));
                logger.info("MIN: {}", service.findMin(entity));
                logger.info("MAx: {}", service.findMax(entity));
                logger.info("SUM: {}", service.sum(entity));
                logger.info("Bubble sort: {}", java.util.Arrays.toString(service.sortBubble(entity)));
                logger.info("Selection sort: {}", java.util.Arrays.toString(service.sortSelection(entity)));
            } catch (ArrayException e) {
                logger.error("Ошибка: {}", e.getMessage());
            }
        }
    }
}