package com.java.repractice;

public class ConstructorEx {
	
	public ConstructorEx() { 
		int a =10;
		
	System.out.println("student one " +a);
	
	}
	
	public void teacher() {
		int a =10;
		
		System.out.println("student one " +a);
	}
	
	
	public static void main(String[] args) {
		
		ConstructorEx s2 =new ConstructorEx();
		s2.teacher();	
		
	}

	
	
}
