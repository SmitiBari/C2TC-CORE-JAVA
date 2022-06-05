package com.tns.corejava;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter any number=");
		
		Scanner s=new Scanner(System.in);
		num= s.nextInt();
		
		
		if(num%2==0)
		{
			System.out.println("Number is even");
		}
		
		else
		{
			System.out.println("Number is odd");
		}

	}

}
