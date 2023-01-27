package in.co.basics;

public class CarGear {

	public static void main(String[] args) {
		int gear = 6;
		
		switch (8) {
		case 1:
			System.out.println("0kmph - 20kmph");
			
			break;
			
		case 2:
			System.out.println("0kmph - 20kmph");
			
			break;
			
		case 3:
			System.out.println("20kmph - 40kmph");
			
			break;
		case 4:
			System.out.println("40kmph - 60kmph");
			
			break;
			
		case 5:
			System.out.println("60kmph - 80kmph");
			
			break;
			
			
		case 6:
			System.out.println("110kmph - 140kmph");
			
			break;
		case 7:
			System.out.println("Reverse");
			break;

		default:
			System.out.println("Neutral");
			break;
		
		}
	}

}
