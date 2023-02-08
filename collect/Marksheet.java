package in.co.collect;

public class Marksheet {

	private String name;
	private String rollnumber;
	private int physics;
	private int maths;
	private int chemistry;

	public Marksheet(String name, String rollnumber, int physics, int maths, int chemistry) {

		this.name = name;
		this.rollnumber = rollnumber;
		this.physics = physics;
		this.maths = maths;
		this.chemistry = chemistry;
	}

	public String getName() {
		return name;
	}

	public String getRollnumber() {
		return rollnumber;
	}

	public int getPhysics() {
		return physics;
	}

	public int getMaths() {
		return maths;
	}

	public int getChemistry() {
		return chemistry;
	}

}
