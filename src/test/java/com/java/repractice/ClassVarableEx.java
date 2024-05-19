package com.java.repractice;

public class ClassVarableEx {
	int i;
	int x=20;
	
	private void methodOne() {
		
		System.out.println(x);
		System.out.println(i);
	}

	public static void main(String[] args) {
		ClassVarableEx b1= new ClassVarableEx();
		b1.methodOne();
		
		
	}
}
