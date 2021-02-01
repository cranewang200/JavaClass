package com.ming.practice;

import java.util.Scanner;

public class Circle {

	
	private double radius = 0;
	private double area = 0;
	private double perimeter = 0;
	

	
	public void inputRadius() {
		Scanner input = new Scanner(System.in);
		System.out.println("please input the radius");
		radius = input.nextDouble();
	}
	public void show() {
		if (radius == 0) {
			inputRadius();
		}
		area =  Math.pow(radius, 2)*Math.PI;
		perimeter =2* radius * Math.PI;
		System.out.println("area = " +area);
		System.out.println("perimeter = " + perimeter);
	}
	
	public Circle() {
		
	}
	

}
