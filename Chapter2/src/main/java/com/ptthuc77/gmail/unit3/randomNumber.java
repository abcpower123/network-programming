package com.ptthuc77.gmail.unit3;

import java.util.Random;

public class randomNumber extends Thread {
    Random rd = new Random();
    public static int num;
    
    @Override
    public void run() {
        while (true) {
            num = 1 + rd.nextInt(20);
            System.out.println("The number random is: " + num);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                System.out.println(ex.toString());
            }
        }
    }
}