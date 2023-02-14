package in.co.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarkSheet {
	public static void main(String[] args) {

		ArrayList m = new ArrayList();
		m.add(new MarkSheet("121a", "Shaswat", "Mandre", 100));
		m.add(new MarkSheet("122b", "Darshan", "Jain", 56));
		m.add(new MarkSheet("123c", "Shaswat", "Mandre", 33));
		m.add(new MarkSheet("124d", "Ankit", "Sharma", 80));
		m.add(new MarkSheet("125e", "Sanskriti", "Verma", 70));

		Collections.sort(m, new OrderByCondition());
		for (Object o : m) {
			System.out.println(o);

		}

	}
}
