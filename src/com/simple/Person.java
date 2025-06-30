package com.simple;

public class Person {
	
	  String name;
	  int age;
	
	    public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	    public static void main(String[] args) {
		Person p1 =new Person("LUCKY",36);
		Person P2 = new Person("ROWDY",44);
		
		System.out.println("person 1 : name-"+ p1.name+" age-"+p1.age);
		System.out.println("person 2 : name-"+ P2.name+" age-"+P2.age);
		
	}
}
