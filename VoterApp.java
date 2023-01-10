package exceptionhandle;

public class VoterApp {
	public static void main(String[]args) throws AgeException,Exception{
		String name="Gowtham";
		int age=16;
		System.out.println(name);
		try {
		if(age>18) {
			System.out.println("Eligible for vote");
		}
		else {
			throw new AgeException("Not eligible to vote");
		}
		}
		catch(Exception b) {
			System.err.println("not eligible");
		}
		System.out.println("hi");
	}

}
