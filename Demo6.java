package exceptionhandle;

public class Demo6 {
	public static void main(String[]args) {
		int [] a= {1,2,3,4};
		try {
		System.out.println(a[4]);
		}
		catch(Exception b) {
			System.out.println("no");
		}
	}

}
