package in.co.polymorphysm;

public class TestAll {

	public static void main(String[] args) {

		// Rectangle r = new Rectangle(10, 20);
		// System.out.println(r.area());
		// Triangle t = new Triangle(5, 10);
		// System.out.println(t.area());
		// Circle c = new Circle(10);
		// System.out.println(c.area());
		
		Shape[] s = new Shape[3];
		s[0] = new Rectangle(10,20);
		s[1] = new Triangle(40,80);
		s[2] = new Circle(10);
		
		double totalarea = 0;
		for (int i =  0; i < s.length;i++)
		{
			totalarea=totalarea + s[i].area();
			
		}
		System.out.println(totalarea);
		
		

	}

}
