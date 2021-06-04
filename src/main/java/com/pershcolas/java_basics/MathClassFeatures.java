package com.pershcolas.java_basics;

import java.util.Scanner;

public class MathClassFeatures {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an x value for point 1: ");
		int x1 = Integer.parseInt(sc.nextLine());
		System.out.println("Enter a y value for point 1: ");
		int y1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter an x value for point 2: ");
		int x2 = Integer.parseInt(sc.nextLine());
		System.out.println("Enter a y value for point 2: ");
		int y2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter an x value for point 3: ");
		int x3 = Integer.parseInt(sc.nextLine());
		System.out.println("Enter a y value for point 3: ");
		int y3 = Integer.parseInt(sc.nextLine());
		
		double a = Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2),2));
		double b = Math.sqrt(Math.pow((x1-x3),2)+Math.pow((y1-y3),2));
		double c = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
		
		double angleA = Math.toDegrees(Math.acos((a*a-b*b-c*c)/(-2*b*c)));
		double angleB = Math.toDegrees(Math.acos((b*b-a*a-c*c)/(-2*a*c)));
		double angleC = Math.toDegrees(Math.acos((c*c-b*b-a*a)/(-2*a*b)));
		
		System.out.println("The angle across from side A is: " + angleA);
		System.out.println("The angle across from side B is: " + angleB);
		System.out.println("The angle across from side C is: " + angleC);
	}

}
