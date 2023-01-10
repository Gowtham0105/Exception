package exceptionhandle;

public class Demo3 {
	public static void main(String[]args) {
		String name="Ram";
		try {
		System.out.println(name.charAt(5));
		}
		catch(ArithmeticException aa) {
			System.out.println("no");
			}
		catch(NullPointerException ab) {
			System.out.println("noo");
		}
		catch(Exception ac) {
			System.out.println("no index char there");
		}
		finally {
			System.out.println("hello");
		}
		System.out.println("no char there");
		
	}

}
