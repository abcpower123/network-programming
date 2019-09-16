package com.ptthuc77.gmail.unit5;

import java.util.ArrayList;

public class prime extends Thread {
    public static ArrayList arr = new ArrayList();
    
    private boolean checkPrime(int n) {
        if (n != 1) if (n == 2 || n == 3) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void run() {
        synchronized(this) {
            for (int i = 1; i <= 1000; i++) {
                if (checkPrime(i) == true) {
                    arr.add(i);
                }
            }
        }
    }
}