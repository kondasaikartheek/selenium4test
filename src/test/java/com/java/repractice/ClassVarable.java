package com.java.repractice;

public class ClassVarable {
	int a;
	//System.out.println(a);
	private void mathodTwo() {
	System.out.println(a);

	}
	
	public ClassVarable() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		ClassVarable s1=new ClassVarable();
		s1.mathodTwo();
		
	}

}
