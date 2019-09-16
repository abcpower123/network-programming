package com.ptthuc77.gmail.unit4;

import java.util.ArrayList;

public class findPrime extends Thread {
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
        } else {
            return false;
        }
        return true;
    }
    
    @Override
    public void run() {
        for (int i = inputData.a; i <= inputData.b; i++) {
            if (checkPrime(i) == true) {
                arr.add(i);
            }
        }
    }
}