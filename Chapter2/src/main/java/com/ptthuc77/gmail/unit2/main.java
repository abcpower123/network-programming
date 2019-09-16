package com.ptthuc77.gmail.unit2;

public class main {
    public static void main(String[] args) throws InterruptedException {
        inputRectangle data = new inputRectangle();
        perimeterRectangle peri = new perimeterRectangle();
        areaRectangle area = new areaRectangle();
        synchronized(data) {
            data.start();
            data.wait();
        }
        peri.width = data.width;
        peri.height = data.height;
        area.width = data.width;
        area.height = data.height;
        peri.start();
        area.start();
    }
}