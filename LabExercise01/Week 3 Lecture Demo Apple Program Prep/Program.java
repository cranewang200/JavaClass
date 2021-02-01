/*
 * Author: Stanley Pieda
 * Date: Sept 11, 2020
 * Description: Week 3 Demo, Program class with main method for processing
 */
public class Program {

	/*
	 * Entry point for program
	 * - declare 2 Apples, 1 Farmer, and supporting variables.
	 * - use farmer to get input for each apples fields (properties)
	 * - create each Apple with values obtained
	 * - use each Apple to calculate total
	 * - use Farmer to calculate grand total
	 * - use Farmer to output results.
	 */
	public static void main(String[] args) {
		Apple apple1 = null; // null means no object reference set
		Apple apple2 = null; //   will wait and use overloaded constructor (below)
		Farmer farmer = new Farmer();
		String varietyValue; // can be used for any apples data
		int priceValue; // can be used for any apples data
		int quantityValue; // can be used for any apples data
		
		farmer.output("Please enter apple 1 variety");
		varietyValue =  farmer.inputVariety();
		
		farmer.output("Please enter apple 1 price");
		priceValue = farmer.inputNumber();
		
		farmer.output("Please enter apple 1 quantity");
		quantityValue = farmer.inputNumber();
		
		apple1 = new Apple(varietyValue, priceValue, quantityValue);
		
		farmer.output("Please enter apple 2 variety");
		varietyValue =  farmer.inputVariety();
		
		farmer.output("Please enter apple 2 price");
		priceValue = farmer.inputNumber();
		
		farmer.output("Please enter apple 2 quantity");
		quantityValue = farmer.inputNumber();
		
		apple2 = new Apple(varietyValue, priceValue, quantityValue);
		
		int apple1Total = apple1.calculateTotal();
		int apple2Total = apple2.calculateTotal();
		int grandTotal = farmer.calculateGrandTotal(apple1Total, apple2Total);
		
		farmer.output(apple1.getVariety() + " has total of " + apple1Total + " cents");
		farmer.output(apple2.getVariety() + " has total of " + apple2Total + " cents");
		
		farmer.output("Grand Total is: " + grandTotal + " cents");
		
	}
}
