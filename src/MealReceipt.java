/**
 * Meal receipt
 * @author Jonathan ma
 *
 */
import java.util.Scanner;

public class MealReceipt 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.print("Welcome to the Tax and Tip calculator for all of your meal needs!");
		System.out.print("\nPlease press enter to begin...");
		user.nextLine();
		
		System.out.print("\nI will need the name of your appetizer: ");
		String appName = user.nextLine();
		
		System.out.print("\nI will now need the price of your appetizer: ");
		String appStr = user.nextLine();
		double appValue = Double.parseDouble(appStr);
		
		System.out.print("\nPlease enter the name of your entree: ");
		String entreeName = user.nextLine();
		
		System.out.print("\nNow please enter the price of your entree: ");
		String entreeStr = user.nextLine();
		double entreeValue = Double.parseDouble(entreeStr);
		
		System.out.print("\nEnter the name of your drink: ");
		String drinkName = user.nextLine();
		
		System.out.print("\nPlease enter the price of your drink: ");
		String drinkStr = user.nextLine();
		double drinkValue = Double.parseDouble(drinkStr);
		
		System.out.print("\nEnter the name of your dessert: ");
		String dessertName = user.nextLine();
		
		System.out.print("\nNow please enter the price of your dessert: ");
		String dessertStr = user.nextLine();
		double dessertValue = Double.parseDouble(dessertStr);
		
		System.out.print("\nNow what percentage would you like to leave as a tip (decimal): ");
		String tipStr = user.nextLine();
		double tipValue = Double.parseDouble(tipStr);
		
		double subTotal = appValue + entreeValue + drinkValue + dessertValue;
		double salesNoRound = subTotal * 0.06;
		double salesRounded = (double) Math.round(salesNoRound * 100) / 100;
		double tipNoRound = subTotal * tipValue;
		double tipRounded = (double) Math.round(tipNoRound * 100) / 100;
		double totalValue = subTotal + tipRounded + salesRounded;
		
		System.out.print("\nHere are your results:");
		System.out.print("\nItem: Price:");
		System.out.print("\n" + appName + ": " + "$" + appValue);
		System.out.print("\n" + entreeName + ": " + "$" + entreeValue);
		System.out.print("\n" + dessertName + ": " + "$" + dessertValue);
		System.out.print("\n" + drinkName + ": " + "$" + drinkValue);
		
		System.out.print("\nSubtotal: " + "$" + subTotal);
		System.out.print("\nTax: " + "$" + salesRounded);
		System.out.print("\nTip: " + "$" + tipRounded);
		System.out.print("\nTotal: " + "$" + totalValue);
		
	}

}
