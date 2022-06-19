package com.tns.corejava;

public class Static_Outer {
	int x=10;
	
	static class Inner
	{
		public void demo()
		{
			System.out.println("I am Inner class");
		}
	}

	public static void main(String[] args) {
		Static_Outer.Inner obj=new Static_Outer.Inner();
		obj.demo();
	}

}
