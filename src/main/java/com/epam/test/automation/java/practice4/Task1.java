package com.epam.test.automation.java.practice4;

public class Task1 {
    
    
    public static boolean isSorted(int[] array, SortOrder order) {
        switch (order)
        {
            case ASC:
                for (int i = 1; i < array.length; i++)
                {
                    if (array[i] < array[i - 1])
                    {
                        return false;
                    }
                }
                break;
            case DESC:
                for (int i = 1; i < array.length; i++)
                {
                    if (array[i] > array[i - 1])
                    {
                        return false;
                    }
                }
                break;
        }
        return true;
    }
}
