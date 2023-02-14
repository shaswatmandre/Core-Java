package in.co.exceptionhandling;

public class Arithmatic {

	public static void main(String[] args) {       
		int k =0;
		int i =15;	 
		try {
			double div = i/k;
			System.out.println(div);
		} catch (Exception darshan) {
			// TODO: handle exception
			
			System.out.println("invalid entry");
			System.out.println(darshan.getMessage());
		}
		
		
		
	}

}
