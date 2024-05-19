package com.java.repractice;
//data types
public class Datatypes {
		


	public static void main(String[] args) {
		//boolean	true or false	false	1 bit				true, false	,true, false
		byte b = 4;
		//byte 	twos-complement integer		0			8 bits	(none)		-128 to 127
		char a = 'G';
		//char 	Unicode character			\u0000			16 bits 			‘a’, ‘\u0041’, ‘\101’, ‘\\’, ‘\’, ‘\n’, ‘β’	characters representation of ASCII values0 to 255
		short s = 56;
		//short	twos-complement integer		0			16 bits	(none)		-32,768 to 32,767
		int i = 89;
		//int	twos-complement intger		0			32 bits				-2,-1,0,1,2	-2,147,483,648 to 2,147,483,647
		long l = 12121;
		//long	twos-complement integer		0			64 bits				-2L,-1L,0L,1L,2L	-9,223,372,036,854,775,808 to 223,372,036,854,775,807
		 float f = 4.7333434f;
		//float 	IEEE 754 floating point	0.0		32 bits			1.23e100f , -1.23e-100f , .3f ,3.14F	upto 7 decimal digits
	    double d = 4.355453532;
		//double	IEEE 754 floating point	0.0		64 bits			1.23456e300d , -123456e-300d , 1e1d	upto 16 decimal digits
	   String str="kartheek";
	    
	    
	    
	    System.out.println("char: " + a);
	    System.out.println("integer: " + i);
	    System.out.println("byte: " + b);
	    System.out.println("short: " + s);
	    System.out.println("float: " + f);
	    System.out.println("double: " + d);
	    System.out.println("long: " + l);
	    System.out.println("String: " + str);
	
	}
	
	
}
