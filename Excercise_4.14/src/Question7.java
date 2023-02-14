
public class Question7 {

	public static void main(String[] args) {
		//write a program to find sum of all integers greater than 100 and smaller than 200 which are divisible by 7 
		
		int add = 0,i;
		for (i=100; i<=200;i++)
		{
		if (i%7==0)
		{
			add = add + i;
			System.out.println(i);
		}
		}
		System.out.println(add);
	}

}
