package org.login;

public class Company2 {
private void empData(String name,String a) {
	System.out.println("emp name is "+name+"\n"+"emp a is "+a);
}
private void empData(String age,String b,int c) {
	System.out.println("emp age is "+age+"\n"+"emp b is "+b +"\n"+"emp c is "+c);
}
private void empData(char gen) {
	System.out.println("emp gen is "+gen);
}
public static void main(String[] args) {
	Company2 a=new Company2();
	a.empData("Arun","Arul");
	a.empData("Quer", "Querr", 23);
	a.empData('M');
}
}
