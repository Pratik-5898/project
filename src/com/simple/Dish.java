package com.simple;

public class Dish {
	public static void main(String[] args) {
		
		//count and digit 
		int x=538556;
		int count=0;
		int sum=0;
		while(x!=0) {
		int y=x%10;
		sum=sum+y;
			x=x/10;
			count++;
	

		}
	     System.out.println(sum);
	}

}
