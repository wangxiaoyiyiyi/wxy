package Cattle;

import java.util.HashMap;

public class Cattle {

	public static void main(String[] args) {
		
		String s = "fmn";
		s.toUpperCase();
		String y = s.replace("f", "F");
		y = y + "wxy";
		System.out.println(y);
		
		String t = "wangyi";
		System.out.println(t.substring(0,6));
		
		String split = "|wy|wy|wy";
		System.out.println(split.split("|").length);
		System.out.println(split.split("|").toString());
		
		System.out.println(Math.floor(7.8));
		System.out.println(Math.floor(-7.8));
		
		String str = "";
		System.out.print(str.split(",").length);
		
		Cattle cattle = new Cattle();
		cattle.say();
		
		HashMap<String, String> hashmap = new HashMap<>(13);
	}
	
	public void say() {
		System.out.println("say");
	}
}
