package in.co.basics;

public class Marksheet {
	public static void main(String[] args) {

		int English = 94;
		int Hindi = 43;
		int Chemistry = 93;
		int Mathamatics = 35;
		int Physics = 33;
		
		if(English<=100 && English>=00 && Hindi<=100 && Hindi>=00 && Chemistry<=100 && Chemistry>=00 && Mathamatics<=100 && Mathamatics>=00 && Physics<=100 && Physics>=00) {
		
		
		float totalmarks = English + Hindi + Chemistry + Mathamatics + Physics;
		float percentage = totalmarks / 5;

		if (percentage <= 100) {

			System.out.println(percentage);
			}

		if (English > 32 && Hindi > 32 && Chemistry > 32 && Mathamatics > 32 && Physics > 32) {
			
				System.out.println("you're pass");
			

			if (percentage >= 90 && percentage < 100) {
				System.out.println("A+ Grade");
			}
			if (percentage >= 80 && percentage < 90) {
 
				System.out.println("A Grade");
			}
			if (percentage >= 70 && percentage < 80)

			{
				System.out.println("B+ Grade");
			}
			if (percentage >= 60 && percentage < 70)

			{
				System.out.println("C+ Grade");
			}
			if (percentage >= 50 && percentage < 60)

			{
				System.out.println("C Grade");
			}
			if (percentage >= 40 && percentage < 50)

			{
				System.out.println("D+ Grade");

			}
			if (percentage >= 33 && percentage < 40) {
				System.out.println("D Grade");
			}

		} else if (totalmarks > 100) {
			System.out.println("your fail");
		}
	}else {
		System.out.println("invalid input");
	}
}
}