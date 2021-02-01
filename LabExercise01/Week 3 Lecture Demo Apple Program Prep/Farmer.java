/*
 * Author: Stanley Pieda
 * Date: Sept 11, 2020
 * Description: Week 3 Demo, Farmer with input, output, processing methods
 */
import java.util.Scanner;

/*
 * Farmer class, has methods for output, inputVariety as a String,
 * inputNumber as an int, and calculate grand total based on two int values.
 */
public class Farmer {
	// instance of class Scanner for inputs, variable is named keyboard.
    private Scanner keyboard = new Scanner(System.in);
    
    /*
     * Returns a reference to String read from the standard input stream 
     * using instance of class Scanner
     */
    public String inputVariety() {
    	return keyboard.nextLine(); // grabs all text, including enter key character(s)
    }
    
    /*
     * Returns an int value read from the standard input stream using instance of Scanner
     */
    public int inputNumber() {
    	int value = keyboard.nextInt(); // leaves enter key character(s)
    	keyboard.nextLine(); // remove enter key character(s)
    	return value;
    }
    
    /*
     * Outputs a String using standard output stream, adds line return.
     */
    public void output(String message) {
    	System.out.println(message);
    }
    
    /*
     * Returns result of multiplying the two int parameters.
     */
    public int calculateGrandTotal(int total1, int total2) {
    	return total1 + total2;
    }
}

/* If you do not remove invisible keyboard enter-key characters after inputting a
 * number, the next call to nextLine() instantly returns and does not have anything.
 * The symptom is that your program asks the user to enter a value, but immediately
 * skips to the next step before they can type.
 * nextInt() ignores enter-key characters if present, and leaves them behind....
 * nextLine() immediately stops reading in characters when it see's enter-key characters.
 * The enter-key character(s) is actually referred to as the line-terminator character sequence.
 * Depending on the operating system it can be either one character, or two.
 * See Cay Horstmann. 2019. Big Java Early Objects. 7th Ed. Wiley. Chapter 11 Section 11.2.8 
 * page 393.
 */
