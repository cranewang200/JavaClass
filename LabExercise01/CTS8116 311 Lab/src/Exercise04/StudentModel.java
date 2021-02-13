package Exercise04;

/**
 * Assessment: CST8116 311 Exercise 4
 * Student Name: Ming Wang
 * Lab Professor Name: Stanley Pieda
 * Lab Section Number: 311
 * Due Date: Friday, Feb.14
 * Description: StudentModel Class for output methods for the information of student. 
 */

public class StudentModel {
	/*
	 * StudentModel class, has methods for output and use the StringBuffer to reverse the input..
	 */
		
	public void outputDefaultConstructor() { //outputDefaultConstructor method without arguments
		System.out.println("Testing method, default constuctor");
		
	}
	
	/*
	 *outputFristName method with String argument
	 */
	public void outputFristName(String fName) { 
		System.out.println(fName);
		
	}
	
	/*
	 * outputLasttName method with String argument
	 */
	public void outputLastName(String lName) {
		System.out.println(lName);
	}
	
	/*
	 * outputStudentNumber method with String argument
	 */
	public void outputStudentNumber(String sNumber) {
		System.out.println(sNumber);
	}
	
	/*
	 * outputGpa method with double argument
	 */
	public void outputGpa(double gpa) {
		System.out.println(gpa);
	}
	
	/*
	 * //outputAllInfo method with String and double arguments
	 */
	public void outputAllInfo(String fName, String lName, String sNumber, double gpa) { 
		System.out.println(fName +" " + lName + " , " + sNumber + " , " + gpa);
	}
	
	/*
	 *outputOverloadConstructor method overload StudentInfor constructor with arguments
	 *Use the StringBuffer method to reverse the input then output the reversed value.
	 */
	public void outputOverloadConstructor(String fName, String lName, String sNumber, double gpa) {
		System.out.println();
		System.out.println("Testing overloaded constructor");
		StringBuffer str = new StringBuffer();			//instance new StringBuffer method and arrange memory address to str
		StringBuffer str1 = new StringBuffer();			//instance new StringBuffer method and arrange memory address to str1
		StringBuffer str2 = new StringBuffer();			//instance new StringBuffer method and arrange memory address to str2
		StringBuffer str3 = new StringBuffer();			//instance new StringBuffer method and arrange memory address to str3
		str.append(fName);			//add the fName value into str
		str.reverse();				//reverse the value of str
		str1.append(lName);			//add the lName value into str1
		str1.reverse();				//reverse the value of str1
		str2.append(sNumber);		//add the sNumber value into str2
		str2.reverse();				//reverse the value of str2
		str3.append(gpa);			//add the gpa value into str3
		str3.reverse();				//reverse the value of str3
		double str4 = Double.parseDouble(str3.toString());	//transfer the value from StringBuffer to String then to double and to save the value to str4 as double
		System.out.println(str +" " + str1 + ", " + str2 + " , " + str4);		// output all the reversed value
	}

}
