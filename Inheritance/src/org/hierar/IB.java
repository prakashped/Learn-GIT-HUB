package org.hierar;
//child class
public class IB extends RBI{
private void amtInIB() {
	System.out.println("amt in IB is 50cr");
}
public static void main(String[] args) {
	IB b=new IB();
	b.amtInIB();
	b.amtToIB();
}
}
