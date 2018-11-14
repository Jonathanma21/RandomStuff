/**
 * 
 * By Jonathan Ma
 * Season project
 */
import java.util.Scanner;

public class seasonProject 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		
		System.out.print("Hello User! What is your name?: ");
		String name = user.nextLine();
		System.out.print("Now please enter your birthmonth(numerical): ");
		int birthMonth = user.nextInt();
		
		if (birthMonth < 1 || birthMonth > 12)
		{
			System.out.println("You have entered a birthmonth outside of the calander. Please try again.");
		}
		
		if (birthMonth == 12 || birthMonth <= 2)
		{
			System.out.println(name + " your birthday is in Winter.");
		}
		if (birthMonth >=3 && birthMonth <=5)
		{
			System.out.println(name + " your birthday is in Spring.");	
		}
		if (birthMonth >=6 && birthMonth <=8)
		{
			System.out.println(name + " your birthday is in Summer.");	
		}
		if (birthMonth >=9 && birthMonth <=11)
		{
			System.out.println(name + " your birthday is in Fall.");	
		}
	}

}
