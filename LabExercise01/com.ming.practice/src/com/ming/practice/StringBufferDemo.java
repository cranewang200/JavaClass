package com.ming.practice;

public class StringBufferDemo {

	public static void main(String[] args) {
//		String str1 = "a";
//		String str2 = "b";
//		String str3 = str1 + str2;
//		
//		//底层实现
//		String str4 = new StringBuffer(String.valueOf(str1)).append(str2).toString();
		final int N = 500000;
		long startTime = System.currentTimeMillis();
		String str = "*";
		for (int i = 0; i < N; i++) {
			str += "*";
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("用时" + (endTime - startTime) + "毫秒");

		//使用StringBuffer进行字符串拼接
		
		startTime = System.currentTimeMillis();
		StringBuffer str1 = new StringBuffer("*");
		for (int i = 0; i < N; i++) {
			str1.append("*");
		}
		
		endTime = System.currentTimeMillis();
		System.out.println("String Buffer 用时" + (endTime - startTime) + "毫秒");
		
		//StringBuilder
		
		startTime = System.currentTimeMillis();
		StringBuilder str2 = new StringBuilder("*");
		for (int i = 0; i < N; i++) {
			str2.append("*");
		}
		
		endTime = System.currentTimeMillis();
		System.out.println("String Builer 用时" + (endTime - startTime) + "毫秒");
		
	}

}
