package in.co.inheritance;

public class TestAll {

	public static void main(String[] args) {
		
		Rectangle1 r = new Rectangle1();
		Traingle t = new Traingle();
		Circle c = new Circle();
		
		r.setColor("Blue");
		r.setLength(20);
		r.setWidth(10);
		System.out.println(r.getColor());
		System.out.println(r.area());
		
		t.setBase(10);
		t.setHeight(5);
		System.out.println(t.area());
		
		c.setRadius(10);
		System.out.println(c.area());
		
		
		

	}

}
