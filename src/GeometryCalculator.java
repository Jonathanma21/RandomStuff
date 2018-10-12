import java.util.Scanner;
public class GeometryCalculator 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = user.nextLine();
		System.out.println("\n\nHello, " + name + ", welcome to the Geometry Calculator!!!!");
		
		System.out.println("Press enter to continue...");
		user.nextLine();
		
		System.out.println("AREA OF A TRIANGLE");
		System.out.print("Please enter the measure of the base: ");
		String baseStr = user.nextLine();
		double base = Double.parseDouble(baseStr);
		
		System.out.print("\nPlease enter the measure of the height: ");
		String heightStr = user.nextLine();
		double height = Double.parseDouble(heightStr);
		
		System.out.print("Please enter the unit of measure: ");
		String measure = user.nextLine();
		
		double area = 0.5 * base * height;
		
		System.out.print("\nThe area of your triangle is: " + area + " " +  measure + "^2");
	}

}
