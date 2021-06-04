package com.pershcolas.java_basics;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two words separated by spaces: ");
		
		String s1 = s.next();
		String s2 = s.nextLine();
		
		
		System.out.println("s1 is " + s1);
		System.out.println("s2 is " + s2);
		
		System.out.println(s1.startsWith("app"));
		s.close();
	}

}
