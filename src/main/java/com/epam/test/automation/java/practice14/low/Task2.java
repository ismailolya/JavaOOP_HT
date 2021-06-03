package com.epam.test.automation.java.practice14.low;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class Task2 {
    public static List<Integer> sortAscLengthsOfStrings(List<String> stringList) {
        return stringList.stream()
                    .map(string -> string.length())
                    .sorted()
                    .collect(Collectors.toList());
    }
}
