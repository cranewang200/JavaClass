

/**
 *Assessment: CST8116 311 Exercise 05
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, March. 12
 * Description: Starts of the Exercise05 program with main method.
 *              solve the 3 equations to understand the order of operations in Java
 */

/*
 * class exercise 05 with main method 
 * for solve the 3 equations to understand the order of operations in Java 
 */
public class Exercise05 {
	/*
	 * entry point of the program. 
	 */
	public static void main(String[] args) {
		int x = 42; //variable for equation3
		int y = 22; //variable for equation3
		
		System.out.println("equation1 = ! (10 / 2 + 33 >= 45 - 5)" );
		System.out.println(! (10 / 2 + 33 >= 45 - 5));
		System.out.println("equation2 = 45 >= 45 && 25 == 22;" );
		System.out.println(45 >= 45 && 25 == 22);
		System.out.println("x is 42, y is 22 to start");
		System.out.println("equation3 = x++ + --y > 100 || 43 == x;" );
		System.out.println(x++ + --y > 100 || 43 == x);
		System.out.println("program by Ming Wang ");

	}

} //stop
