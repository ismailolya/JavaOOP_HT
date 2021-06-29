package com.epam.test.automation.java.practice5;

/**
 * <summary>
 * Implement class according to description of task.
 * </summary>
 */
public class ArrayRectangles {
     private Rectangle [] arrayRectangles;

    public ArrayRectangles(int n) {
        this.arrayRectangles = new Rectangle[n];
    }

    public ArrayRectangles(Rectangle...array){
        this.arrayRectangles=array;
    }
    
    public boolean addRectangle(Rectangle rectangle) {
        for(int count = 0; count< arrayRectangles.length; count++){
            if(arrayRectangles[count]==null) {
                arrayRectangles[count] = rectangle;
                return true;
            }
        }
        return false;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public int numberMaxArea() {
       double maxArea = 0.0;
        int maxCount = 0;
        for (int i = 0; i < arrayRectangles.length&&arrayRectangles[i]!=null; i++) {
            if (arrayRectangles[i].area() > maxArea) {
                maxCount = i;
                maxArea = arrayRectangles[i].area();

            }
        }return maxCount;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public int numberMinPerimeter() {
       double minPerimeter = arrayRectangles[0].perimeter();
        int minCount = 0;
        for (int i = 0; i < arrayRectangles.length&&arrayRectangles[i]!=null; i++) {
            if(arrayRectangles[i].perimeter() < minPerimeter){
                minCount = i;
                minPerimeter = arrayRectangles[i].perimeter();
            }
        }return minCount;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public int numberSquares() {
         int count = 0;
        for (int i = 0; i < arrayRectangles.length&&arrayRectangles[i]!=null; i++) {
                if(arrayRectangles[i].isSquare())
                    count++;
        }return count;
    }

}
