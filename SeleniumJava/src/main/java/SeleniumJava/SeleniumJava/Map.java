package SeleniumJava.SeleniumJava;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		HashMap mp=new HashMap();
		mp.put("Namakkal", "637212");
		mp.put("Salem","637213");
		mp.put("Rasipuram","637214");
		System.out.println(mp);
		System.out.println(mp.get("Salem"));
		
		HashMap mp1=new HashMap();
		mp1.putAll(mp);
		System.out.println("New line:" +mp1);

	}

}
