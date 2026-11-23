package tka.practiceQuestions;

//Question : You are developing a simple ATM application where customers can check their balance and withdraw money.
public class ATM {
	double balance = 10000.0;

	public void checkBalance() {
		System.out.println("Available balance : " + balance);
	}

	public void withdrawMoney(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid withdrawal amount..");
		} else if (amount > balance) {
			System.out.println("Insufficient balance..");
		} else {
			balance = balance - amount;
			System.out.println("Please collect your cash");
			System.out.println("Withdrawal amount successful");
			System.out.println("Remaining balance : " + balance);
		}

	}

	public void depositeMoney(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid deposite amount");
		}else {
			balance=balance+amount;
			System.out.println("Amount deposite successfully");
			System.out.println("Remaining balance : " +balance);
		}
		
	}

}
