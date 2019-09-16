package com.ptthuc77.gmail.unit2;

public class main {
    public static void main(String[] args) throws InterruptedException {
        inputRectangle data = new inputRectangle();
        perimeterRectangle peri = new perimeterRectangle(data);
        areaRectangle area = new areaRectangle(data);
        
        data.start();
        peri.start();
        area.start();

        //wait for both thread is complete:
        peri.join();
        area.join();
        //print result
        System.out.println("The perimeter of rectangle is: " + peri.getPerimeter());
        System.out.println("The area of rectangle is: " + area.getArea());
    }
}