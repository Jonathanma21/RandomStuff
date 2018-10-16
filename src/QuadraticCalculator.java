import java.util.Scanner;

public class QuadraticCalculator 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		
		System.out.println("Hello! Welcome to the Cube calculator!");
		System.out.println("Please press enter to continue...");
		user.nextLine();
		
		System.out.println("To solve for the quadratic formula please enter the value of a: ");
		String aStr = user.nextLine();
		double aValue = Double.parseDouble(aStr);
		
		System.out.println("Now please enter the value of b: ");
		String bStr = user.nextLine();
		double bValue = Double.parseDouble(bStr);
		
		System.out.println("Finally please enter the value of c: ");
		String cStr = user.nextLine();
		double cValue = Double.parseDouble(cStr);
		
		double x1 = -bValue + Math.sqrt(bValue*bValue - 4*aValue*cValue)/2*aValue;
		double x2 = -bValue - Math.sqrt(bValue*bValue - 4*aValue*cValue)/2*aValue;
		
		System.out.println("Your first possible anwser is: " + x1 + " Your second possible answer is: " + x2);
	}

}
