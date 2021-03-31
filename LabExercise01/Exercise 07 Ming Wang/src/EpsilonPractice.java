
/**
 * 
 *Assessment: CST8116 311 Exercise 7
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, Friday, March.26
 *Description: Starts of the EpsilonPractice class with main method.
 */

/*
 * This class instantiates 2 instances of class EpsilonTester and class User.
 */
public class EpsilonPractice {

	// Start point of the program
	public static void main(String[] args) {
		/*instance of default EpsilonTester class constructor with no arguments*/
		EpsilonTester epsilonTester = new EpsilonTester();
		/*instance of default User class constructor with no arguments*/
		User userInput = new User();
		
		final int CONTINUE_PROGRAM = 1; // use this for the loop
		int continueProgram = 0; // for user entry regarding continue program
		String report = ""; // used for outputs	
		boolean isContinue = true; //sentinel variable for while loop

		while (isContinue) {//while loop let the program running. use the user entry to continue or exit the loop.
			System.out.println("Input 1 to continue. other numbers to quit"); // Prompt the user if they want to exit program 
			continueProgram = userInput.inputInteger(); //call inputInteger method to let user input a integer if continue the program
			if (continueProgram == CONTINUE_PROGRAM) {

				epsilonTester.interactWithUserForFieldValues();

				System.out.println();
				report = epsilonTester.compareWithEquality();
				System.out.println(report);

				System.out.println();
				report = epsilonTester.compareWithEpsilon();
				System.out.println(report);
			
				System.out.println("Program by Ming Wang"); //output my name
				System.out.println(); //add a line space to divide another input
			} else if (continueProgram != CONTINUE_PROGRAM) { //input option exits the program
				isContinue = false;
			} //end if
		}//end while 
		System.out.println("Program has exited"); // after loop exits
	}//stop
}
