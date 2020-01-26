package com.demo;

public class MainClass {

	public static void main(String arg[])
	{
		DemoInterface d1 = new MyFirstDemoClass();
		DemoInterface d2 = new DemoClass2();
		
		System.out.println(d1.addTwoDigit(10,12));
		System.out.println(d2.addTwoDigit(5,5));
		
	}
	
}
