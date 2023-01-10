package exceptionhandle;

public class Demo4 {
	public static void main(String[]args) {
		String name="ram";
		try {
		System.out.println(name.indexOf('e'));
		}
		catch(ArithmeticException aa) {
			System.out.println("no");
		}
		catch(NullPointerException ab) {
			System.out.println("noo");
		}
		catch(Exception ac) {
			System.out.println("no index no");
		}
		finally {
			System.out.println("hi");
		}
		System.out.println("hello");
	}

}
