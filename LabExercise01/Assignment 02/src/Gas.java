/**
 * Description: class Gas with travelKilometer, fuelEfficiency,
 * Assessment: CST8116 311 Assignment 2
 * Student Name: Ming Wang
 * Lab Professor Name: Stanley Pieda
 * Lab Section Number: 311
 * Due Date: Friday, Feb.28
 */

public class Gas {		//declaration 
	
	private int travelKilometer;	//name of kilometer variety
	private double fuelEfficiency;	//name of fuel efficiency variety
	

	/*
	 *  default Gas constructor without arguments
	 */
	public Gas() {  
		
	}

	/*
	 * overloaded Gas constructor with travelKilometer, fuelEfficiency arguments
	 */
	public Gas(int travelKilometer, double fuelEfficiency) {
		
		setFuelEfficiency(fuelEfficiency);
		setTravelKilometer(travelKilometer);
//		this.travelKilometer = travelKilometer;
//		this.fuelEfficiency = fuelEfficiency;
	}

	/*
	 * getter and setter of variables
	 * accessor for travelKilometer
	 */
	public int getTravelKilometer() {
		return travelKilometer;
	}

	/*
	 * mutator for travelKilometer
	 */
	public void setTravelKilometer(int travelKilometer) {
		this.travelKilometer = travelKilometer;
	}

	/*
	 * accessor for fuelEfficiency
	 */
	public double getFuelEfficiency() {
		return fuelEfficiency;
	}

	/*
	 * mutator for fuelEfficiency
	 */
	public void setFuelEfficiency(double fuelEfficiency) {
		this.fuelEfficiency = fuelEfficiency;
	}
	
	

}

