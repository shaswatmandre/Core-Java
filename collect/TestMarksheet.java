package in.co.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestMarksheet {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		Marksheet m1 = new Marksheet("shaswat", "dc101", 99, 99, 99);
		Marksheet m2 = new Marksheet("aniket", "dc102", 99, 99, 99);
		
		l.add(m1);
		l.add(m2);
		
		Iterator it = l.iterator();
		while(it.hasNext()) {
			Marksheet m = (Marksheet) it.next();
			System.out.print(m.getName()+" "+" ");
			System.out.print(m.getRollnumber()+" "+" ");
			System.out.print(m.getPhysics()+" "+" ");
			System.out.print(m.getChemistry()+" "+" ");
			System.out.println(m.getMaths()+" "+" ");
		}
		
		

	}

}
