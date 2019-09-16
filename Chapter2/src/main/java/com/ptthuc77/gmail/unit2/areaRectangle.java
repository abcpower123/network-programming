package com.ptthuc77.gmail.unit2;

public class areaRectangle extends Thread {
    float width, height, area;
    
    @Override
    public void run() {
        area = width * height;
        System.out.println("The area of rectangle is: " + area);
    }
}