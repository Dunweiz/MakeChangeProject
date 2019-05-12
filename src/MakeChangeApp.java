import java.util.Scanner;

public class MakeChangeApp {
	public static void main(String[] args) {
		// Prompt user for value.
		Scanner input = new Scanner(System.in);
		double change = 0;

		System.out.println("Please input the item amount: ");
		double price = input.nextDouble();
		System.out.println("How much are you paying?");
		double paid = input.nextDouble();

		isThatEnough(price, paid);

		changeNeeded(paid, price, change);
		System.out.print(" is your change");

	}

	public static void isThatEnough(double price, double paid) {
		if (paid == price) {
			System.out.println("That is the correct amount.");

		} else if (paid >= price) {
			System.out.println("That is more then enough please wait for the change.");

		} else {
			System.out.println("That is not enough.");

		}
	}

	public static void changeNeeded(double price, double paid, double change) {
		change = price - paid;
//		double tendered = paid;
		System.out.println(change);
		int count = 1;

		if (change >= 50) {
			change = change - 50;
			System.out.print(change + " ");
			System.out.print(count + " $50 ");

		}
		if (change >= 20) {
			change = change - 20;
			System.out.print(count + " $20 Bill ");

		}
		if (change >= 10) {
			change = change - 10;
			System.out.print(count + " $10 Bill ");

		}
		if (change >= 5) {
			change = change - 5;
			System.out.print(count + " $5 Bill ");

		}
		count = 0;
		while (change >= 1 && count <= 5) {
			change = change - 1;
			count += 1;

		}
		System.out.print(count + " $1 Bill ");
		
		double tendered = 1; count = 1;
		while(tendered % .25 == 0 && change > .25 && count < 3) {
			tendered = .25 * count;
			change = change - .25;
			System.out.println("Change as it's subtracting quarters: " + change);
			count += 1;
		}
		System.out.println(count + " Quarters ");
		System.out.println("Change after quarters: " + change);
		
		
		count = 0;
		while (tendered % .1 == 0 && change > .1 && count < 2){
			tendered = .1 * count;
			change = change - .1;
			count += 1;
			System.out.print(count + " Dime ");
			
			
		}
		
		count = 1;
		if (tendered % .05 == 0 && change < 1) {
			tendered = .05 * count;
			System.out.print(count + " Nickle ");
		}
		count = 0;
		while (change < 1 && count <= 5) {
			change = change + .01;
			count += 1;
		}
		System.out.print(count + " Pennies ");

	}

}
