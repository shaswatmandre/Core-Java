package in.co.basics;

public class Triangle {

	public static void main(String[] args) {

		int english = 52, hindi = 60, maths = 50;
		float totalmarks = english + hindi + maths;
		float percent = totalmarks / 3;

		if (english <=100 && english >= 00 && hindi <= 100 && hindi >= 00 && maths < 100 && maths >= 00) {

			System.out.println(percent);
			if (percent <= 100 && percent >= 00) {
				System.out.println("pass");
			}

			if (percent >= 90 && percent <= 100) {
				System.out.println("a+ grade");
			}
			if (percent >= 80 && percent < 70) {
				System.out.println("a grade");

			}
			if (percent >= 70 && percent < 60) {
				System.out.println("b+ garde");
			}
			if (percent >= 60 && percent < 50) {
				System.out.println("b grade");
			}
			if (percent >= 50 && percent < 40) {
				System.out.println("c grade");
			}
			if (percent >= 33 && percent < 40) {
				System.out.println("d grade");

			}

		} else {
			System.out.println("you're fail in any subject");
		}
	}
}
