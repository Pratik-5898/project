package com.simple;

public class Num3 {
	int number;
	int number1;
	static void smallestno(int a,int b) {
		if (a>b) {
			System.out.println("the largest no is "+a);
		}else if(b>a) {
			System.out.println("the largest no is "+b);
			
		} else if(a==b){
			System.out.println("the number is equal");
			
		}
		
	}
	public static void main(String[] args) {
		Num3.smallestno(300 , 440);
	}
	

}
