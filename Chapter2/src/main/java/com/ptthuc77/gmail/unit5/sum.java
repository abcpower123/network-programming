package com.ptthuc77.gmail.unit5;

import static com.ptthuc77.gmail.unit5.prime.arr;

public class sum extends Thread {
    public static int sumPrime = 0;
    @Override
    public void run() {
        for (int i = 0; i < prime.arr.size(); i++) {
            sumPrime += (int) arr.get(i);
        }
        System.out.println("The sumary prime number from 1 to 1000 is: " + sumPrime);
    }
}