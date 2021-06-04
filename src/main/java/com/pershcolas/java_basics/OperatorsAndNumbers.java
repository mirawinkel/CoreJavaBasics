package com.pershcolas.java_basics;

public class OperatorsAndNumbers {
	/* Problem #1 write as binary
	1 = 1
	8 = 1000
	33 = 100001
	78 = 1001110
	787 = 1100010011
	33,987 = 1000010011000011
	*/
	
	/* Problem #2 convert binary
	0010 = 2
	1001 = 9
	0011 0100 = 52
	0111 0010 = 114
	0010 0001 1111 = 543
	0010 1100 0110 0111 = 8192+2048+1024+64+32+4+2+1 = 11367
	 */
	
	static void problemThree() {
		int x = 2;
		System.out.println(Integer.toBinaryString(x));
		x = x << 1;
		// predicted value 4
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		System.out.println();
		
		x = 9;
		System.out.println(Integer.toBinaryString(x));
		x = x << 1;
		// predicted value 18
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		System.out.println();
		
		x = 17;
		System.out.println(Integer.toBinaryString(x));
		x = x << 1;
		// predicted value 34
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		System.out.println();
		
		x = 88;
		System.out.println(Integer.toBinaryString(x));
		x = x << 1;
		// predicted value 176
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
	}
	
	static void problemFour() {
		
		int x = 150;
		System.out.println(Integer.toBinaryString(x));
		// predicted value 37 100101
		x = x >> 2;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		System.out.println();
		
		x = 225;
		System.out.println(Integer.toBinaryString(x));
		// predicted value 56 111000
		x = x >> 2;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		System.out.println();
		
		x = 1555;
		System.out.println(Integer.toBinaryString(x));
		// predicted value 388 110000100
		x = x >> 2;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		System.out.println();
		
		x = 32456;
		System.out.println(Integer.toBinaryString(x));
		// predicted value 8114 1111110110010
		x = x >> 2;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		System.out.println();
	}
	
	static void problemFive() {
		int x;
		int y;
		int z;
		
		x=7;
		y=17;
		// predicted value of x&y is 1 and 01
		z = x&y;
		System.out.println(z);
		System.out.println(Integer.toBinaryString(z));
		
		//predict x|y 23 and 10111
		z = x|y;
		System.out.println(z);
		System.out.println(Integer.toBinaryString(z));
	}
	
	static void problemSix() {
		int x = 7;
		System.out.println(x);
		x++;
		System.out.println(x);
	}
	
	static void problemSeven() {
		int x = 7;
		System.out.println(x);
		x++;
		System.out.println(x);
		x=x+1;
		System.out.println(x);
		++x;
		System.out.println(x);
	}
	
	static void problemEight() {
		int x;
		int y;
		x=5;
		y=8;
		
		int sum = x++ + y;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		problemThree();
		problemFour();
		problemFive();
		problemSix();
		problemSeven();
		problemEight();
	}

}
