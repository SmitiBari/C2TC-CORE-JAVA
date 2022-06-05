package com.tns.corejava;

public class Demo {

	public static void main(String[] args) {
         
		A obj=new A();
		System.out.println(obj.i);
		System.out.println(obj.c);
	}

}

class A
{
	int i;
	char c='b';
}