package Exercise04;
/**
 
 * Assessment: CST8116 311 Exercise 4
 * Student Name: Ming Wang
 * Lab Professor Name: Stanley Pieda
 * Lab Section Number: 311
 * Due Date: Friday, Feb.14
 * Description:entry point of the student model program. 
 */

public class StudentProgram {
	/*
	 * entry of the program. create default StudentInfo constructor without arguments
	 * set the correct arguments for the set methods of StudentInfo
	 * instance StudentModel and use it to get the value of each field then output them
	 * create another overload StudentInfo constructor with arguments
	 * use StudentModel to get the overloaded arguments and output them.
	 */

	public static void main(String[] args) {	
		/*
		 * instance default constructor of StudentInfo class without arguments
		 */
		StudentInfo studentInfo1 = new StudentInfo();	
		
		studentInfo1.setfName("Ming");			//set frist name
		studentInfo1.setlName("Wang");			//set last name
		studentInfo1.setsNumber("5040302010");	//set student number
		studentInfo1.setGpa(4.0);				//set Gpa

		/*
		 * Instance default constructor of StudentModel class without argument
		 * get information from default constructor and output all information
		 */
		StudentModel studentModel = new StudentModel();	
		
		studentModel.outputDefaultConstructor();					//outputDefaultConstructor method, print prompt messages
		studentModel.outputFristName(studentInfo1.getfName());		//outputFristName method , print first name
		studentModel.outputLastName(studentInfo1.getlName());		//outputLastName method, print last name
		studentModel.outputStudentNumber(studentInfo1.getsNumber());//outputStudentNumber method, print student number
		studentModel.outputGpa(studentInfo1.getGpa());				//outputGpa method, print Gpa
		studentModel.outputAllInfo(studentInfo1.getfName(),studentInfo1.getlName(),studentInfo1.getsNumber(),studentInfo1.getGpa());
		
		/*
		 * new instance of StudentInfor class , overload constructor  with arguments
		 * get information from overload constructor and output all the information
		 */
		StudentInfo studentInfo2 = new StudentInfo("Ming" , "Wang" , "5040302010" , 4.0);
		studentModel.outputOverloadConstructor(studentInfo2.getfName(),studentInfo2.getlName(),studentInfo2.getsNumber(),studentInfo2.getGpa());
		System.out.println("Program by Ming Wang");
		

	}

}
