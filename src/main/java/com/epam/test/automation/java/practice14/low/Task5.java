package com.epam.test.automation.java.practice14.low;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class Task5 {

    public static List<String> getSortedAscOddValues(List<Integer> intList) {
        return intList.stream()
                    .filter(number -> number%2 != 0)
                    .map(number -> number.toString())
                    .sorted()
                    .collect(Collectors.toList());
    }
}
