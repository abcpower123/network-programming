package com.ptthuc77.gmail.unit4;

import java.util.ArrayList;
import java.util.Collections;

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
    	//use 2 thread to find
    	int distance=inputData.b-inputData.a;
    	Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				 for (int i = inputData.a; i < inputData.a+ distance/2; i++) {
			            if (checkPrime(i) == true) {
			            	synchronized (arr) {
			            		arr.add(i);
							}
			            }
			        }
			}
		});
    	Thread t2=new Thread(new Runnable() {
			@Override
			public void run() {
				 for (int i = inputData.a+distance/2; i <= inputData.b; i++) {
			            if (checkPrime(i) == true) {
			            	synchronized (arr) {
			            		arr.add(i);
							}
			            }
			        }
			}
		});
        t1.start();
        t2.start();
        try {	//wait for both threads are complete
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        //sort result, because 2 threads are doing paralel
        Collections.sort(arr);
        
        synchronized (this) {
            this.notifyAll();//notify find process is done
        }
    }
}