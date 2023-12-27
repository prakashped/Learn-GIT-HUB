package org.login;

public class Data {
private void display() {
	String s="India is my country";
	System.out.println("emp name is "+s);
	byte age=23;
	System.out.println("emp age is "+age);
	long mobile=1234567890l;
	System.out.println("emp mobile is "+mobile);
	short salary=30000;
	System.out.println("emp slary is "+salary);
	int value=123456789;
	System.out.println("emp value is "+value);
	float p=23.34567f;
	System.out.println("emp per is "+p);
	double d=12.234567890123;
	System.out.println("emp value is "+d);
	char gen='M';
	System.out.println("emp gender is "+gen);
	boolean marital=true;
	System.out.println("emp marital is "+marital);
	}
public static void main(String[] args) {
	Data a=new Data();
	a.display();
	
}
}
