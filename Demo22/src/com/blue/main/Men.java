package com.blue.main;

public class Men extends Person {
	int age = 8;
	
	public void test() {
		System.out.println("person age: "+ super.age);
		super.speak();
	}
	
	@Override
	public void speak(){
		System.out.println("hello men");
	}
}
