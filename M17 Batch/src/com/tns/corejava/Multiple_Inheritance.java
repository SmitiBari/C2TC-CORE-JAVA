package com.tns.corejava;

interface A1
{
	void Adisplay();
}

interface B
{
	void Bdisplay();
}

class MIE implements A1,B
{
	public void Bdisplay() {
		System.out.println("I am B interface");
	}
	
	public void Adisplay() {
		System.out.println("I am A interface");
	}
}


public class Multiple_Inheritance {

	public static void main(String[] args) {
		MIE m=new MIE();
		m.Adisplay();
		m.Bdisplay();

	}

}
