package org.college;
//child class
public class College {
private void collegeName() {
	System.out.println("The college name is Anna University");

}
private void collegeCode() {
	System.out.println("The college code is 2131");
}
private void colllegeRank() {
	System.out.println("The college rank is first");
}
public static void main(String[] args) {
	College a=new College();
	a.collegeName();
	a.collegeCode();
	a.colllegeRank();
	Dept b=new Dept();
	b.deptName();
	Hostel c=new Hostel();
	c.hostelName();
	Student d=new Student();
	d.studentName();
	d.studentDept();
	d.studentId();
	
}
}
