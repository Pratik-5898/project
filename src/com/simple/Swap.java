package com.simple;

public class Swap {
	public static void main(String[] args) {
		int a=5,b=10;
		
		System.out.println("Before swapping the value= "+a);
		System.out.println("Before swapping the value= "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping the value= "+a);
		System.out.println("After swapping the value= "+b);	
	}

}
