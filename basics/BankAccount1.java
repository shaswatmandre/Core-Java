package in.co.basics;

public class BankAccount1 {

	public static void main(String[] args) {
		int balance = 10000, deposit = 100, transfer = 000;

	
		if (deposit > 0 && transfer > 0) {
			System.out.println(balance);
			System.out.println("You cannot perform two actions at one time");
			
		}

		else if (deposit > 0) {
			deposit = deposit + balance;
			System.out.println("your new balance after money deposit is:- " + deposit);
		} else if (transfer > 0) {
			transfer = balance - transfer;
			System.out.println("your new balance after money transfer is:- " + transfer);
		}

		else

		{
			System.out.println("your ac balance is:- "+balance);
		}

	}

}
