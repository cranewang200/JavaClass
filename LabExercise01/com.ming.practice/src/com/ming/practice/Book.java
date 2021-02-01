package com.ming.practice;
/**
 * book entity class
 *Assessment: CST8116 311 Exercise 1
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, Jan. 22
 */

public class Book {
	
	//MVC Model ,Visual ,Controller,
	private String name;
	private String isbn;
	private double price;
	private int count;
	private boolean borrow;
	private int id;

	public Book() {	}
	
	public Book(String name) {
		this.setName(name);
	}
	
	public Book(String name, String isbn, double price, int count) {
		setCount(count);
		setIsbn(isbn);
		setName(name);
		setPrice(price);
		setBorrow(borrow);
	}
	
	
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isBorrow() {
		return borrow;
	}

	public void setBorrow(boolean borrow) {
		this.borrow = borrow;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price <= 0) {
			price = 1;
			
		}else 
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		if (count < 0) {
			count = 0;
		}else {
			this.count = count;
		}
		
	}
	
	
	

}
