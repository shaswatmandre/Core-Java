
public class Question10 {

	public static void main(String[] args) {
		// Armstrong number
		
		int num = 153;
		int remainder;
		int armstrong =0;
		int temp = num;
		
		
		while (num>0)
		{
			remainder=num%10;
			armstrong=armstrong+(remainder*remainder*remainder);
			num=num/10;
			
		}
		if (temp==armstrong)
		{
			System.out.println("yes its a armstrong");
			
		}
		else
		{
			System.out.println("its not a armstrong");
		}

	}

}
