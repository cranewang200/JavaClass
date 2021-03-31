import java.util.Scanner;

/**
 * Description: class Staff, behavior class for process the output the prompt. input the data,
 * verify the input, calculate the result based on two inputs and output the result. 
 * Assessment: CST8116 311 Assignment 2 
 * Student Name: Ming Wang 
 * Lab Professor Name: Stanley Pieda 
 * Lab Section Number: 311 
 * Due Date: Friday, Feb.28
 */


	/*
	 * Staff class , has method for output, input and calculate.
	 * inputPromptKilo as an int value and  inputPromptFuel as a double value
	 * both of the input method will verify the input value, the input has to a 
	 * positive number which be greater than zero.
	 */
public class Staff {
	
	
	/*
	 *instance of class Gas  ,create a new  Gas class default constructor 
	 *without arguments and assign the memory address to gas
	 *
	 */
		Gas gas = new Gas(); 

	/*
	 * sequence call of the method for executing
	 */
	public Staff() {
		inputKilo(); // first step: output the prompt for travel kilometer
		inputFuel(); // second step: output the prompt for travel kilometer
		calculateGas(); // third step: calculate and output the result

	}

	
	/*
	 * inputKilo method, declare the int variable for saving the input output
	 * the message to prompt user to input the kilometer of travel using instance of
	 * class Scanner read the input to save the input into variable verify the input
	 * if is legal. set the legal input value to the gas.setTravelKilometer
	 */
	public void inputKilo() {
		System.out.print("Please input roundtrip travel Kilometers:"); // output message
		int input = new Scanner(System.in).nextInt(); // read the integer input from scanner
		while (true) { // loop for re-input the correct integer
			if (input <= 0) { // judge for if it is legal of input. will let user input
				System.err.print("Invalid travel kilometers input! Please input again:"); // again if the input <=0
				input = new Scanner(System.in).nextInt();
			} else if (input > 0) // end loop if the input is correct
				break;
		}
		gas.setTravelKilometer(input); // save the value of input to mutator gas.setTravelKilometer

	}

	/*
	 * inputFuel method, , declare the double variable for saving the input
	 * output the message to prompt user to input the fuel efficiency of car using
	 * instance of class Scanner read the input to save the input into variable
	 * verify the input if is legal. set the legal input value to the gas.setFuelEfficiency
	 */
	public void inputFuel() {
		System.out.print("Please input fuel efficiency(How many liters consume per 100KM):"); // output message
		double input = new Scanner(System.in).nextDouble(); // read the integer input from scanner
		while (true) { // loop for re-input the correct integer
			if (input <= 0) { // judge for if it is legal of input. will let user input
				System.err.print("Invalid fuel efficiency input! Please input again:");// again if the input <=0
				input = new Scanner(System.in).nextDouble();
			} else if (input > 0) // end loop if the input is correct
				break;
		}
		gas.setFuelEfficiency(input); // save the value of input to mutator gas.setFuelEfficiency

	}

	/*
	 * calculate method to calculate the result of how many liters of gas will consume
	 * first need to calculate how many kilometer division 100, then the result multiply the fuelEfficiency
	 * then output the result
	 */
	public void calculateGas() {	
		double total = (gas.getTravelKilometer() / 100.0) * gas.getFuelEfficiency();//calculate the result. use 100.0 to make the calculate to be float data type
		int total1 = (int)(Math.ceil(total));		//Math.round method, use to round up the result to whole number
		System.out.printf("You need %d liters gas for the travel\n", total1);//output the result
		
	}

}
