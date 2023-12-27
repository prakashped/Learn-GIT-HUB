package org.login;

public class Company {
	private void gymEligibility(int age,int weight) {
	if(age>=18||weight>=50) {
		System.out.println("ok");
	}
	else {
		System.out.println("not ok");
	}
	}
public static void main(String[] args) {
	Company a=new Company();
	a.gymEligibility(16, 55);
}
}
