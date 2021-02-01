package com.ming.practice;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		

		
//		Circle circle = new Circle();
//		circle.inputRadius();
//		circle.show();
//		
//		CircleV2 circle = new CircleV2(5);
//		circle.show();
//		
		
		System.out.println("input:");
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		CircleV3 circle = new CircleV3(radius);
		circle.show();


	}

}
