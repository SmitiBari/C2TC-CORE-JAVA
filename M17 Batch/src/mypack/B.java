package mypack;

// Using packagename.* //
//import pack.*;
//public class B {
//
//	public static void main(String[] args) {
//		A obj=new A();
//		obj.msg();
//
//	}
//
//}


// Using packagename.classname //
//import pack.A;
//class B {
//
//	public static void main(String[] args) {
//		A obj=new A();           //
//		obj.msg();
//
//	}
//
//}


// fully qualified //
class B {

	public static void main(String[] args) {
		pack.A obj=new pack.A();         
		obj.msg();

	}

}