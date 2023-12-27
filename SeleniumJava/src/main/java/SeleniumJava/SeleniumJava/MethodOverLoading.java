package SeleniumJava.SeleniumJava;

import java.security.AlgorithmConstraints;

public class MethodOverLoading {
	void display() {
		int a=2;
		int b=2;
		int c=a*b;
		System.out.println(c);
	}
	void display(int a,int b,int c) {
		int d=a*b*c;
		System.out.println(d);
	}
	public static void main(String[] args) {
		
		MethodOverLoading a1=new MethodOverLoading();
		a1.display();
		a1.display(2, 2, 3);
		

	}

}
