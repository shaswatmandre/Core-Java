package in.co.basics;

public class SwitchCase {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int key = 3;
		
		
		switch (key) {
		case 1:
		int	add  =a+b;
			System.out.println(add);
			
			break;
		case 2:
			int sub = a-b;
			System.out.println(sub);
			
		case 3:
			int div = a/b;
			System.out.println(div);
			break;

		default:
			int multi = a*b;
			System.out.println(multi);
			break;
		}
	}
}
