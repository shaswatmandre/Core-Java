package in.co.basics;

public class Marksheet3 {

	public static void main(String[] args) {
		int english = 36;
		int hindi = 70;
		int maths = 74;
		int physics = 80;
		int chemistry = 66;

		if (english <= 100 && english >= 0 && hindi <= 100 && hindi >= 0 && maths <= 100 && maths >= 0 && physics <= 100
				&& physics >= 0 && chemistry <= 100 && chemistry >= 0) {

			float totalmarks = english + hindi + maths + physics + chemistry;
			float percentage = totalmarks / 5;
			if (percentage <= 100) {
				System.out.println(percentage);
			}

			if (english > 32 && hindi > 32 && maths > 32 && physics > 32 && chemistry > 32) {

				System.out.println("you're pass");

				if (percentage >= 90 && percentage < 100) {

					System.out.println("A+ grade");
				}

				if (percentage >= 80 && percentage < 90) {
					System.out.println("A grade");
				}
				if (percentage >= 70 && percentage < 80) {
					System.out.println("B+ grade");
				}
				if (percentage >= 60 && percentage < 70) {
					System.out.println("B grade");
				}
				if (percentage >= 50 && percentage < 60) {
					System.out.println("C+ grade");
				}
				if (percentage >= 40 && percentage < 50) {
					System.out.println("C grade");
				}
				if (percentage >= 33 && percentage < 40) {
					System.out.println("D grade");

				}

			} else if (totalmarks > 100) {
				System.out.println("you're fail");
			}
		} else {
			System.out.println("invalid input");
		}
	}
}
