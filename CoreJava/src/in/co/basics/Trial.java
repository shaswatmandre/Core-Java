package in.co.basics;

public class Trial {

	public static void main(String[] args) {

		int marks = 35;
		if (marks > 90 && marks < 101) {
			System.out.println("a+");
		}
		if (marks > 80 && marks < 91) {
			System.out.println("a");
		}
		if (marks > 70 && marks < 81) {
			System.out.println("b+");
		}
		if (marks > 40 && marks < 71) {
			System.out.println("b");
		}

		if (marks < 40) {
			System.out.println("fail");
		}

	}

}
