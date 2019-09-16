package com.ptthuc77.gmail.unit4;

public class main {
    public static void main(String[] args) throws InterruptedException {
        inputData input = new inputData();
        findPrime find = new findPrime();
        outputFile output = new outputFile();
        synchronized (input) {
            input.start();
            input.wait();
        }
        synchronized (find) {
            find.start();
        }
        output.start();
    }
}