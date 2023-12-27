package SeleniumJava.SeleniumJava;

public class MethodOverRiding1 extends MethodOverRiding{
@Override void show() {
	System.out.println("This is Child class");
	
}
	public static void main(String[] args) {
		MethodOverRiding obj=new MethodOverRiding();
		obj.show();
		MethodOverRiding obj1=new MethodOverRiding1();
		obj1.show();
	}

}
