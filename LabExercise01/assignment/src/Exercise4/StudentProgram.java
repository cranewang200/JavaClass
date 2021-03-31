package Exercise4;
/**
 * 
 *Assessment: CST8116 311 Exercise 1
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, Jan. 22
 */
public class StudentProgram {

	public static void main(String[] args) { // entry point for the program
		
		/**
		 * instance of class StudentModel. sequence of the program executed
		 * input first name, last name, student number, gpa, then output them.
		 */
		StudentModel studentModel = new StudentModel();
		studentModel.inputFristName();
		studentModel.inputLastName();
		studentModel.inputStudentNumber();
		studentModel.inputGpa();
		studentModel.outputStudentDefault();
		
		/*
		 * instance Student class with parameters. pass this overloaded student object to StudentModel class
		 *  then get the overloaded values and output them.
		 */
		Student student = new Student("Nats","Adeip","101010101",5.3); 
		studentModel.outputStudentOverload(student);
	
		System.out.println("My author is Ming Wang");
		
	}

}//end program.
