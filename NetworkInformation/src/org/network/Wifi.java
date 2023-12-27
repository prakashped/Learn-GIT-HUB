package org.network;
//child class
public class Wifi {
private void wifiName() {
	System.out.println("Wifi name is Airtel");
}
public static void main(String[] args) {
	Wifi a=new Wifi();
	a.wifiName();
	MobileData b=new MobileData();
	b.dataName();
	Lan c=new Lan();
	c.lanName();
	Wireless d=new Wireless();
	d.modamName();
}
}
