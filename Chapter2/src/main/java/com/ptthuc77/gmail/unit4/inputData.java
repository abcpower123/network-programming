package com.ptthuc77.gmail.unit4;

import java.util.Scanner;

public class inputData extends Thread {
    public static int a, b;
    Scanner cin = new Scanner(System.in);
    
    @Override
    public void run() {
        do {
            System.out.print("Input a: ");
            a = cin.nextInt();
            if (a <= 0) {
                System.out.println("Value a must be greater 0");
            } else {
                System.out.print("Input b: ");
                b = cin.nextInt();
                if (b <= a) {
                    System.out.println("Value b must be greater than value a");
                }
            }
        } while (a <= 0 || b <= a);
        synchronized (this) {
        	this.notifyAll(); //notify input process is done
        }
        
    }
}