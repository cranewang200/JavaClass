/*
 * Assessment: Exercise 01
 * Student Name: Ming Wang
 * Due Date: Friday, Jan. 22
 * Description: A simple program to output a name and the date and time.
 * Professor Name: Stanley Pieda
 */
import java.util.Date;
import java.text.DateFormat;

/* A simple class that outputs a greeting to the console. */
public class Greeting{		

    /* Entry point for the application. */
    public static void main(String[] args){		
	Date todayDateTime = new Date();	//declare variable and assign memory space
	DateFormat dateFormat = DateFormat.getDateTimeInstance();	//declare variable instance
        System.out.println("Hello, my author's name is " + "Ming Wang");	//print first line message
        System.out.println("Today is: " + dateFormat.format(todayDateTime));//print second line date
    }
}	//end application
