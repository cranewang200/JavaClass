package com.ming.practice;

import java.util.Scanner;

public class Booktest {

	public static void main(String[] args) {
				
	String str; 
	System.out.println("Please input your name:");
	str = new Scanner(System.in).nextLine();
		
	System.out.println("Your name is " + str.toUpperCase().trim() + " in Upper Case");
	System.out.println("Your name has "+ str.trim().length() + " letters(include the space(s) between your name)");
	System.out.println("Program by Ming Wang");

	
	
	
	
//		Book book = new Book("老九君","333",24.33,50);
//		Book book = new Book();
//		BookBiz bookBiz = new BookBiz();
//		addBook();
//		bookBiz.addBook(book);
//		
//		bookBiz.showBook(book);
//		
//		bookBiz.addBook(book);
//		
//		bookBiz.showBook(book);
//		bookBiz.sellBook(book);
//		
//		System.out.println(book.getCount());
//		
		
		
				
				

	

}
}