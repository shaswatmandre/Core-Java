package in.co.java8;

public class TestInter {
	public static void main(String[] args) {
		
		Inter t = (a,b)->{
			return a+b;
			
		};
		int t1 = t.add(10, 20);
		System.out.println(t1);
		
		Inter t2 = (a,b)->{
			return a-b;
			
		};
		int t3 = t2.add(10, 20);
		System.out.println(t3);
		t.def();
		Inter.Static(); 
	}
	
}
