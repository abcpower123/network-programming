package com.ptthuc77.gmail.unit2;

public class perimeterRectangle extends Thread {
    private float perimeter;
    private inputRectangle r;
    
    //constructor
    public perimeterRectangle(inputRectangle r) {
		this.r = r;
	}

	public float getPerimeter() {
		return perimeter;
	}


	@Override
    public void run() {
		//System.out.println("per start");
		synchronized (r) {
			try {
				r.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
//		System.out.println("per wait for data done");
			perimeter = (r.getWidth() + r.getHeight()) * 2;
			
    }
}