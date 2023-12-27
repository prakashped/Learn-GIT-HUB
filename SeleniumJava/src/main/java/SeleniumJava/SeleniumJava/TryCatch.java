package SeleniumJava.SeleniumJava;

public class TryCatch {

	public static void main(String[] args) {
		try {
			int a=25;
			int b=0;
			int c=a/b;
			System.out.println("The value of C is " +c);
			
		}
		catch(Exception e) {
			System.out.println("The exceptions occured in the try block");
			
		}
		finally {
			System.out.println("Finally block");
		}
		System.out.println("Rest of the code continues");
	}

}
