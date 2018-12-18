/**
 * 
 * By Jonathan Ma
 * Pennies for pay project
 *
 */
import java.util.Scanner;
public class penniesForPay 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		
		System.out.print("How many days do you want to be paid for: ");
		int paidDays = user.nextInt();
		
		double pennyAmount = 1;
		double dollars = 0;
		System.out.println("Days      Amount");
		System.out.print("\n0     $ 0.01");
		for (int days = 1; days < paidDays; days++)
		{
			pennyAmount = pennyAmount*2;
			dollars = pennyAmount/100;
			System.out.printf("\n%-5d $%5.2f",days, dollars);
		}
		System.out.printf("\nAfter " + paidDays + " days you would have earned $%.2f", dollars);
	}

}
