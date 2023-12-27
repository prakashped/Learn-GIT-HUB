package org.sample;

public class Employee extends Client {
	private void empId() {
		System.out.println("emp id is 098765");
	}
	private void empName() {
    System.out.println("emp name is Prakash");

	}
public static void main(String[] args) {
	Employee a=new Employee();
	a.empId();
	a.empName();
	a.compName();
	a.compId();
	a.clientId();
}
}
