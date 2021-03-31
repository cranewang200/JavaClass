
/**
 * 
 *Assessment: CST8116 311 Exercise 6
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, Friday, March.19
 *Description: Starts of the GasProgram class with main method.
 */

	/*
	 * This class instantiates 2 instances of class Shipping and class UserInput.
	 * 	
	 */
public class ShippingProgram {	

	/*
	 * entry point for program
	 * declare 1 Shipping and 1 UserInput instance 
	 * use UserInput.inputKilograms method to get the kilograms from user input
	 * pass and set the value to Shipping  
	 * use UserInput.inputShippingMode method to get the shipping mode from user input
	 * then use switch case to calculate and output the results
	 */
	public static void main(String[] args) {
		
		final int BY_TRUCK = 1;			//shipping by truck
		final int BY_TRAIN = 2;			//shipping by train
		final int BY_AIRPLANE = 3;		//shipping by airplane
		final int SERVICE_CHARGE = 10;	//service charge
		final double TRUCK_FEE = 0.1;	//truck rate
		final double TRAIN_FEE = 0.25;	//train rate
		final double AIRPLAIN_FEE = 0.75;//airplane rate
		
		/*instance of default Shipping class constructor with no arguments*/
		Shipping shipping = new Shipping();
		/*instance of default UserInput class constructor with no arguments*/
		UserInput input = new UserInput();
		
		double kilograms = input.inputKilograms(0);		 //call inputKilograms method to get a double input, set 0 as the minimum value of input
		shipping.setKilograms(kilograms);				//pass the double value to Shipping mutator
		int shippingMode = input.inputShippingMode(1,3);	 //call shippingMode method to get a integer input,confine input between 1 and 3 
		System.out.println(); 		//add a space line before to output the result
		
		switch (shippingMode) { 	//evaluate the user input, choose the right option and calculate the result
		case BY_TRUCK:				//shipping by truck, truck rate = 0.1
			double resultTruck = Math.ceil((shipping.getKilograms() * TRUCK_FEE) + SERVICE_CHARGE);
			System.out.println("You choose truck for transportation");
			System.out.println("Your parcel weight is " + shipping.getKilograms() + " Kilograms");
			System.out.println("Shipping by truck costs: " + resultTruck);
			break;
			
		case BY_TRAIN:	//shipping by train, train rate = 0.25
			double resultTrain = Math.ceil((shipping.getKilograms() * TRAIN_FEE) + SERVICE_CHARGE);
			System.out.println("You choose train for transportation");
			System.out.println("Your parcel weight is " + shipping.getKilograms() + " Kilograms");
			System.out.println("Shipping by train costs: " + resultTrain);		
			break;

		case BY_AIRPLANE: //shipping by airplane, train rate = 0.75
			double resultAirplane = Math.ceil((shipping.getKilograms() * AIRPLAIN_FEE) + SERVICE_CHARGE);
			System.out.println("You choose airplane for transportation");
			System.out.println("Your parcel weight is " + shipping.getKilograms() + " Kilograms");
			System.out.println("Shipping by plane costs: " + resultAirplane);
			break;
			
		default:		//default case, all incorrect input will execute the following block
			System.out.println("invalid input! try again.");
		}	//end switch
		System.out.println("program by Ming Wang");

	}

}
