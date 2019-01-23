import java.util.Scanner;

public class conversionProject {

	public static void main(String[] args) 
	{
		System.out.println("Hello! Welcome to the conversion calculator.");
		System.out.println("If you would like to convert feet to inches enter Y: ");
		System.out.println("If you would like to convert miles to feet enter Y: ");
		System.out.println("If you would like to convert yards to meters enter Y: ");
		System.out.println("If you would like to convert pounds to kilograms enter Y: ");
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
