package com.simple;

public class PrimeCheck {
	public static void main(String[] args) {
		int num=2;
		boolean IsPrime=true;
		
		if (num<=1) {
			IsPrime=false;
		}else {
			for(int i =2;i<num;i++){
				if(num%2==0) {
					IsPrime=false;
					break;
				}
			}
			if(IsPrime) {
				System.out.println(num+" is a prime number");
			}else {
				System.out.println(num+" is a not prime number");
			}
		}
		
	}

}
