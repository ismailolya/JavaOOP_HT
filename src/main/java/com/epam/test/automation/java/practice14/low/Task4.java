package com.epam.test.automation.java.practice14.low;

import java.util.List;

public class Task4 {

    public static List<String> filterAndSortByLastDigit(int number, List<String> stringList) {
        return stringList.stream()
                    .filter(string -> string.length() == number && Character.isDigit(string.charAt(string.length()-1)))
                    .sorted()
                    .collect(Collectors.toList());
    }
}