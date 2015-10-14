package com.example.AreaCalc;

import android.util.Log;

public class Shape {
	//protected double area;
	//protected double getArea;
	public double area;

	/**
	 * 
	 */
	public static void main(){
		
	//public static void main(String[] args) {
		
	circle circle1= new circle();
	circle1.getArea();
	Log.i("area of cirlce","String.valueOf(circle1.getArea())");

	cube cube1= new cube();
	cube1.getArea();
	System.out.println("area of cube" +cube1.getArea());

	Rectangle rectangle1= new Rectangle();
	rectangle1.getArea();
	System.out.println("area of rectangle"+rectangle1.getArea());

	square square1= new square();
	square1.getArea();
	System.out.println("area of square" +square1.getArea());

	triangle triangle1= new triangle();

	triangle1.getArea();

	System.out.println("area of triangle" +triangle1.getArea());

	}
}

	
