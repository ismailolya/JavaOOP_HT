package com.epam.test.automation.java.practice14.low;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class Task3 {

    public static List<String> getListExtremeLetters(List<String> list) {
        return list.stream()
                    .map(string -> String.valueOf(string.charAt(0)).concat(String.valueOf(string.charAt(string.length()-1))))
                    .collect(Collectors.toList());
    }
}
