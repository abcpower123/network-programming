package com.ptthuc77.gmail.unit2;

import java.util.Scanner;

public class inputRectangle extends Thread {
    Scanner cin = new Scanner(System.in);
    private float width, height;
    
    @Override
    public void run() {
        System.out.print("Input value width: ");
        width = cin.nextFloat();
        System.out.print("Input value height: ");
        height = cin.nextInt();
        synchronized (this) {
        	this.notifyAll();			
		}
        
    }

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
}