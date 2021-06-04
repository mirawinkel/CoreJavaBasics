package com.pershcolas.java_basics;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class JavaBasicsClass {

	static void problemOne() {
		int numOne = 5;
		int numTwo = 2;
		int sum = numOne + numTwo;
		System.out.println(sum);
	}
	
	static void problemTwo() {
		double numOne = 3.33;
		double numTwo = 2.78;
		double sum = numOne + numTwo;
		System.out.println(sum);
	}
	
	static void problemThree() {
		int numOne = 4;
		double numTwo = 2.45;
		double sum = numOne + numTwo;
		System.out.println(sum);
		// Sum must be of type double
	}
	
	static void problemFour() {
		double numOne = 4.33;
		double numTwo = 2.75;
		double result = numOne / numTwo;
		System.out.println(result);
		System.out.println((int)result);
	}

	static void problemFive() {
		int x = 5;
		int y = 6;
		double q = y/x;
		System.out.println(q);
		q = (double)y/x;
		System.out.println(q);
	}
	
	static void problemSix() {
		final int NUMONE = 3;
		double numTwo = 2.45;
		double product = NUMONE * numTwo;
		System.out.println(product);
	}
	
	static void problemSeven() {
		//first product
		double coffee = 2.99;
		
		//second product
		double chai = 4.99;
		
		//third product
		double espresso = 3.50;
		
		double subtotal;
		double totalSale;
		
		subtotal = 3*coffee + 4*chai + 2*espresso;
		
		final double SALES_TAX = .065;
		totalSale = subtotal + subtotal*SALES_TAX;
		
		//convert totalSale to big decimal form for formatting
		BigDecimal bd=new BigDecimal(totalSale).setScale(2, RoundingMode.UP);
		
		System.out.println(bd.doubleValue());	
	}
	
	public static void main(String[] args) {
		problemOne();
		problemTwo();
		problemThree();
		problemFour();
		problemFive();
		problemSix();
		problemSeven();
	}

}
