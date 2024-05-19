package com.java.repractice;

public class ExMetodEx {

	
	public void student(int a, int b) {// syntax for object method parameter
	
		System.out.println("student marks " +a );
		System.out.println("student marks " +b );

	}
	public ExMetodEx(int a,int b) {// syntax for object constacter parameters

		System.out.println("student marks " +a);
		System.out.println("student marks " +b);
	}
	
	
	public static void main(String[] args) {// syntax for main method
		ExMetodEx s1=new ExMetodEx(10,20);// syntax for object creation
		s1.student(10,20);
		
		
	}
	
	
}
