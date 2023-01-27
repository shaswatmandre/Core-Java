package in.co.oop;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		
		r.setLength(10);
		r.setColor("red");
		r.setWidth(20);
		System.out.println(r.getLength()+r.getWidth());
		System.out.println(r.getColor());
		
	}

}
