package in.co.basics;

public class Stringclass {

	public static void main(String[] args) {
		String name = "shaswat mandre";
		System.out.println(name.length());
		System.out.println(name.charAt(5));
		System.out.println(name.indexOf('s'));
		System.out.println(name.lastIndexOf('S'));
		System.out.println(name.replace("a", "A"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.startsWith("shaswat"));
		System.out.println(name.endsWith("mandre"));
		System.out.println(name.substring(6));

	}

}
