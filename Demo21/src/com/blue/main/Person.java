package com.blue.main;

import com.blue.test.Tom;

public class Person {
	public void speak() {
		Tom tom = new Tom();
		if(tom instanceof Tom) {
			System.out.println("yes");
		}
		if(tom instanceof Person) {
			System.out.println("yes");
		}
	}
}
