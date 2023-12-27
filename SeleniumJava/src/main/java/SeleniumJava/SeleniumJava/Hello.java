package SeleniumJava.SeleniumJava;

public class Hello  {
	//Java1 j = new Java1();
	public void display() {
		System.out.println("Display is void method");
		String sr= Java1.method();
		System.out.println(sr);
		System.out.println(Java1.method());
	}
public static void display1() {
	System.out.println("Display1 is static method");
	
}
	public static void main(String[] args) {
		Hello obj=new Hello();
		obj.display();
		display1();
	}

}
