package com.ming.practice;



public class CircleV3 {

	private double radius = 0;
	private double area = 0;
	private double perimeter = 0;
	
	
	
	
	public CircleV3() {
		}

	
	
	public CircleV3(double radius) {
		this.radius = radius;
	}



	public double getRadius() {
		return radius;
	}
	
	public void SetRadius(double radius) {
		if (radius <= 0) { //verify input
			radius = 1;			
		}else {
		this.radius = radius;
		}
	}

	public double getArea() {
		area =  Math.pow(radius, 2)*Math.PI;
		return area;
	}



	public double getPerimeter() {
		perimeter =2* radius * Math.PI;
		return perimeter;
	}

	public void show() {
		
		area =  Math.pow(radius, 2)*Math.PI;
		perimeter =2* radius * Math.PI;
		System.out.println("area = " +area);
		System.out.println("perimeter = " + perimeter);
	}


	
	
}
