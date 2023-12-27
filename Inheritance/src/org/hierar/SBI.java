package org.hierar;
//child class
public class SBI extends RBI {
private void amtInSBI() {
	System.out.println("amt in SBI is 10cr");
}
public static void main(String[] args) {
	SBI a=new SBI();
	a.amtInSBI();
	a.amtToSBI();
}
}
