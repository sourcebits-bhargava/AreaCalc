package com.example.AreaCalc;

public class Rectangle {
	protected double length;
	protected double width;

	public Rectangle(){
		
		this.length = 5.0;
		this.width = 4.0;
			
	/*Rectangle rectangle1 = new Rectangle();
	rectangle1.length = 5.0;
	rectangle1.width = 4.0;
	*/

	}
	public double getArea(){

		double area = length*width;
		return area;
		
	}


}
