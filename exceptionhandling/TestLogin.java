package in.co.exceptionhandling;

public class TestLogin {
public static void main(String[] args) {
	String name ="admi";
	if (name=="admin"){
		System.out.println("valid");
	}else{
		try {
			throw new Login();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			}
		}
}
}
