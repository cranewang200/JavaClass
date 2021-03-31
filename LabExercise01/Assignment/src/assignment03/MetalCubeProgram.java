
/**
 * 
 * Assessment: CST8116 311
 * Assignment 03 
 * Student Name: Ming Wang 
 * Lab Professor
 * Name: Stanley Pieda 
 * Lab Section Number: 311 
 * Due Date: Friday, March 28
 * Description: Starts of the MetalCubeProgram with main method.
 */

/*
 * This class instantiates 2 instances of class MetalCubeAnalyzer and class
 * UserInput.
 */
public class MetalCubeProgram {
	/* entry point of the program */
	public static void main(String[] args) {
		final int ENTER_DATA = 1; // constant of ENTER_DATA for user to choose enter new cube
		final int REPORT = 2; // constant of REPORT for user to choose output the report
		final int EXIT = 0; // constant of EXIT for user to choose exit the program

		/*
		 * instance of MetalCubeAnalyzer class with no arguments, to enter data or
		 * output report
		 */
		MetalCubeAnalyzer analyzer = new MetalCubeAnalyzer();
		/* instance of UserInput class with no arguments, to input the option of menu */
		UserInput input = new UserInput();

		boolean isContinue = true; // sentinel variable to control the while loop
		while (isContinue) {

			System.out.println("Enter 1 for cube entry"); // menu
			System.out.println("Enter 2 to show report");
			System.out.println("Enter 0 to exit program");
			System.out.println("program by Ming Wang"); // my name
			System.out.print("Please enter a Integer:"); // ask for input

			int inputOption = input.inputInteger(0, 2); // arguments let the input only equals 0,1,2. no other inputs
			switch (inputOption) {// switch for which menu should be execute

			case EXIT:
				System.out.println("Thanks for using program");
				isContinue = false;
				break;

			case ENTER_DATA:
				analyzer.enterCube();
				break;

			case REPORT:
				analyzer.printReport();
				break;

			}// end switch
		} // end while
	}
}
