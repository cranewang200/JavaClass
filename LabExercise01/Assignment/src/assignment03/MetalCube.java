/**
 * 
 * Assessment: CST8116 311 
 * Assignment 03 
 * Student Name: Ming Wang 
 * Lab Professor
 * Name: Stanley Pieda 
 * Lab Section Number: 311 
 * Due Date: Friday, March 28
 * Description: This class can be use for verify the cube of input if it's a good cube.
 */

/*
 * MetalCube class has three fields length, width and height. all of them as
 * double data type. and It has one public method to verify the cube of input if
 * it's a good cube.
 */
public class MetalCube {
	private double length; // cube length, centimeter
	private double width; // cube width, centimeter
	private double height; // cube height, centimeter

	// EPSILON is set at one-tenth of a centimeter, i.e.
	// less-than-or-equal-to one millimeter.
	private static final double EPSILON = 0.1;

	/*
	 * default constructor of MetalCube class. set the default values of cube is
	 * 10.0,10.0,10.0
	 */
	public MetalCube() {
		this(10.0, 10.0, 10.0);
	}

	/*
	 * overload constructor of MetalCube class with three double fields set the
	 * length, width, and height with the passed arguments.
	 */
	public MetalCube(double length, double width, double height) {
		setLength(length);
		setWidth(width);
		setHeight(height);
	}

	/* Accessor for length field */
	public double getLength() {
		return length;
	}

	/* Mutator for length field */
	public void setLength(double length) {
		this.length = length;
	}

	/* Accessor for width field */
	public double getWidth() {
		return width;
	}

	/* Mutator for width field */
	public void setWidth(double width) {
		this.width = width;
	}

	/* Accessor for height field */
	public double getHeight() {
		return height;
	}

	/* Mutator for eight field */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Worker method to verify the passed in values of cube if it is good.	 * 
	 * @return true for good cube +1 , false for bad cube +1 .
	 */
	public boolean isWithinTolerance() {
		boolean isGoodTube;
		double tenCentimeter = 10;
		double minimumTolerance = tenCentimeter - EPSILON;  //calculate the lowest tolerance for cube
		double maxTolerance = tenCentimeter + EPSILON;		//calculate the highest tolerance for cube
		if ((length >= minimumTolerance && length <= maxTolerance)	//compare the length if it is between in the highest and lowest tolerance and,
				&& (width >= minimumTolerance && width <= maxTolerance)//compare the width if it is between in the highest and lowest tolerance and,
				&& (height >= minimumTolerance && height <= maxTolerance)) {//compare the height if it is between in the highest and lowest tolerance and,
			isGoodTube = true;											//all three parameters between in the highest and lowest tolerance is a good cube. 
		} else {
			isGoodTube = false;  //any parameter less than minimumTolerance or greater than maxTolerance is a bad cube.
		}
		return isGoodTube;
	}

}
