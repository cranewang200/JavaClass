/**
 * 
 *Assessment: CST8116 311 Exercise 06
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, March.19
 *Description: class Shipping with kilograms  
 */

/*
 * class Shipping with kilograms   
 */
public class Shipping {
	private double kilograms;
	
	/*
	 *  default Shipping constructor without arguments,set the kilograms to zero
	 */
	public Shipping() {
		this.kilograms = 0;
	}
	/*
	 * overloaded Shipping constructor sets field from the argument values passed to kilograms
	 */
	public Shipping (double kilograms) {
		this.kilograms = kilograms;
	}
	/*accessor for kilograms*/
	public double getKilograms() {
		return kilograms;
	}
	/*mutator for kilograms*/
	public void setKilograms(double kilograms) {
		this.kilograms = kilograms;
	}
	
	

}
