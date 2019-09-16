package com.ptthuc77.gmail.unit4;

public class main {
	
    public static void main(String[] args) throws InterruptedException {
        inputData input = new inputData();
        findPrime find = new findPrime();
        outputFile output = new outputFile();
        //main thread start input
        synchronized (input) {
            input.start();
            input.wait();
        }
        //wait thread input finished
        //start thread find
        synchronized (find) {
            find.start();
            find.wait();
        }
        output.start();
    }
}