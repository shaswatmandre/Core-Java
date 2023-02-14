 package in.co.basics;

public class fibonnaci {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c ;
		int d ;
		
		System.out.println(a);
		System.out.println(b);
		
		for (d=1; d<10;++d)
		{
			c=a+b;
			System.out.println(c);
			
			a=b;
			b=c;
		}

	}

}
