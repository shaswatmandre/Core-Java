package in.co.polymorphysm;

public class Circle extends Shape {
	@Override
	public double area() {
		double 
		return 3.14*(radius*radius) ;
	}

	private int radius;

	public Circle(int radius) {
		
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

}
