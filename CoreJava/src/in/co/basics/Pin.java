package in.co.basics;

public class Pin {

	public static void main(String[] args) {
		// ATM Pin
		int pin = 1234;
		int cpin = 1234;

		if (pin == 1234) {
			if (cpin == pin) {
				System.out.println("withdral money");
			} else if (cpin != pin) {
				System.out.println("incorrect cpin");
			}
		} else {
			System.out.println("invalid pin");
		}

	}

}