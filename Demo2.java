package exceptionhandle;

public class Demo2 {
	public static void main(String[]args) {
		try {
		String noPlate="TN28AX2345";
		int a=Integer.parseInt(noPlate);
		System.out.println(a);
		}
		catch(ArithmeticException ae) {
			System.out.println("it is string");
		}
		catch(NullPointerException ab) {
			System.out.println("String");
		}
		catch(Exception ac) {
			System.out.println("need something");
		}
		
		finally {
			System.out.println("hello");
		}
		System.out.println("hi");
		System.out.println("****");
	}

}
