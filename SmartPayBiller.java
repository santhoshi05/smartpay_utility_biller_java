import java.util.*;
import java.util.InputMismatchException;
public class SmartPayBiller {
	public static void validateMeter(int prev, int curr) throws MeterException {
		if (prev < 0 || curr < 0) {
			throw new MeterException("Meter readings cannot be negative");
		}
		if (curr < prev) {
			throw new MeterException("Current reading cannot be less than previous reading");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UtilityBill bill = new UtilityBill();
		System.out.println("Welcome to Smart Pay");
		while (true) {
			System.out.println("Enter your choice: ");
			System.out.println("1. GENERATE BILL\n2. EXIT");
			System.out.print("Your choice: ");
			int choice;
			try {
				choice = sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Invalid input...Enter number only");
				sc.next();
				continue;
			}
			switch (choice) {
				case 1:
					sc.nextLine();
					System.out.print("Enter Name: ");
					String name = sc.nextLine();
					int prev = 0, curr = 0;
					while (true) {
						try {
							System.out.print("Enter Previous Reading: ");
							prev = sc.nextInt();
							System.out.print("Enter Current Reading: ");
							curr = sc.nextInt();
							validateMeter(prev, curr);
							break;
						}
						catch (InputMismatchException e) {
							System.out.println("Please enter numbers only!");
							sc.next();
						}
						catch (MeterException e) {
							System.out.println("ERROR: " + e.getMessage());
							System.out.println("Enter correct meter readings");
						}
					}
					int units = curr - prev;
					double total = bill.calculateTotal(units);
					double tax = bill.getTaxAmount();
					System.out.println("_________DIGITAL RECEIPT__________");
					System.out.printf("%-20s : %s\n", "NAME", name);
					System.out.printf("%-20s : %d\n", "UNITS CONSUMED", units);
					System.out.printf("%-20s : %.2f\n", "TAX AMOUNT (10%)", tax);
					System.out.printf("%-20s : %.2f\n", "TOTAL AMOUNT", total);
					System.out.println("__________________________________");
					break;
				case 2:
					System.out.println("THANK YOU");
					System.exit(0);
				
				default:
					System.out.println("INVALID INPUT");
			}
		}
	}
}