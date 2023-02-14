package in.co.Interfaces;

public class Businessman implements RichMan1, SocialWorker {

	@Override
	public void Helptoothers() {
		System.out.println("help to others");

	}

	@Override
	public void earnMoney() {
		System.out.println("earning money");

	}

	@Override
	public void donation() {
		System.out.println("giving donation");

	}

	@Override
	public void party() {
		System.out.println("doing party");

	}

}
