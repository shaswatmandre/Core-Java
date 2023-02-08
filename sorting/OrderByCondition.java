package in.co.sorting;

import java.util.Comparator;

public class OrderByCondition implements Comparator<MarkSheet>{

	@Override
	public int compare(MarkSheet m1, MarkSheet m2) {
		if(m1.firstname.equals(m2.firstname)) {
			return m1.lastname.compareTo(m2.lastname);
		}else {
			return m1.firstname.compareTo(m2.firstname);
		}
		
	}

}
