package com.example.AreaCalc;

public class triangle {
	protected double base;
	protected double height;
	
	public triangle(){
		this.base=8.0;
		this.height=4.0;
	}
	
	
	/*triangle traingle1= new traingle ()
	 * 
	 */
	public double getArea(){
		
		double area = 0.5 * (base)*(height);
		return area;
	}


}
