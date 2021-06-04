package com.pershcolas.java_basics;

import java.util.Scanner;

public class numCheck {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int constraint1 = 2;
		int constraint2 = 3;
		
		System.out.println("Enter a number to check if it's divisible by 2 or 3: ");
		
		int myNumber = Integer.parseInt(s.next());
		
		boolean firstConditional = myNumber%2<=0 && myNumber%3<=0;
		boolean secondConditional = myNumber%2<=0 || myNumber%3<=0;
		boolean thirdConditional = 	myNumber%2<=0 ^ myNumber%3<=0;
		
		System.out.println(myNumber + " is divisible by 2 and 3 is " + firstConditional);
		System.out.println(myNumber + " is divisible by 2 or 3 is " + secondConditional);
		System.out.println(myNumber + " is divisible by 2 or 3 but not both is " + thirdConditional);
	}

}
