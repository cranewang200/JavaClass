package Exercise04;

public class StudentProgram {

	public static void main(String[] args) {
		
		StudentInfo studentInfo1 = new StudentInfo();	//instance default constructor of StudentInfor class without arguments
		
		studentInfo1.setfName("Ming");			//set frist name
		studentInfo1.setlName("Wang");			//set last name
		studentInfo1.setsNumber("040999999");	//set student number
		studentInfo1.setGpa(4.0);				//set Gpa

		StudentModel studentModel = new StudentModel();	//Instance default constructor of StudentModel class without argument
		
		studentModel.outputDefaultConstructor();					//outputDefaultConstructor method, print prompt messages
		studentModel.outputFristName(studentInfo1.getfName());		//outputFristName method , print first name
		studentModel.outputLastName(studentInfo1.getlName());		//outputLastName method, print last name
		studentModel.outputStudentNumber(studentInfo1.getsNumber());//outputStudentNumber method, print student number
		studentModel.outputGpa(studentInfo1.getGpa());				//outputGpa method, print Gpa
		studentModel.outputAllInfo(studentInfo1.getfName(),studentInfo1.getlName(),studentInfo1.getsNumber(),studentInfo1.getGpa());
		
		/*
		 * new instance of StudentInfor class , overload constructor  with arguments
		 */
		StudentInfo studentInfo2 = new StudentInfo("Nats " , "Adeip, " , "101010101, " , 5.3);
		studentModel.outputOverloadConstructor(studentInfo2.getfName(),studentInfo2.getlName(),studentInfo2.getsNumber(),studentInfo2.getGpa());
		System.out.println("Program by Ming Wang");
		

	}

}
