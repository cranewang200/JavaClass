
/**
 * 
 *Assessment: CST8116 311 Assignment 03
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, March 28
 * Description: UserInput class has two methods for user input the value.
 */
import java.util.Scanner;

/*
 * UserInput Class, It's a worker class to let user input the option to choose the menu.
 * and let user to input the values of cubes. This class has two methods. The inputInteger method
 * let user to input 0,1,2 to choose option and verify the inputs. The inputDouble method let user 
 * to input values of cube and verify the inputs. 
 */
public class UserInput {

	private Scanner scanner = new Scanner(System.in);
	/**
	 * the inputDouble method let user to input values of cube and verify the
	 * inputs.And it has to be a positive number
	 * @return Double value of the cube parameter
	 */
	public double inputDouble() {
		double result = Integer.MIN_VALUE;
		boolean isBadInput = true; // sentinel variable
		while (isBadInput) { // while loop to verify the input if it's a positive number
			if (scanner.hasNextDouble()) {
				result = scanner.nextDouble();
				if (result > 0) { // verify if the input is a positive number
					isBadInput = false; // set the sentinel variable to false to exit loop
				} else {
					System.out.print("Please enter a positive double");
				} // end inner if
			} else {
				System.out.print("Please enter a double");
			} // end outer if
			scanner.nextLine();// clean up the input stream
		} // end while
		return result;
	}

	/**
	 * The inputInteger method let user to input a integer to choose option and
	 * verify the inputs.only 0,1,2 are valid inputs  
	 * @return Integer value for the option
	 */
	public int inputInteger(int minValue, int maxValue) {

		int result = Integer.MIN_VALUE; // set the variable to a impossible value of input by user
		boolean isBadInput = true; // sentinel variable for the loop
		while (isBadInput) { // verify the input if it is a integer
			if (scanner.hasNextInt()) {
				result = scanner.nextInt();
				if (result >= minValue && result <= maxValue) {
					isBadInput = false; // set the sentinel variable to false to exit the loop
				} else {
					System.out.print("Please enter '1' for cube entry; '2' to show report; '0' to exit program.");
				} // end inner if
			} else {
				System.out.print("Please enter '1' for cube entry; '2' to show report; '0' to exit program.");
			} // end outer if
			scanner.nextLine();// clean up the input stream for next loop
		} // end while
		return result;
	}

}
