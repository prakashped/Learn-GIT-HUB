package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

//child class
public class Vehicle {
private void vehicleNecessary() {
	System.out.println("Vehicle is mandatory to our daily life");
}
public static void main(String[] args) {
	Vehicle a=new Vehicle();
	a.vehicleNecessary();
	TwoWheeler b=new TwoWheeler();
	b.bike();
	b.cycle();
	ThreeWheeler c=new ThreeWheeler();
	c.auto();
	FourWheeler d=new FourWheeler();
	d.bus();
	d.car();
	d.lorry();
}
}



