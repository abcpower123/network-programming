package com.ptthuc77.gmail.unit2;

public class perimeterRectangle extends Thread {
    float width, height, perimeter;
    
    @Override
    public void run() {
        perimeter = (width + height) * 2;
        System.out.println("The perimeter of rectangle is: " + perimeter);
    }
}