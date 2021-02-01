package com.ming.practice;

public class Role {

	
	
	
	public String name;
	public int level;

	public String job;
	
	public Role(String name1, int level1, String job1) {   //构造方法 ， 1. 没有返回值 2方法名和类名一只
		name = name1;
		level = level1;
		job = job1;
	};
	public void sendSkill() {
	if (name.equals("劳拉")) {
		System.out.println("双枪老太婆");
	}else {
		System.out.println("吃俺老孙一棒");
	}
	};
	public void show() {
		System.out.println(name);
		System.out.println(level);
		System.out.println(job);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
