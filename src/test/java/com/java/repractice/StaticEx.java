package com.java.repractice;

public class StaticEx {
	
	static int a=20;// static
	
	int b=20;// non stiatic

	public static void  methodOne() {   // static method
		a=a-5;
		//b=b-5;  non static varable it will show error
		System.out.println(a);
		//System.out.println(b);  non static varable it will show error

	}
	
	public void methodTwo() { // non static method
		a=a-5;
		b=b-5;  //non static varable it will show error
		System.out.println(a);
		System.out.println(b);  //non static varable it will show error
		
	}
	
	public static void main(String[] args) {
		StaticEx s1=new StaticEx();// obj 1
		s1.methodOne();
		s1.methodTwo();
		
		StaticEx s2=new StaticEx();// obj 2
		s2.methodOne();
		s2.methodTwo();
	}

}
