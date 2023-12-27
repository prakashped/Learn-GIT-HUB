package org.login;

public class Employee extends Company{
private void empID() {
	System.out.println("empid is 09876");

}
private void empName() {
	System.out.println("emp name is Alpha");

}
public static void main(String[] args) {
	Employee a=new Employee();
	a.empID();
	a.empName();
	a.compId();
	a.compName();
}
}
