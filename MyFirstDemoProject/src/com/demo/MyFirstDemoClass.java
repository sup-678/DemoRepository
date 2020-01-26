package com.demo;

public class MyFirstDemoClass implements DemoInterface {

	@Override
	public Integer addTwoDigit(int num1, int num2) {
		return num1+num2;
	}
	
	public Integer substract(int num1,int num2)
	{
		return num1-num2;
	}
}
