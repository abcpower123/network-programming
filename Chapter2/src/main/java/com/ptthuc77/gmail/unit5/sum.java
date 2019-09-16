package com.ptthuc77.gmail.unit5;

import static com.ptthuc77.gmail.unit5.prime.arr;

public class sum extends Thread {
	private prime myprime; //get primes to wait
    public static int sumPrime = 0;
    //constructor
    
    public sum(prime p) {
    	this.myprime=p;
	}

	@Override
    public void run() {
    	synchronized(myprime) { //wait for prime release
    		try {
				myprime.wait();
				
			} catch (InterruptedException e) {
				e.printStackTrace(); 
			}
    	  }//finished get prime! ready to sum
    	
    		//calculate sum
    		for (int i = 0; i < prime.arr.size(); i++) {
                sumPrime +=  arr.get(i);
            }
        System.out.println("The sumary prime number from 1 to 1000 is: " + sumPrime);
    }
}