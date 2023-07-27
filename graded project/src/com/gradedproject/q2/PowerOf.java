package com.gradedproject.q2;

import java.util.Scanner;

public class PowerOf {

	static int prod = 1;//declaring prod outside function to avoid updation of the prod due to recusive function calling

	static int pow(int x, int n) {

		if (n == 0)//base condition
			return prod;
		else {
			prod = prod * x;//calculating and storing in a variable
			return pow(x, n - 1);//recursive function call
		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the base number of X");
		int x = s.nextInt();
		System.out.println("enter the power N");
		int n = s.nextInt();
		if (n < 0)//if N is less than 0 or negative number
			System.out.println("n is negative");
		else {
			int res = pow(x, n);
			System.out.println(x + " power " + n + " is: " + res);
		}
	}

}
