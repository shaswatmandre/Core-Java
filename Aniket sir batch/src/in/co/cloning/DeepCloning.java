package in.co.cloning;

public class DeepCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Coustomer c1 = new Coustomer("shaswat");

		Coustomer c2 = (Coustomer) c1.clone();

		System.out.println(c1.name);
		System.out.println(c1.account.balance);
		System.out.println(c2.name);
		System.out.println(c2.account.balance);
	}

}
