import java.util.Scanner;

public class Driver {
	
	public static void printAccountInformation(BankAccount tempAccount) {
		System.out.println("Account Number : " + tempAccount.getAccountNumber() +
			"\nFull Name : " + tempAccount.getCustomerName() +
			"\nBalance : $" + tempAccount.getBalance() +
			"\nCreated Date : " + tempAccount.getYearCreatedAccount() + "-" +
			tempAccount.getMonthCreatedAccount());
	}
	
	public static void makeTransition(BankAccount first, BankAccount second) {
		Scanner input = new Scanner(System.in);
		System.out.println("If you are the first user, please enter 1. Otherwise, please enter 2: ");
		int numEntered = input.nextInt();
		System.out.println("For deposit please enter d, for withdraw please enter W: ");
		String stringEntered = input.next().toLowerCase();
		System.out.println("Please enter the amount that you want to make transition: ");
		double amountEntered = input.nextDouble();
		
		if (numEntered == 1) {
			switch (stringEntered) {
				case "d" :
					first.deposit(amountEntered);
					printAccountInformation(first);
				case "w" :
					first.withdraw(amountEntered);
					printAccountInformation(first);
				default :
					System.err.println("wrong input");
			}
		} else if (numEntered == 2) {
			switch (stringEntered) {
			case "d" :
				second.deposit(amountEntered);
				printAccountInformation(second);
			case "w" :
				second.withdraw(amountEntered);
			default :
				System.err.println("wrong input");
				printAccountInformation(second);
			}			
		} else {
			System.err.println("wrong input");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		BankAccount b1 = new BankAccount(null, 0, 0, 0);
		BankAccount b2 = new BankAccount("Jane Doe", 1000, 2020, 3);
		
		printAccountInformation(b1);
		System.out.println("");
		printAccountInformation(b2);
		
		makeTransition(b1, b2);
		
//		System.out.println("\nEnter the amount that you want to deposit to first account: ");
//		b1.deposit(input.nextDouble());
//		printAccountInformation(b1);
//		
//		System.out.println("\nEnter the amount that you want to withdraw from second account: ");
//		b2.withdraw(input.nextDouble());
//		printAccountInformation(b2);
	}
}
