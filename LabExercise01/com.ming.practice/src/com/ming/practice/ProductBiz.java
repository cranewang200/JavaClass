package com.ming.practice;

import javax.swing.JOptionPane;

/**
 * item manage class
 *Assessment: CST8116 311 Exercise 1
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, Jan. 22
 */
public class ProductBiz {
	
	public static void main(String[] args) {
		
	 {

		int[] counts = new int[3]; //item total inventory
		double total = 0; // total amount
		//improve method
		Product[] products = new Product[3];
 		for (int i = 0; i < counts.length; i++) {
 			if(products[i] == null) {
 					products[i] = new Product(); //对象数组里的元素使用之前，一定要分配空间
 			}
 		
			//Product product = new Product();
			String name = JOptionPane.showInputDialog("please input item name");
			products[i].setName(name);
			//receive price ,notice String input
			String strPrice = JOptionPane.showInputDialog("please input price");
			products[i].setPrice(Double.parseDouble(strPrice)); //need transfer String to Double 
			
			String strCount = JOptionPane.showInputDialog("please input number");
			counts[i] = Integer.parseInt(strCount);
			total += products[i].getPrice() * counts[i]	;
			
					}
		System.out.println("details of shopping:");
		for (int i = 0; i < products.length; i++) {
			System.out.println("item name:  "+products[i].getName() + "   item number:  "+counts[i] +"   total:  " + products[i].getPrice());
		}
System.out.println("total = " + total);
	}

}}
