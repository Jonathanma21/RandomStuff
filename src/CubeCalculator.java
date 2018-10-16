import java.util.Scanner;

public class CubeCalculator 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.println("Hello! Welcome to the Cube calculator!");
		System.out.println("Please press enter to continue...");
		user.nextLine();
		
		System.out.println("To find out the volume of a cube please type in the measure of the side: ");
		String side = user.nextLine();
		double sideLength = Double.parseDouble(side);
		
		System.out.println("Now please enter your units for the calculation: ");
		String units = user.nextLine();
		
		double volume = sideLength * sideLength * sideLength;
		
		System.out.println("The volume of your Cube is: " + volume + " " + units + "^2");

		
	}

}
