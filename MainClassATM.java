package tka.practiceQuestions;

import java.util.Scanner;

public class MainClassATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ATM atm = new ATM();
		int choice;
		System.out.println("Welcome to ATM..!");
		do {
			System.out.println("1.Check balance");
			System.out.println("2.Withdraw Amount");
			System.out.println("3.Deposite Money");
			System.out.println("4.Exit");

			System.out.println("Enter your choice:");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				atm.checkBalance();
				break;

			case 2:
				System.out.println("Enter withdrawal amount");
				double withdrawal = sc.nextDouble();

				atm.withdrawMoney(withdrawal);
				break;

			case 3:
				System.out.println("Enter deposite amount");
				double deposite = sc.nextDouble();

				atm.depositeMoney(deposite);
				break;

			case 4:
				System.out.println("Thank you for using ATM..");
				break;

			default:
				System.out.println("Invalid choice");

			}
		} while (choice != 4);

		sc.close();

	}

}
