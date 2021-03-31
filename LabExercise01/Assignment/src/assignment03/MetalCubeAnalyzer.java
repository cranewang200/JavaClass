/**
 * 
 * Assessment: CST8116 311 Assignment 03 Student Name: Ming Wang Lab Professor
 * Name: Stanley Pieda Lab Section Number: 311 Due Date: Friday, March 28
 * Description: MetalCubeAnalyzer class is a worker class with has two methods.
 */

/*
 * Class MetalCubeAnalyzer. It's a worker class that has two methods. The
 * enterCube method to prompt user to input the values and pass the value into
 * MetalCube class to set the values of cube. then call isWithinTolerance method
 * of MetalCube class to count the good cubes and bad cubes. The printReport
 * method is used for calculating the ratio of good cubes and bad cubes, then
 * print out the information to console.
 */
public class MetalCubeAnalyzer {
	private int countGoodCubes = 0;
	private int countBadCubes = 0;
	/*
	 * instance of UserInput class with no arguments, to input the double cube
	 * parameters
	 */
	private UserInput input = new UserInput();
	/*
	 * instance of MetalCube class with no arguments, to pass the value to the
	 * mutators
	 */
	private MetalCube metalCube = new MetalCube();

	/**
	 * The enterCube method to prompt user to input the values and pass the value
	 * into MetalCube class to set the values of cube. then call isWithinTolerance
	 * method of MetalCube class to count the good cubes and bad cubes.
	 */
	public void enterCube() {

		System.out.print("Please enter cube length(cm):"); // Ask the user for cube length
		double cubeLength = input.inputDouble();
		metalCube.setLength(cubeLength); // set the length into a cube to check tolerance,
		System.out.print("Please enter cube height(cm):");// Ask the user for cube height
		double cubeHeight = input.inputDouble();
		metalCube.setHeight(cubeHeight); // set the height into a cube to check tolerance,
		System.out.print("Please enter cube width(cm):"); // Ask the user for cube width
		double cubeWidth = input.inputDouble();
		metalCube.setWidth(cubeWidth); // set the width into a cube to check tolerance,

		if (true == metalCube.isWithinTolerance()) { // add to good cube
			countGoodCubes++;
		} else if (false == metalCube.isWithinTolerance()) { // add to bad cube
			countBadCubes++;
		}

	}

	/**
	 * The printReport method is used for calculating the ratio of good cubes and
	 * bad cubes, then print out the information to console.
	 */
	public void printReport() {
		// Print out the counts of good and bad cubes, total cubes,
		// percent good cubes, percent bad cubes.
		// format the output with some text.
		int totalCubes = countBadCubes + countGoodCubes;
		if (totalCubes == 0) {
			System.out.printf("Total Cubes processed is zero.\nNothing to report.\n\n");
		} else {
			double percentGoodCube = (double) countGoodCubes / totalCubes * 100;
			double percentBadCube = (double) countBadCubes / totalCubes * 100;
			System.out.println("Good cubes: " + countGoodCubes); // output good cubes
			System.out.println("Bad cubes: " + countBadCubes); // output bad cubes
			System.out.println("Total cubes: " + totalCubes); // output total cubes
			System.out.printf("Percent Good Cubes: %.2f\n", percentGoodCube);
			System.out.printf("Percent Bad Cubes: %.2f\n", percentBadCube);
			System.out.println();
		}

	}
}
