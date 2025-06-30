package com.simple;

public class Num4 {
	int num;
	int num1;
	static void sum(int a, int b) {
		if((a+b)%2!=0) {
			System.out.println("sum of two number is odd");
			
		}
		else {
			System.out.println("the no is incorrect");
		}
		
	}
	public static void main(String[] args) {
		Num4.sum(5,3);
	}

}
