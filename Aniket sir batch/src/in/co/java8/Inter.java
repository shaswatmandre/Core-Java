package in.co.java8;

@FunctionalInterface
public interface Inter {
	public int add(int a, int b);
	
	public default void def() {
		System.out.println("i'm default method.");
	}
	public static void Static() {
		System.out.println("i'm static method");
	}
}
