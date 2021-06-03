package com.epam.test.automation.java.practice14.low;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class Task1 {

    public static List<String> filterByFirstAndLastCharacter(char symbol, List<String> stringList) {
        return stringList.stream()
                .filter(string -> string.startsWith(String.valueOf(symbol)) && string.endsWith(String.valueOf(symbol)) && string.length()>1)
                .collect(Collectors.toList());
    }
}
