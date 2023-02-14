package in.co.stream_api;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {
	public static void main(String[] args) {

		List l = new ArrayList();
		l.add("shaswat");
		l.add("sanskriti");
		l.add("darshan");
		l.add("nidhi");
		l.add("aniket");
		l.add("shubham");

		System.out.println(l);

		l.stream().sorted().forEach(e -> {
			System.out.println(e);
		});
	}

}
