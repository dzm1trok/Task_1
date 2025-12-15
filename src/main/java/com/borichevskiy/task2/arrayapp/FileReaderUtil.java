package com.borichevskiy.task2.arrayapp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReaderUtil {
    public static List<int[]> readArrays(String path) {
        List<int[]> arrays = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            for (String line : lines) {
                if (line.trim().isEmpty()) continue;
                try {
                    String[] parts = line.split("[; ,\\-]+");
                    int[] arr = new int[parts.length];
                    for (int i = 0; i < parts.length; i++) {
                        arr[i] = Integer.parseInt(parts[i]);
                    }
                    arrays.add(arr);
                } catch (NumberFormatException e) {
                    // некорректная строка — пропускаем
                }
            }
        } catch (IOException e) {
            System.err.println("ERROR reading file: " + e.getMessage());
        }
        return arrays;
    }
}