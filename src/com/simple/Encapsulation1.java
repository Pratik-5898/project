package com.simple;


public class Encapsulation1 {
	private int score;
		public Encapsulation1(int score) {
		this.score = score;
	}
		public int getScore() {
			return score;
		}
		public String calculatGrade() {
			if(score >=90) {
				return "A";
			}
			if(score >=80) {
				return "B";
			}
			else {
				return "f";
			}
			
		}
		public static void main(String[] args) {
			Encapsulation1 e=new Encapsulation1(67);
			String grade=e.calculatGrade();
			
			System.out.println("exam score"+e.getScore());
			System.out.println("the grade is "+grade);
			
		}


}
