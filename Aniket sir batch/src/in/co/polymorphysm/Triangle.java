package in.co.polymorphysm;

public class Triangle extends Shape {

	private int base;
	private int height;

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public double area() {
		double rarea = (base*height)/2;
		System.out.println("Triangle area:- "+rarea );
		return (base*height)/2;
	}

}
