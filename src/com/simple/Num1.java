package com.simple;

public class Num1 {
	int number;
	static void odd(int a) {
		if(a %2!=0) {
			System.out.println("the number id odd");
		}else {
			System.out.println("incorrect number");
		}
		
	}
	public static void main(String[] args) {
		Num1.odd(89);
		
	}

}
