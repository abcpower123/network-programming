package com.ptthuc77.gmail.unit1;

public class printNumber extends Thread {
    int n;
    
    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println("The number less than " + n + " is: " + i);
        }
    }
}