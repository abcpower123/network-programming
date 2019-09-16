package com.ptthuc77.gmail.unit1;

public class evenNumber extends Thread {
    int n;
    
    @Override
    public void run() {
        for (int i = 0; i < n; i += 2) {
            System.out.println("The even number is: " + i);
        }
    }
    
}