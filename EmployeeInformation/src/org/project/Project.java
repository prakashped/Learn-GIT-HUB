package org.project;

import org.client.Client;
import org.company.Company;
import org.emp.Employee;

//child class
public class Project {
private void projectName() {
	System.out.println("The project name is Insurance");

}
public static void main(String[] args) {
	Pr oject a=new Project();
	a.projectName();
	Client b=new Client();
	b.clientName();
	Company c=new Company();
	c.companyname();
	Employee d=new Employee();
	d.empName();
}
}
