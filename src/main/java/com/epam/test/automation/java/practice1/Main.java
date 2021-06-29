package com.epam.test.automation.java.practice1;

public class Main {

    
    public static int task1(int n) {
        
    if (n > 0)
        return n*n;
        else if (n < 0)
        return Math.abs(n);
        return n;
    }
    
    
    
    public static int task2(int n) {
        
        
        int a = n % 10;
        int b = (n/10)%10;
        int c = (n/100)%10;
        int max = Math.max(Math.max(a,b),c);
        int min = Math.min(Math.min(a,b),c);
        int middle = (a + b + c) - min - max;
        
        return (max*100 + middle*10 + min);
      }

}
