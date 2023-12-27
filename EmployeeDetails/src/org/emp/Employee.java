package org.emp;

public class Employee {
	private void empId() {
	System.out.println("The empId is 123");	
	}
private void empName() {
	System.out.println("The empName is Prakash");
}
private void empDob() {
	System.out.println("The empDob is 19/05/1986");
}
private void empPhone() {
	System.out.println("The empPhone is 7402054962");
}
private void empEmail() {
	System.out.println("The empEmail is prakashped@gmail.com");
}
private void empAddress() {
	System.out.println("the empAddress is Chennai");
}
public static void main(String[] args) {
	Employee a=new Employee();
	a.empId();
	a.empName();
	a.empDob();
	a.empPhone();
	a.empEmail();
	a.empAddress();
}
}
