/**
 * 
 *Assessment: CST8116 311 Exercise 8
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, April.2
 *Description: Array exercise
 */

/*
 * This class includes the main method for array exercise. 
 */
public class ArrayExercise {
/*start point of the program*/
	public static void main(String[] args) {

		int[] arrayIntegers = {1,2,3,5,7};  //declaration a integer array and populate the elements of array
		int sum = 0;
		
		for (int i = arrayIntegers.length - 1; i >= 0; i--) { // for loop to reverse output the elements of array
			System.out.print(arrayIntegers[i] + " ");//output every element of array and insert a space between two elements
			sum = sum + arrayIntegers[i];			
		}//end for loop
		System.out.println();//add a space line 
		System.out.printf("Array Size is : %d\n", arrayIntegers.length);
		System.out.printf("Sum is : %d\n", sum);
		System.out.printf("program by Ming Wang\n"); //output my name

	}

}//stop
