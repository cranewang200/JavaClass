import java.util.Scanner;

/**
 * 
 * Assessment: CST8116 311 Exercise 6 Student Name: Ming Wang Lab Professor
 * Name: Stanley Pieda Lab Section Number: 311 Due Date: Friday, March.19
 * Description: UserInput class has two method to let user input the value of
 * weight and mode of shipping....
 */
/*
 * UserInput class to let user input the value of weight and mode of shipping
 * the inputKilograms method let user input the weight of shipping the
 * inputShippingMode method let user input the mode of shipping
 */
public class UserInput {
	Scanner scanner = new Scanner(System.in);

	/**
	 * the inputKilograms method prompt information and let user input the weight of
	 * shipping, input must be greater than 0
	 * 
	 * @return inputKilograms, double value of user input from keyboard
	 */
	public double inputKilograms(int minValue) {
		System.out.print("Enter weight(kg): ");
		double inputKilograms = 0;// declaration a double variable and set it to 0
		boolean isBadInput = true;

		while (isBadInput) {// start loop to evaluate the input if it is a double

			if (scanner.hasNextDouble()) {
				inputKilograms = scanner.nextDouble();
				if (inputKilograms > minValue) {
					isBadInput = false; // set the sentry variable to false to exit the while loop
				}
				System.out.println("please input a positive number for the weight of the parcel");

			} else if (!scanner.hasNextDouble()) {
				System.out.println("please input a positive number for the weight of the parcel");
			} // end if
			scanner.nextLine(); // input again
		} // end while
//		scanner.nextLine(); // clean up the input stream
		return inputKilograms;
	}

	/**
	 * the inputShippingMode method prompt information and let user input the mode
	 * of shipping, only 1, 2, 3 are the valid inputs
	 * 
	 * @return inputOption, integer value of user input from keyboard
	 */
	public int inputShippingMode(int minValue, int maxValue) {
		int inputOption = Integer.MIN_VALUE; // declaration a integer variable for option and set it to an impossible
												// user input
		boolean isBadInput = true; // sentry variable of while loop
		System.out.println("Enter 1 to ship by truck");
		System.out.println("Enter 2 to ship by train");
		System.out.println("Enter 3 to ship by plane");
		System.out.print("Enter shipping method: ");

		while (isBadInput) {// start loop to evaluate the input if it is a integer
			if (scanner.hasNextInt()) {
				inputOption = scanner.nextInt();
				if (inputOption >= minValue && inputOption <= maxValue) {
					isBadInput = false;// set the sentinel variable to false to exit the while loop
				}
				System.out.println("Please input a integer: 1 for truck; 2 for train; 3 for airplane");
			} else if (!scanner.hasNextInt()) {
				System.out.println("Please input integer: 1 for truck; 2 for train; 3 for airplane");
			} // end if
			scanner.nextLine(); // clean up the input stream for next loop
		} // end while

		return inputOption;
	}
}
