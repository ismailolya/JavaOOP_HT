package com.epam.test.automation.java.practice3;

public class Main {

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int[] task1(int[] array)  {
         
         int temp;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] % 2 == 0 && array[array.length - 1 - i] % 2 == 0) {
                temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        }
        return array;
    }

    
    public static int task2(int[] array) {
        
        int max = array[0];
        int maxi = 0;
        int distance = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxi = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                distance = i - maxi;
            }
        }
        return distance;
    }

   
    public static int[][] task3(int[][] matrix) {
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i > j)
                    matrix[i][j] = 0;
                else if (i < j)
                    matrix[i][j] = 1;
            }
        }
        return matrix;
    }

}
