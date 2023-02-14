package in.co.polymorphysm;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle(int length, int width) {

		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		double rarea = length*width;
		System.out.println("Reactangle_area:- "+rarea);
		return length*width;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}
	

}
