package org.login;

public class Company {
private void empData(String name) {
System.out.println("emp name is "+name);
}
private void empData(int age) {
	System.out.println("emp age is "+age);
	}
private void empData(char gen) {
System.out.println("emp gen is "+gen);
}
public static void main(String[] args) {
	Company a =new Company();
	a.empData("Arun");
	a.empData(23);
	a.empData('M');
	a.empData('F');
	a.empData(3);
	a.empData("Shaswina");
}
}
