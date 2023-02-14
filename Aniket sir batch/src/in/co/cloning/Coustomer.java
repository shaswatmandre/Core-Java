package in.co.cloning;

public class Coustomer implements Cloneable {

	String name = null;
	BankAccount account = null;

	public Coustomer(String name) {
		this.name = name;
		account = new BankAccount(100);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Coustomer c = (Coustomer) super.clone();
		c.account = (BankAccount) account.clone();
		return c;
	}

}
