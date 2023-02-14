package in.co.sorting;

import java.util.Comparator;

public class OrderByFname implements Comparator<MarkSheet> {

	@Override
	public int compare(MarkSheet m1, MarkSheet m2) {

		return m1.firstname.compareTo(m2.firstname);
	}

}
