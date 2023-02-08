package in.co.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class TesstQueue {

	public static void main(String[] args) {
		
		LinkedList q = new LinkedList();
		
		q.offer("shaswat");
		q.offer('#');
		q.offer(123);
		q.offer(10.3);
		q.offer(false);
		
		//System.out.println(q);
		
		Iterator it = q.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
