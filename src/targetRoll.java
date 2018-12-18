/**
 * 
 * By jonathan Ma
 *Dice rolling project part 1
 */
import java.util.Random;
import java.util.Scanner;

public class targetRoll 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		Random rand = new Random();
		
		int diceValue = rand.nextInt(6) +1;
		int diceRoll = 0;
		int numberChoice = 0;
		boolean isNumber;
		System.out.print("Please enter a number from 1-6: ");
		
		do 
		{
		if (user.hasNextInt())
		{
			numberChoice = user.nextInt();
			isNumber = true;
		}
		else 
		{
			System.out.println("You have entered an invalid number.");
			isNumber = false;
			user.next();
			System.out.print("\nPlease enter a number from 1-6: ");
		}
		} while (!(isNumber));
		
		while (numberChoice <= 0 || numberChoice >= 7)
		{
			System.out.println("You have entered an invalid number.");
			System.out.print("\nPlease enter a number from 1-6: ");
			numberChoice = user.nextInt();
		}
		
		while (diceValue != numberChoice)
		{
			System.out.println("You rolled a " + diceValue);
			System.out.print("\nPlease press enter to roll again.");
			user.nextLine();
			diceValue = rand.nextInt(6) + 1;
			diceRoll++;
		}
		System.out.println("It took " + diceRoll + " rolls to get to your chosen number of: " + numberChoice);

	}

}
