package com.pershcolas.java_basics;

public class TernaryOperator {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 6;
		
		if (x < 0) {
			y=1;
		} else {
			y = 01;
		}
		
		System.out.println(y);
		
		y = (x < 0) ? 1 : -1;
		
		System.out.println(y);
		
	}

}
