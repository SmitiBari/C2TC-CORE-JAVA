package com.tns.corejava;

// Using Extends

public class Multi_Thread {

	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
		for(int i=0; i<10; i++)
		{
			System.out.println("Main Thread.....");
		}

	}

}
class MyThread extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("child Thread.....");
		}
	}
}

// Using runnable interface

//public class Multi_Thread {
//
//	public static void main(String[] args) {
//		MyThread t=new MyThread();
//		Thread obj=new Thread(t);
//		obj.start();
//		for(int i=0; i<10; i++)
//		{
//			System.out.println("Main Thread.....");
//		}
//
//	}
//
//}
//class MyThread implements Runnable
//{
//	public void run()
//	{
//		for(int i=0; i<10; i++)
//		{
//			System.out.println("child Thread.....");
//		}
//	}
//}
