package SeleniumJava.SeleniumJava;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		//		String[]names= {"Prakash","Devi","Laksh","Shaswina"};
		//		for (int i=0;i<names.length;i++) {
		//		System.out.println(names[i]);	
		//		}
		//names[0]=names[0] +" Raja";
		//System.out.println("After rearrange");
		//for (int i=0;i<names.length;i++) {
		//	System.out.println(names[i]);	
		//	}
		//	}
		//
		//}

		String str="India is my country";
		String[]names=str.split(" ");

		for (int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println(names[0]);
		System.out.println(names[0]+"Love");
		System.out.println(names[0]="I");
		
		deletion();
	}


	public static void deletion() {
		int[] arr = new int[]{1,2,3,4,5};
		int[] arr_new = new int[arr.length-1];
		int j=3;
		int k=0;
		for(int i=0;i<arr.length;i++){
			if(i!=j){
				arr_new[k]=arr[i];
				System.out.println(arr_new[k]);
				k++;
				
			}
			
		}
		System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(arr_new));


	}

}
