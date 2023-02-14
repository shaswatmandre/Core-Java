package in.co.basics;

public class Marksheet2 {

	public static void main(String[] args) {
		//int marks = 33;
		int english = 55;
		int hindi = 55;
		int maths = 55;
		int physics = 55;
		int chemistry = 55;
		float totalmarks = english + hindi + maths + physics + chemistry;
		float percentage = totalmarks / 5;
		System.out.println(percentage);
		

		if (english > 32 && hindi > 32 && maths > 32 && physics > 32 && chemistry > 32) {
			System.out.println("you are pass");

			if (percentage >= 90) {
				System.out.println("a+ grade");
				

			}
			if (percentage >= 80 && percentage < 90) {
				System.out.println("a grade");

			}
			if (percentage >= 70 && percentage < 60) {
				System.out.println("b+ grade");

			}
			if (percentage >= 60 && percentage < 50) {
				System.out.println("c+ grade");

			}
			if (percentage >= 50 && percentage < 40) {
				System.out.println("c grade");

			}
			if (percentage >= 33 && percentage > 40) {
			}
		} else {
			System.out.println("you're fail in a subject");
		}

	}
}
