/**
 * 
 * by jonathan ma
 * Dice rolling project part 2
 *
 */
import java.util.Random;
import java.util.Scanner;

public class howMany 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("How many time do you want to roll the dice: ");
		int userRolls = user.nextInt();
		
		int diceValue1 = 0;
		int diceValue2 = 0;
		int diceValue3 = 0;
		int diceValue4 = 0;
		int diceValue5 = 0;
		int diceValue6 = 0;
		
		for (int i = 0; i < userRolls; i++)
		{
			int diceValue = rand.nextInt(6) + 1;
			if (diceValue == 1)
			{
				diceValue1++;
			}
			if (diceValue == 2)
			{
				diceValue2++;
			}
			if (diceValue == 3)
			{
				diceValue3++;
			}
			if (diceValue == 4)
			{
				diceValue4++;
			}
			if (diceValue == 5)
			{
				diceValue5++;
			}
			if (diceValue == 6)
			{
				diceValue6++;
			}
		}
		System.out.println("With your specified number of rolls, you have rolled a 1: " + diceValue1 + " times a 2: " + diceValue2 + " times a 3: " + diceValue3 + " times a 4: " + diceValue4 + " times a 5: " + diceValue5 + " times a 6: " + diceValue6 + " times.");
		
	}

}
