package com.tns.corejava;

public class ExcHandling {

	public static void main(String[] args) {
		int [] arr=new int[4];
		try
		{
			System.out.println(arr[4]);
			System.out.println("Inside try Block");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Inside catch Block");
		}
		finally
		{
			System.out.println("Inside finally Block");
		}
		System.out.println("Outside try catch finally block...Rest of the code");

	}

}
