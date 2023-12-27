package SeleniumJava.SeleniumJava;

public class ArrayOfObjects {
	int rollno;
	String name;
	ArrayOfObjects(int rollno,String name){
		rollno=this.rollno;
		name=this.name;
	}

	public static void main(String[] args) {
		ArrayOfObjects[]arr=new ArrayOfObjects[3];
		arr[0]= new ArrayOfObjects(0,"Prakash");
		arr[1]=new ArrayOfObjects(1,"Shaswina");
		arr[2]=new ArrayOfObjects(2,"Laksh");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].rollno+arr[i].name);
		}
		

	}

}
