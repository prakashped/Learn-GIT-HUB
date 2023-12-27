package SeleniumJava.SeleniumJava;

public class CharAt {

	public static void main(String[] args) {
		String name="level", name1="";
		for(int i=name.length(); i>0;i--) {
			System.out.println(name.charAt(i-1));
			name1 = name1 + name.charAt(i-1);		
		}
		System.out.println(name1);
		if(name.equalsIgnoreCase(name1)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}


