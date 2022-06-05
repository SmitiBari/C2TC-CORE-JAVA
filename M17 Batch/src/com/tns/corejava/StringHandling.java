package com.tns.corejava;

public class StringHandling {

	public static void main(String[] args) {
		
		String s=new String("Avantika");   //create string object
//		s.concat("Tiwari");
//		System.out.println(s);
//		
//		StringBuffer s1=new StringBuffer("Avantika");  //mutable
//		s1.append(" Bisht");
//		System.out.println(s1);
		
		
		System.out.println(s.length());
		
		String lower=s.toLowerCase();
		System.out.println(lower);
		
		String upper=s.toUpperCase();
		System.out.println(upper);
		
		System.out.println(s.trim());
		System.out.println(s.substring(2,6));
		System.out.println(s.substring(2));
		
		
		String s1=new String("AVANTIKA"); 
		System.out.println(s1.equals("avantika"));
		System.out.println(s1.equalsIgnoreCase("avantika"));
		System.out.println(s1.replace('A','K'));

	}

}
