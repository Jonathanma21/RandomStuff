/**
 * 
 * By Jonathan Ma
 *If Birthday Assignment
 */

import java.util.Scanner;
public class ifIntro 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = user.nextLine();
		System.out.print("\nPlease enter your birthday: ");
		int birthDay = user.nextInt();
		System.out.print("\nPlease enter your birthmonth (number): ");
		int birthMonth = user.nextInt();
		System.out.print("\nPlease enter your birthyear: ");
		int birthYear = user.nextInt();
		
		System.out.print("\nNow for the second person.");
		user.nextLine();
		System.out.print("\nSecond person, please enter your name: ");
		String name2 = user.nextLine();
		System.out.print("\nPlease enter your birthday: ");
		int birthDay2 = user.nextInt();
		System.out.print("\nPlease enter your birthmonth (number): ");
		int birthMonth2 = user.nextInt();
		System.out.print("\nPlease enter your birthyear: ");
		int birthYear2 = user.nextInt();
		
		if (birthYear < birthYear2)
		{
			System.out.println(name + " is older then " + name2);
			if (birthYear == birthYear2)
			{	
				if (birthMonth < birthMonth2)
				{
					System.out.println(name + " is older then " + name2);
				
					if (birthMonth == birthMonth2)
					{
						if (birthDay < birthDay2)
						{
							System.out.println(name + " is older then " + name2);
						}
						else
						{
							System.out.println(name2 + " is older then " + name);
						}
					}
				}
				else
				{	
					System.out.println(name2 + " is older then " + name);
				}
			}
		
		
		}
		else
		{
			System.out.println(name2 + " is older then " + name);
		}
		
		}
	}
