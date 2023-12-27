package org.company;

public class CompanyInfo {
private void companyName() {
	System.out.println("The company name is TCS");
}
private void companyId() {
	System.out.println("The company id is 12345");
}
private void companyAddress() {
	System.out.println("The company Address is TidelPark");
}
public static void main(String[] args) {
	CompanyInfo a=new CompanyInfo();
	a.companyName();
	a.companyId();
	a.companyAddress();
}
}
