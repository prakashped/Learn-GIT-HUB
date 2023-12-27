package org.login;

public class Student {
private void tallestInClass(int a,int b,int c) {
	if(a>b&&a>c) {
		System.out.println("a is tallest");
	}
	else if(b>c && b>a) {
		System.out.println("b is tallest");
	}
	else {System.out.println("c is tallest");
}
}
public static void main(String[] args) {
	Student a=new Student();
	a.tallestInClass(150, 160,180);
}
}