package com.pershcolas.java_basics;

import java.util.Scanner;

public class LoopAssignment {
	
	public static void sentinelValue() {
		System.out.println("--Sentinel Value exercise--");
		Scanner s = new Scanner(System.in);
		String entry = "";
		int sum = 0;
		while(!entry.equals("0")) {
			System.out.println("The sum of the numbers entered so far is " + sum);
			System.out.println("Please enter a digit to add to the sum or 0 to quit.");
			entry = s.nextLine();
			sum = sum + Integer.parseInt(entry);
		}
		s.close();
		System.out.println("--End of Sentinel Value--");
	}
	
	public static void additionExercise( ) {
		System.out.println("--Addition exercise--");
		int num1 = (int)(Math.random()*100 + 1);
		int num2 = (int)(Math.random()*100 + 1);
		String entry = " ";
		char checkChar;
		int check;
		int ans;
		Scanner s = new Scanner(System.in);
		while (entry.length() > 0) {
			System.out.println("What is " + num1 + " + " + num2 + " =");
			System.out.println("Enter your answer below or a non number answer to exit:");
			entry = s.nextLine();
			checkChar = entry.charAt(0);
			check = checkChar; 
			if (check < 48 || check > 57) {
				System.out.println("You have indicated you are done. Thank you for your input!");
				break;
			}
			ans = Integer.parseInt(entry);
			if (ans != num1 + num2) {
				System.out.println("sorry, your answer of " + ans + " is incorrect. Try again");
				continue;
			} else {
				System.out.println("You answered correctly! You must be a math genius!");
				System.out.println("Let's play again!");
			}
			num1 = (int)(Math.random()*100 + 1);
			num2 = (int)(Math.random()*100 + 1);
		}
		System.out.println("--This is the end of the Addition exercise--");
		s.close();
	}
	
	public static void guessNumber() {
		System.out.println("--Guess the number exercise--");
		System.out.println("Generating a random number...");
		Scanner s = new Scanner(System.in);
		int num = (int)(Math.random()*101);
		int ans = -1;
		while (ans != num) {
			System.out.println("Guess what the number is:");
			ans = s.nextInt();
			if (ans < num) {
				System.out.println("You guessed to low, try again");
			} else if (ans > num) {
				System.out.println("You guessed to high, try again");
			} else {
				System.out.println("You got it!");
			}
		}
		System.out.println("--End of Guess the number--");
	}
	
	public static void advancedMath() {
		System.out.println("--Advanced Math exercise--");
		int repeat = 0;
		Scanner s = new Scanner(System.in);
		while(repeat < 1) {
			//generating an array of numbers for the problem
			int[] nums = new int[10];
			for (int i=0; i<10; i=i+2 ) {
				for(int j=0; j<2; j++) {
					int temp = (int)(Math.random()*11);
					nums[i+j] = temp;
				}
			}
			//generating an answer array based on the array of numbers
			int[] ans = new int[5];
			for (int i=0; i<5; i++) {
				ans[i] = nums[i*2] - nums[i*2+1];
			}
			int[] guess = new int[5];
			int correct = 0;
			
			while (correct<5) {
				System.out.println("The problems are as follows:");
				for (int i=0; i<10; i=i+2) {
					System.out.println(i/2+1 + ": " + nums[i] + "-" + nums[i+1] + "=");
				}
				for (int i=0; i<5; i++) {
					System.out.println("What is the answer for " + (i+1) + " ?");
					guess[i]=s.nextInt();
				}
				System.out.println("Checking answers...");
				for (int i=0; i<5; i++) {
					if (guess[i] == ans[i]) {
						correct++;
					}
				}
				System.out.println("You got " + correct + " answers right");
				if (correct == 5) {
					System.out.println("Good Job!");
				} else {
					System.out.println("You need to try again. Sorry :(");
				}
				
			}
			System.out.println("Would you like to play again? (Y/N)");
			String again = s.next();
			if (again.equals("N") || again.equals("NO") || again.equals("n") || again.equals("no") ||again.equals("No")) {
				repeat++;
				System.out.println("You have indicated you are done");
			}
		}
		System.out.println("--This is the end of the Advanced Math--");
		s.close();
	}
	
	public static void multiplyTable() {
		System.out.println("--Multiplication Table--");
		System.out.println();
		System.out.print("_X____");
		for (int i=1; i<13; i++) {
			if(i<10) {
				System.out.print(i + "____");
			} else {
				System.out.print(i + "___");
			}
		}
		System.out.println();
		System.out.println();
		for (int i=1; i<13; i++) {
			if (i<10) {
				System.out.print(" " + i + " |  ");
			} else {
				System.out.print(" " + i + "|  ");
			}
			for(int j=1; j<13; j++) {
				int num=i*j;
				if(num<10) {
					System.out.print(num + "    ");
				} else if (num<100) {
					System.out.print(num + "   ");
				} else {
					System.out.print(num + "  ");
				}
			}
			System.out.println();
		}
	}
	
	static public void greatestCommonDivisor() {
		System.out.println("--Greatest Common Divisor--");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two number to find their greatest common divisor");
		System.out.println("What is your first number?");
		int num1 = s.nextInt();
		System.out.println("What is your second number?");
		int num2 = s.nextInt();
		int end;
		if (num1>num2) {
			end = num1/2;
		} else {
			end = num2/2;
		}
		int gcd=1;
		for (int i=1; i<=end; i++) {
			if (i%num1==0 && i%num2==0) {
				gcd = i;
			}
		}
		System.out.println("The greatest common divisor is " + gcd);
	}
	

	public static void main(String[] args) {
//		sentinelValue();
//		additionExercise();
//		guessNumber();
//		advancedMath();
//		multiplyTable();
		greatestCommonDivisor();

	}

}
