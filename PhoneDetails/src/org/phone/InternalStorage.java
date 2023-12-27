package org.phone;
//child class
public class InternalStorage {
private void processorName() {
	System.out.println("Processor name is Octa");
}
private void ramSize() {
	System.out.println("ramsize is 20kb");
}
public static void main(String[] args) {
	InternalStorage a=new InternalStorage();
	a.processorName();
	a.ramSize();
	ExternalStorage b=new ExternalStorage();
	b.size();
}
}
