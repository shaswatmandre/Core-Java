package in.co.oop;

public class TestArea {

	public static void main(String[] args) {
		AreaRectangle a = new AreaRectangle();
		a.setLength(20);
		a.setWidth(40);
	
		System.out.println("Area of rectangle is:- "+a.getLength()*a.getWidth());
	}

}
