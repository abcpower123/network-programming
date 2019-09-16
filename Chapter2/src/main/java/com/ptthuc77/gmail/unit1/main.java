package com.ptthuc77.gmail.unit1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int number;
        System.out.print("Input a number: ");
        number = cin.nextInt();
        oddNumber odd = new oddNumber();
        evenNumber even = new evenNumber();
        printNumber index = new printNumber();
        ascii asc = new ascii();
        odd.n = number;
        even.n = number;
        index.n = number;
        odd.start();
        even.start();
        index.start();
        asc.start();
    }
}