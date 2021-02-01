package com.ming.practice;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Book bussiness class, add ,delete, modify, search
 *Assessment: CST8116 311 Exercise 1
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, Jan. 22
 */
public class BookBiz {
	/**'
	 * sell book 
	 * @param book  the book want to sell
	 * @return if sell sucess return numbers, if faild return -1
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	public int sellBook(Book book) {
		
		//1. judge the count > 1
		//2. book number -1
		//3 return number
		if (!(book.getCount()> 1 )) {
			return -1;
		}
		book.setCount(book.getCount() - 1);
		return 1;
	}
	
	public void addBook(Book book) {
		
		book.setName(JOptionPane.showInputDialog("please input book name:"));
		String str1 = JOptionPane.showInputDialog("please input numbers of book:");
		book.setCount(Integer.parseInt(str1));
		book.setIsbn(JOptionPane.showInputDialog("please input isbn number"));
		book.setPrice(Double.parseDouble(JOptionPane.showInputDialog("please input the price:")));
		book.setId(book.getId() + 1);
		
		
		
	}
	
	public void showBook(Book book) {
		System.out.println(book.getName());
		System.out.println(book.getIsbn());
		System.out.println(book.getCount());
		System.out.println(book.getPrice());
		System.out.println(book.getId());
	}
	
	public void printMenu() {
		
		System.out.println("欢迎...");
		System.out.println("增加图书...1");
		System.out.println("删除图书...2");
		System.out.println("修改图书...3");
		System.out.println("查询图书...4");
		System.out.println("退出系统...5");
		
	}
	
	
	public mainChoice() {
		
   Scanner scan = new Scanner(System.in);
		
		printMenu();
		
		while(true)
		{
			//读取用户输入
			int choice = scan.nextInt();
			
			if(choice == 5)
			{
				System.out.println("成功退出系统，欢迎再次光临！");
				break;
			}
			switch(choice)//switch形式
			{
			case 1: addBook(); break;
			case 2: deleteBoo(); break;
			case 3: changeBoo(); break;
			case 4: findBoo(); break;
			default: System.out.println("输入非法"); printMenu(); continue;//这个continue 是continue的while，
			}

		
	}
	}
//	public void addBook(Book[] book) {
//		
//		
//		
////		for (int i = 0; i < book.length; i++) {
//			book[i] = new Book();
//			book[i].setName(JOptionPane.showInputDialog("please input book name:"));
//			String str1 = JOptionPane.showInputDialog("please input numbers of book:");
//			book[i].setCount(Integer.parseInt(str1));
//			book[i].setIsbn(JOptionPane.showInputDialog("please input isbn number"));
//			book[i].setPrice(Double.parseDouble(JOptionPane.showInputDialog("please input the price:")));
//			book[i].setId(book[i].getId() +1);
//		}
//		
//		for (int i = 0; i < book.length; i++) {
//			System.out.println(book[i].getName());
//		System.out.print(book[i].getIsbn()+ "/t");
//		System.out.print(book[i].getCount()+"/t");
//		System.out.print(book[i].getPrice()+"/t");
//		System.out.println(book[i].getId());
//		}
//	}
//
//	public void showBook(Book[] book) {
//	
//	
//		
//	}

}
