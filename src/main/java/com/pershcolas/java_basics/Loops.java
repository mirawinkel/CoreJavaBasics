package com.pershcolas.java_basics;

import java.util.Scanner;

public class Loops {
	
	public static void sentinelValue() {
		Scanner s = new Scanner(System.in);
		String entry = "";
		while(!entry.equals("0")) {
			System.out.println("Please enter a digit or 0 to quit.");
			entry = s.nextLine();
		}
		s.close();
	}
	
	public static void doWhile() {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i < 20);
	}

	public static void main(String[] args) {
//		int count = 0;
//		while (count < 100) {
//			System.out.println("Welcome! " + count );
//			count++;
//		}
//		sentinelValue();
		doWhile();
	}

}
