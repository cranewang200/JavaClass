/**
 * 
 */
package Exercise4;

import java.util.Scanner;

public class StudentModel {
	
	Student student = null;
	
	public StudentModel() {		//class StudentModel default constructor with out class
		student = new Student();
	}
	
	public StudentModel(Student student) {  //class StudentModel constructor with class student
		this.student = student;
	}
	
	/*
	 * Input first name method, use scanner to read the input and operate the setfName mutator 
	 * to save the value of input
	 */
	public void inputFristName() {
		System.out.println("Please input your First Name:");
		Scanner input = new Scanner(System.in) ;
		student.setfName(input.nextLine());
	}
	
	/*
	 * Input last name method, use scanner to read the input and invoke the setlName mutator 
	 * to save the value of input
	 */
	public void inputLastName() {
		System.out.println("Please input your Last Name:");
		Scanner input = new Scanner(System.in) ;
		student.setlName(input.nextLine());
	}
	
	/*
	 * Input student number method, use scanner to read the input and invoke the setsNumber mutator 
	 * to save the value of input
	 */
	public void inputStudentNumber() {
		System.out.println("Please input your Student Number:");
		Scanner input = new Scanner(System.in) ;
		student.setsNumber(input.nextLine());
	}
	
	/*
	 * Input gpa method, use scanner to read the input and invoke the setGpa mutator 
	 * to save the value of input
	 */
	public void inputGpa() {
		System.out.println("Please input your GPA:");
		Scanner input = new Scanner(System.in) ;
		student.setGpa(input.nextDouble());
	}
	
	/*
	 * report generating method, output the student information
	 * use the default constructor
	 */
	public void outputStudentDefault() {
		System.out.println("Testing method, default constructor");
		System.out.println(student.getfName());
		System.out.println(student.getlName());
		System.out.println(student.getsNumber());
		System.out.println(student.getGpa());
		System.out.println(student.getfName() +" , "+ student.getlName() +" , " + student.getsNumber()+" , " + student.getGpa());
		System.out.println();
	}
	
	/*
	 * report generating method, output the student information
	 * use the overload constructor
	 */
	public void outputStudentOverload(Student student) {
		System.out.println("Testing overloaded constructor");
		System.out.println(student.getfName() +" , "+ student.getlName() +" , " + student.getsNumber()+" , " + student.getGpa());
	}
	

}
