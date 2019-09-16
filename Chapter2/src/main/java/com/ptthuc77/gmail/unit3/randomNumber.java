package com.ptthuc77.gmail.unit3;

import java.util.Random;

public class randomNumber extends Thread {
    Random rd = new Random();
    public static int num=0;
    
    @Override
    public void run() {
        while (true) {
        	try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                System.out.println(ex.toString());
            }
            num = 1 + rd.nextInt(20);
            System.out.println("The number random is: " + num);
            
            
        }
    }
}