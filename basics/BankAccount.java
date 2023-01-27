package in.co.basics;

public class BankAccount {

	public static void main(String[] args) {

		int balance = 87, deposit =  0, transfer = 0;

		if (balance > 0) {
			if (transfer > 0 && deposit > 0) {
				System.out.println("invalid input");
			} else if (deposit > 0) {
				balance = balance + deposit;
				System.out.println("your new balance is:- " + balance);
			}

			else if (transfer > 0) {
				if (transfer > balance) {
					System.out.println("insufficient funds");
				} else {
					balance = balance - transfer;
					System.out.println(balance);
				}
			} else {
				System.out.println("insufficeient balance");
			}
		}
	}
}
