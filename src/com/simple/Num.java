package com.simple;

public class Num {
	 int number;
	  void  printno(int p) {
		if(p%2 ==0) {
			System.out.println("The number is even ");
		}else {
			System.out.println("incorrect number");
		}
	}
	 public static void main(String[] args) {
		 Num n1=new Num();
		 n1.printno(2);
		
	}
	
	

}
