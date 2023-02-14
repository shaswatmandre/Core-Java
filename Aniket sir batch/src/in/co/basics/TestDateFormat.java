package in.co.basics;

import java.text.SimpleDateFormat;
import java.util.Date;

import sun.java2d.pipe.SpanShapeRenderer.Simple;

public class TestDateFormat {
	public static void main(String[] args) {

		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String str = format.format(d);
		System.out.println(str);
		String str1 = "23/03/2023";
		Date d1 = format.par;
		
	}

}
