
public class Question_12 {

	public static void main(String[] args) {
		// palindrome number

		int r,s = 0,temp;
		int n = 221;

		temp = n;

		while (n > 0) {
			r = n % 10;// 1
			s = (s * 10) + r;// 1
			n= n / 10;//
		}

		if (temp == s) {
			System.out.println("It is a plindrome number");
		} else {
			System.out.println( "It is not a palindrome number");
		}

	}
}
