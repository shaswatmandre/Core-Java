package in.co.basics;

public class ExceptionPrac {

	public static void main(String[] args) {

		int k = 0  ;
		int i = 15;

		try {
			double div = i / k;
			System.out.println("div is " + div);
		} catch (ArithmeticException a) {
			System.out.println("divided by zero");

		}

	}

}
