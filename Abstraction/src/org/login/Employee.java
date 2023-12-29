package org.login;

public class Employee implements Company,Master {
	@Override
	public void empAtmPin() {
		System.out.println("emp pin is 12345");
		
	}
@Override
public void empID() {
System.out.println("emp id is 1234");
	
}
@Override
public void empName() {
	System.out.println("emp name is Alpha");
	System.out.println("emp name is Prakash");
	
}
@Override
public void masterId() {
	System.out.println("master id is 0954");
	
}

@Override
public void masterName() {
	System.out.println("master name is beta");
	
}
public static void main(String[] args) {
	Employee a=new Employee();
	a.empAtmPin();
	a.empID();
	a.empName();
	a.masterName();
	a.masterId();
}
}