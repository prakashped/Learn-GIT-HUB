package SeleniumJava.SeleniumJava;

import java.util.Iterator;

public class Loop {

	public static void main(String[] args) {
		for (int row=1;row<=3;row++) {
			for (int col=1;col<=row;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
		
		}
}


//output1(system.out.print-row):
//	1
//	22
//	333
////output1(system.out.print-column):
//1
//12
//123
