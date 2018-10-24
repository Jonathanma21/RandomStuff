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
		System.out.print("Your string length is: " + strLength + ". The first and last letter of the string is: " + charFirst + " and " + charLast + " respectively.");
		
		int halfStr = strLength/2;
		String subStr = userStr.substring(0, halfStr);
		System.out.print("\nHalf of your stirng is: " + subStr);
		
		System.out.print("\nPlease enter a desired character that you want to find: ");
		String searchChar = user.nextLine();
		int charPos = userStr.indexOf(searchChar);
		System.out.print(charPos);
		
	}

}
