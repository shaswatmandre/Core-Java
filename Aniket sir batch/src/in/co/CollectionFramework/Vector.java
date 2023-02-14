package in.co.CollectionFramework;

import java.util.ArrayList;

public class Vector extends TestList {

	public static void main(String[] args) {

		ArrayList v = new ArrayList();
		v.add("one");
		v.add("two");
		v.add("three");

		Integer i = new Integer(7);
		v.add(i);

		Integer value = (Integer) v.get(3);
		System.out.println("Index#3 value = " + value);
	}

}
