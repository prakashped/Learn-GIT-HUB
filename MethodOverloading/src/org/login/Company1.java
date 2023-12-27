package org.login;

public class Company1 {
	private void empData(String name,int a) {
		System.out.println("emp name is "+name+ "\n"+"emp a is "+a);
	}
	private void empData(int age,char b) {
System.out.println("emp age is "+age +"\n"+"emp b is "+b);
	}
	private void empData(char gen) {
		System.out.println("emp gen is "+gen);
	}
public static void main(String[] args) {
	Company1 a =new Company1();
	a.empData("Arun", 23);
	a.empData(23, 'M');
	a.empData('M');
}
}
