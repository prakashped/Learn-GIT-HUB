package org.login;

public class Company3 {
private void empData(String name) {
System.out.println("emp  name is "+name);
this.empData(23);
this.empData('M');
}
private void empData(int age) {
System.out.println("emp age is 23");
}
private void empData(char gen) {
System.out.println("emp gen is "+gen);
}
public static void main(String[] args) {
	Company3 a =new Company3();
	a.empData("Arun");
}
}
