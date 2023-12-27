package org.phone;

public class PhoneInfo {
private void phoneName() {
	System.out.println("The Phone name is Apple");
}
private void phoneMieiNum() {
	System.out.println("The Phone MieiNum is 12345");
}
private void camera() {
	System.out.println("Camera Resolutions is Good");
}
private void storage() {
	System.out.println("The storage is more");
}
private void osName() {
	System.out.println("The OSName is Android");
}
public static void main(String[] args) {
	PhoneInfo a=new PhoneInfo();
	a.phoneName();
	a.phoneMieiNum();
	a.camera();
	a.storage();
	a.osName();
}
}
