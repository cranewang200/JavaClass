/**
 *Assessment: CST8116 311 Exercise 03
 *Description: Input user name and transfer it into Upper Case and calculate how many letters in their name
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, Feb.05
 */

import java.util.Scanner;

public class MingWangLabExercise03 {

	public static void main(String[] args) { 	//start
		
		String str; 							//declaration variable str to save input
		System.out.println("Please input your name:");	//output to prompt user to input their name
		str = new Scanner(System.in).nextLine();		//input the name and save it to variable str
			
		System.out.println("Your name is (" + str.toUpperCase().trim() + ") in Upper Case");	//output the transfered name in upper case. delete the unnecessary space
		System.out.println("Your name has ("+ str.trim().length() + ") letters(include the space(s) between your name)"); //output the number of how many letters in the name
		System.out.println("Program by Ming Wang"); // the author's name

		

	}

}
