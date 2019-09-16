package com.ptthuc77.gmail.unit3;

public class square extends Thread {
    int result;
    
    @Override
    public void run() {
        while (true) {
        	 try {
                 Thread.sleep(1000);
             } catch (InterruptedException ex) {
                 System.out.println(ex.toString());
             }
            result = (int) Math.pow(randomNumber.num, 2);
            System.out.println(randomNumber.num + " ^ 2 = " + result);
           
        }       
    }
}