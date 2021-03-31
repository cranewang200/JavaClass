package Exercise04;
/**
 * StudentModel Class for outputing the information of student
 *Assessment: CST8116 311 Exercise 1
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, Jan. 22
 */

public class StudentModel {
		
	public void outputDefaultConstructor() { //outputDefaultConstructor method without arguments
		System.out.println("Testing method, default constuctor");
		
	}
	
	public void outputFristName(String fName) { //outputFristName method with String argument
		System.out.println(fName);
		
	}
	
	public void outputLastName(String lName) {//outputLasttName method with String argument
		System.out.println(lName);
	}
	
	public void outputStudentNumber(String sNumber) {//outputStudentNumber method with String argument
		System.out.println(sNumber);
	}
	
	public void outputGpa(double gpa) {//outputGpa method with double argument
		System.out.println(gpa);
	}
	
	/*
	 * //outputAllInfo method with String and double arguments
	 */
	public void outputAllInfo(String fName, String lName, String sNumber, double gpa) { 
		System.out.println(fName +" , " + lName + " , " + sNumber + " , " + gpa);
	}
	
	/*
	 *outputOverloadConstructor method overload StudentInfor constructor with arguments
	 */
	public void outputOverloadConstructor(String fName, String lName, String sNumber, double gpa) {
		System.out.println();
		System.out.println("Testing overloaded constructor");
		System.out.println(fName +" , " + lName + " , " + sNumber + " , " + gpa);
	}

}
