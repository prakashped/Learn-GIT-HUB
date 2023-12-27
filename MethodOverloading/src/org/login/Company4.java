package org.login;

public class Company4 extends Employee {
	private void empData(String name) {
		System.out.println("emp name is "+name);
		this.empData(23);
		this.empData('M');
		super.empID(123);
	}
private void empData(int age) {
System.out.println("emp age is "+age);
}
private void empData(char gen) {
	System.out.println("emp gen is "+gen);
}
public static void main(String[] args) {
	Company4 a=new Company4();
	a.empData("Arun");
	
}
}
