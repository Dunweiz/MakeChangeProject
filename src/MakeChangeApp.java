import java.util.Scanner;

public class MakeChangeApp {
	public static void main(String[] args) {
		// Prompt user for value.
		Scanner input = new Scanner(System.in);

		System.out.println("Please input the item amount: ");
		double price = input.nextDouble();
		System.out.println("How much are you paying?");
		double paid = input.nextDouble();

		isThatEnough(price, paid);

		changeNeeded(paid, price);


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

	public static void changeNeeded(double price, double paid) {
		double change = paid - price, tendered = paid;
		int count = 0;

		while (count <= 5) {
			// paid 100 price 10.34
			// gave 89.66 1-50 1-20 1-10 1-5 4-1 2-.25 1-.10 1-.5 1-.01
			count++;
			break;

		}
		if (change <= tendered) {
			change = change - 50;
			System.out.print(change + " ");
			System.out.print(count + " $50 ");
			count++;

		}
		if (change <= tendered) {
			change = change - 20;
			System.out.print(count + " $20 Bill ");
			count++;

		}
		if (change <= tendered) {
			change = change - 10;
			System.out.print(count + " $10 Bill ");
			count++;

		}
		if (change <= tendered) {
			change = change - 5;
			System.out.print(count + " $5 Bill ");
			count++;

		}
		if (change <= tendered) {
			change = change - 1;
			System.out.print(count + " $1 Bill ");
			count++;

		} else {
			System.out.println("Invalid insert of cash");
		}

	}

	public static void centChange(double change) {
		int n = 0;

		while (n <= 5) {

		}

		if (change <= 1) {
			change = change + .25;
			System.out.print(n + " Quarters ");
			n++;
		}
		if (change <= 1) {
			change = change + .10;
			System.out.print(n + " Dimes ");
			n++;
		}
		if (change <= 1) {
			change = change - .01;
			System.out.print(n + " Pennies ");
			n++;
		}
	}
}