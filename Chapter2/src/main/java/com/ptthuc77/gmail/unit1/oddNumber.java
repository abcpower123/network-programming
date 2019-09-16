package com.ptthuc77.gmail.unit1;

public class oddNumber extends Thread {
    int n;
    
    @Override
    public void run() {
        for (int i = 1; i < n; i += 2) {
            System.out.println("The odd number is: " + i);
        }
    }
}