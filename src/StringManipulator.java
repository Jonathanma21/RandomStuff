/**
 * String Manipulator
 * By Jonathan Ma
 *
 */

import java.util.Scanner;
public class StringManipulator 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.print("Please enter any string: ");
		String userStr = user.nextLine();
		
		int strLength = userStr.length();
		char charFirst = userStr.charAt(0);
		char charLast = userStr.charAt(strLength-1);
		System.out.print("\nYour string length is: " + strLength + ". The first and last letter of the string is: " + charFirst + " and " + charLast + " respectively.");
		
		int halfStr = strLength/2;
		String subStr = userStr.substring(0, halfStr);
		System.out.print("\nHalf of your stirng is: " + subStr);
		
		System.out.print("\nPlease enter a desired character that you want to find: ");
		String searchChar = user.nextLine();
		int charPos = userStr.indexOf(searchChar);
		System.out.print("\nYour desired charecter can be found at index number: " + charPos);
		
		System.out.print("\nPlease enter a start index: ");
		String startStr = user.nextLine();
		System.out.print("\nPlease enter the ending index: ");
		String endStr = user.nextLine();
		int startInd = Integer.parseInt(startStr);
		int endInd = Integer.parseInt(endStr);
		String startEnd = userStr.substring(startInd, endInd);
		System.out.print("\nYour desired substring is: " + startEnd);
	}

}
