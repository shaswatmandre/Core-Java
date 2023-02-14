
public class Marks {

	public static void main(String[] args) {

		int balance = 10000, deposit = 100, transfer = 10;

		if (balance>0)
		if (deposit > 0 && transfer > 0) {
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
			System.out.println("please enter a valid amount");
		}

	}
}
