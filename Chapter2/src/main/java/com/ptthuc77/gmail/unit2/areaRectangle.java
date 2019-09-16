package com.ptthuc77.gmail.unit2;

public class areaRectangle extends Thread {
    private float  area;
    private inputRectangle r;
    
   
    
    @Override
    public void run() {
//    	System.out.println("area start");
    	synchronized (r) {
    		try {
				r.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
//    	System.out.println("area wait for data done");
    	area = r.getWidth() * r.getHeight();
    	
    }
    //constructor
	public areaRectangle(inputRectangle r) {
		
		this.r = r;
	}
	//getter
	public float getArea() {
		return area;
	}
	
}