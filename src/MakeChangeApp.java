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
		double missing, newpaid;
		missing = price - paid;

		// System.out.println(paid - price);

		changeNeeded(paid, price, change);
		if (paid > price) {
			input.close();
		}

	}

	public static void isThatEnough(double price, double paid) {
		if (paid == price) {
			System.out.println("That is the exact amount required.");

		} else if (paid >= price) {
			System.out.println("That is more then enough your change will be: ");

		} else {
			System.out.println("That is not enough.");

		}
	}

	public static void changeNeeded(double price, double paid, double change) {
		change = price - paid;
//		double tendered = paid;
		// System.out.println(change);
		int count = 0;
		String fifty = "";
		String hundred = "";
		while (change >= 100 && count < 100) {
			change = change - 100;
			count += 1;
			hundred = "hundred";
		}
		if(hundred.equals("hundred") && count == 1) {
			System.out.print(count + " $100 Bill");
		}
		if(hundred.equals("hundred") && count > 1) {
			System.out.print(count + " $100 Bills");
		}
		count = 0;
		while (change >= 50 && count < 100) {
			change = change - 50;
			count += 1;
			fifty = "fifty";

		}
		if (fifty.equals("fifty") && count == 1) {
			System.out.print(count + " $50 Bill ");

		} else if (fifty.equals("fifty") && count > 1) {
			System.out.print(count + " $50 Bills ");
		}
		String twenty = "";
		while (change >= 20 && count < 5) {
			change = change - 20;
			count += 1;
			twenty = "twenty";
		}
		if (twenty.equals("twenty") && count == 1) {
			System.out.print(count + " $20 Bill ");
		} else if (twenty.equals("twenty") && count > 1)
			System.out.print(count + " $20 Bills ");
		count = 1;
		if (change >= 10) {
			change = change - 10;
			System.out.print(count + " $10 Bill ");

		}
		count = 1;
		if (change >= 5) {
			change = change - 5;
			System.out.print(count + " $5 Bill ");

		}
		String one = "";
		count = 0;
		while (change >= 1 && count <= 5) {
			change = change - 1;
			count += 1;
			one = "one";

		}
		if (one.equals("one") && count == 1) {
			System.out.print(count + " $1 Bill ");
		} else if (one.equals("one") && count > 1) {
			System.out.print(count + " $1 Bills ");
		}
		// NEED TO FIX HERE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		change = change * 100;
		// System.out.println(change);
		String quarter = "";
		count = 0;
		while (change > 25 && count < 3) {
//			 System.out.print("Change as it's subtracting quarters: " + change);
			count += 1;
			change = change - 25;
			quarter = "quarter";
		}
		if (quarter.equals("quarter") && count > 1) {
			System.out.print(count + " Quarters ");
//			 System.out.print("Change after quarters: " + change);
		} else if (quarter.equals("quarter") && count == 1) {
			System.out.print(count + " Quarter ");
		}
		String dime = "";
		count = 0;
		while (change >= 10 && change > 10 && count < 2) {
			change = change - 10;
			count += 1;
			dime = "dime";
		}
		if (dime.equals("dime") && count == 1) {
			System.out.print(count + " Dime ");
		} else if (dime.equals("dime") && count > 1) {
			System.out.print(count + " Dimes ");
		}
		count = 1;
		if (change >= 5) {
			change = change - 5;
			System.out.print(count + " Nickle ");
		}
		String penny = "";
		count = 0;
		while (change >= 1 && count <= 5) {
			count += 1;
			penny = "penny";
			change = change - 1;
		}
		if (penny.equals("penny") && count == 1) {
			System.out.print(count + " Penny ");
		} else if (penny.equals("penny") && count > 1) {
			System.out.print(count + " Pennies ");
			System.out.println(" is your change");
		}
	}

}
