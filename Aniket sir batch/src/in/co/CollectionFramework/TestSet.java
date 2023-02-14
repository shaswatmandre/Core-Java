package in.co.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class TestSet {
public static void main(String[] args) {
	
	HashSet set = new HashSet();
	
	set.add("shaswat");
	set.add(123);
	set.add('#');
	set.add(12.3);
	set.add(false);
	set.add("shaswat");
	set.add("null");
	
	//System.out.println(set);
	
	Iterator it = set.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	
	
}
}
