package com.pershcolas.java_basics;

public class PrintFormat {

	public static void main(String[] args) {
		int i = 1024;
		byte b = 127;
		double d = 1.232, tiny = d/100000000.0;
		boolean bool = true;
		
		System.out.printf("This is an integer: %d and this is a byte: %d.%n", i, b);
		System.out.printf("This is a double: %.4f and this is a tiny: %.4e%n", d, tiny);
		System.out.printf("And this is a String: %b", bool); 
	}

}
