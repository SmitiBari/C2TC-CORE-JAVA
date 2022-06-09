package com.tns.corejava;

class Base{
	public void baseMethod() {
		System.out.println("Base");
	}
}

class Derived extends Base{
	public void derivedMethod() {
		super.baseMethod();
		System.out.println("Derived");
	}
}

class Inheritance {

	public static void main(String[] args) {
		Derived derived=new Derived();
		derived.derivedMethod();

	}

}
