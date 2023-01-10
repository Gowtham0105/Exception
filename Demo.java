package exceptionhandle;

public class Demo {
	public static void main(String[]args) {
		String name=null;
		try {
			System.out.println(name.toUpperCase());
		}
		catch(NullPointerException npe) {
			System.out.println("please give value");
			npe.printStackTrace();
		}
		finally {
			System.out.println("give value");
		}
	}

}
