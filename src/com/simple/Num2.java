package com.simple;

public class Num2 {
	int number;
	static void Num(int q){
		if(q==0) {
			System.out.println("the number is zero");
		}else if(q>=0) {
			System.out.println("the number id positive");	
		}else if(q<=0){
			System.out.println("the number is negative");
		}else {
			System.out.println("the number is not entered");
		}
	}
	public static void main(String[] args) {
		Num2.Num(92);
	}

}
