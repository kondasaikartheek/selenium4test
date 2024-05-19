package com.java.repractice;

public class InstanceEx {
	
	int a=10;

	public void methodOne() {
		a=a-5;
		System.out.println(a);

	}
	
	public static void main(String[] args) {
		InstanceEx s1=new InstanceEx();// obj 1
		s1.methodOne();
		
		InstanceEx s2=new InstanceEx();// obj 2
		s2.methodOne();
	}
	
	
}
