package exceptionhandle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CompileTimeExceptionCode {
	public static void main (String[]args) throws FileNotFoundException{
		try {
		File f=new File("C:\\Users\\ss\\Documents\\12345.txt");
		
		FileReader fread=new FileReader (f);
		int temp=0;
		while((temp=fread.read())!=-1) {
			System.out.print((char)(temp));
			
		}
		}
		catch(Exception e) {
			System.out.println("file not found");
		}
	}

}
