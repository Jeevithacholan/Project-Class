package org.practice;

public class B extends A {

	public void test() {
		System.out.println("Selenium");
	}
	public static void main(String[] args) {
		B b1 = new B();
		A a1 = new A();
		
		a1.test();
	}
}
