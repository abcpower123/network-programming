package com.ptthuc77.gmail.unit4;

import static com.ptthuc77.gmail.unit4.findPrime.arr;
import java.io.FileOutputStream;
import java.io.IOException;

public class outputFile extends Thread {

    @Override
    public void run() {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("outfile.txt");
            String title = "The prime number from " + inputData.a + " to " + inputData.b + " is\n";
            out.write(title.getBytes());
            System.out.println("The prime number from " + inputData.a + " to " + inputData.b + " is");
            for(int i = 0; i < arr.size(); i++) {
                byte b[] = String.valueOf(arr.get(i) + " ").getBytes();
                out.write(b);
                System.out.print(arr.get(i) + " ");
            }
            out.close();
            System.out.println("\nWrite file success");
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                System.out.println(ex.toString());
            }
        }
    }
}