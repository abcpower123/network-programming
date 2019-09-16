package com.ptthuc77.gmail.unit1;

public class ascii extends Thread {

    @Override
    public void run() {
        for (int i = 65; i < 91; i++) {
            int index = i - 64;
            char character = (char) i;
            System.out.println("Uppercase character " + index + " is: " + character);
        }
    }
}