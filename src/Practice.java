import java.util.Scanner;

public class Practice 
{

	public static void main(String[] args) 
	{
		//Printing
		System.out.println("I know how to print");
		
		//Printing value of a variable
		int integer = 5; //declared and initialization --> first assignment statement
		double decimals = 3.01; //Declared and initialized in same line
		String sentence = "wow i can do this"; //Declared and initialized in one
		
		//Print the value of each
		System.out.println("ayyyy this is my integer: " + integer + "\nThis is my double var: " + decimals + "\nThis is my string: " + sentence);
		
		integer += 30;
		decimals -= 25.18932176;
		sentence += " and this is me adding more stuff";
		
		System.out.println("\nInteger: " + integer); 
		System.out.println("Double: " + decimals);
		System.out.println("String: " + sentence);
		
		//Create scanner for input
		Scanner user = new Scanner(System.in); 
		
		//Create new string variable
		String newstring = "What is your favorite sport: ";
		System.out.println(newstring);
		String sport = user.nextLine();
		System.out.println("Your favorite sport is " + sport + " while my favorite sport is Tennis");
		
		
	}

}
