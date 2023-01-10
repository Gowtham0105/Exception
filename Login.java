package exceptionhandle;

public class Login {
	public static void main(String[]args) throws LoginException,Exception{
		String emailId="gowtham@gmail.co";
		String pwd="one76543";
		try {
		if(emailId.contains("@gmail.com")) {
			System.out.println("Login");
		}
		else {
			throw new LoginException("Access denied");
		}
		}
		catch(Exception d) {
			System.out.println("no acess");
		}
	}

}
