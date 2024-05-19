package com.java.repractice;

public class Student {

	int total;
	private void marks(int maths, int sci,int hindi) {
		// TODO Auto-generated method stub
		
		total=maths+sci+hindi;
		
		System.out.println("total of three subjects" +total);

	}
	
	private void add() {
	
		System.out.println("total of three subjects" +total);

	}
	
	private void percent() {
		double percentage=total/3;
		System.out.println("percentage of three subjects " +percentage);

	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.marks(50,30,40);
		s1.add();
		s1.percent();
	}
}
