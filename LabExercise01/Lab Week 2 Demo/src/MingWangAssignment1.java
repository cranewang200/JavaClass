import java.util.Scanner;
/**
 *Assessment: CST8116 311 Assignment 1
 *Description: Input 3 numbers to calculate the sum, average, square foot and power of them. print the results.
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, Feb.07
 */
public class MingWangAssignment1 {
	//main entry of program
	public static void main(String[] args) {
		
		int n1 = -1, n2 = -1, n3 = -1; //declare variable n1,n2,n3 and initial them
		System.out.println("Please input the first number:"); //let user to input the first number
		n1 = new Scanner(System.in).nextInt();	//set the first input number to n1
		System.out.println("Please input the second number:"); //let user to input the second number
		n2 = new Scanner(System.in).nextInt();	// let the second input number equals n2
		System.out.println("Please input the third number:");  //let user to input the third number
		n3 = new Scanner(System.in).nextInt();	//assign the third input number to n3
		// print all three numbers
		System.out.println("first number = " + n1 + ", " + "Second number = " + n2 +", " + "third number = " + n3);
		
		//	Calculate the sum of the three numbers
		int sum = -1; //declare variable to save result
		sum = n1 + n2 + n3;
		System.out.println("sum of the three number is :" + sum);
		
		//	Calculate the average of the three numbers
		double avg = -1; //declare variable to save result
		avg = (double)sum / 3; //in order to get accurate result, force int sum tranfer to double sum
		System.out.println("average of the three numbers is " + avg);
		
		//Calculate the square root of the sum of the three numbers.
		double sqrt = -1; //declare variable to save result
		sqrt = Math.sqrt(sum);
		System.out.println("square root of the sum of the three numbers is " + sqrt);
		
		//Raise the first number to the power of the second number.
		int npow1 = -1;  //declare variable to save result
		npow1 = (int)Math.pow(n1, n2);
		System.out.println("Raise the first number (" + n1 +") to the power of the second number ("+ n2 +") is " + npow1);
		
		//Raise the second number to the power of the third number.
		int npow2 = -1;  //declare variable to save result
		npow2 = (int)Math.pow(n2, n3);
		System.out.println("Raise the second number ("+ n2 +") to the power of the third number (" + n3 +")  is " + npow2);
		
		//Raise the third number to the power of the first number.
		int npow3 = -1;  //declare variable to save result
		npow3 = (int)Math.pow(n3, n1);
		System.out.println("Raise the third number (" + n3 +") to the power of the first number (" + n1 +")  is " + npow3);
		
		System.out.println("My author name is Ming Wang");
		
	}

}//end program
