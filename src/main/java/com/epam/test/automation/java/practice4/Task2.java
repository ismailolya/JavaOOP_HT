package com.epam.test.automation.java.practice4;

public class Task2 {

    public static int[] transform(int[] array, SortOrder order) {
    boolean resultOrder = Task1.isSorted(array, order);
    int[] transformArray = new int[array.length];
    
    if(resultOrder == true){
        for (int i = 0; i < array.length; i++){
            transformArray[i] = array[i] + i;
        } return transformArray;
    } else return array;
    }
}
