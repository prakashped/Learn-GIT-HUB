package SeleniumJava.SeleniumJava;

public class Constructor {
int regNo;
String nameOfStudent;
Constructor(){
	System.out.println("Default constructor");
	
	
}
Constructor(String name,int rno){
	this.nameOfStudent=name;
	this.regNo=rno;
	
	
}	
	
	public static void main(String[] args) {
		Constructor cs=new Constructor();
		Constructor cs1=new Constructor("Prakash",2507002);
		System.out.println(cs1.nameOfStudent);
		System.out.println(cs1.regNo);
		Constructor cs2=new Constructor("Shaswina",2507003);
		System.out.println(cs2.nameOfStudent);
		System.out.println(cs2.regNo);
	}

}
