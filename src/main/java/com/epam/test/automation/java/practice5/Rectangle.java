package com.epam.test.automation.java.practice5;

public class Rectangle {
    
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(double a) {
        this.a = a;
        this.b = 5;
    }

    public Rectangle() {
        this.a = 4;
        this.b = 3;
    }

    
    public double getSideA() {
       return a;
    }


    public double getSideB() {
        return b;
    }

    
    public double area() {
         return a * b;
    }

    
    public double perimeter() {
        return 2 * (a + b);
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public boolean isSquare() {
        if (a == b)
            return true;
        else return false;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public void replaceSides() {
        double temp = a;
        a = b;
        b = temp;
    }

}
