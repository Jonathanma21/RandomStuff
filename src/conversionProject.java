/**
 * By Jonathan Ma
 * Conversion project
 */
import java.util.Scanner;

public class conversionProject {

	public static void main(String[] args) 
	{
		System.out.println("5 feet in inches is: " + feetToInches(5) + " inches");
		System.out.println("5 miles in feet is: " + milesToFeet(5) + " feet");
		System.out.println("5 yards in meters is: " + yardsToMeters(5) + " meters");
		System.out.println("5 pounds in kilograms is: " + poundsToKilograms(5) + " kilograms");
	}
	
	public static float feetToInches(float num1)
	{
		float inches = 12 * num1;
		return inches;
	}
	public static float milesToFeet(float num2)
	{
		float feet = 5280 * num2;
		return feet;
	}
	public static float yardsToMeters(float num3)
	{
		float meters = (float) (num3/1.094);
		return meters;
	}
	public static float poundsToKilograms(float num4)
	{
		float kilograms = (float) (num4/2.205);
		return kilograms;
	}

}