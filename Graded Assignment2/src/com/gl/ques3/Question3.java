package com.gl.ques3;

import java.util.Arrays;
import java.util.Scanner;

public class Question3 {

	public void findSum() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = i + 1;
		int total = Arrays.stream(a).filter(x -> x % 2 != 0).map(x -> x * x).sum();
		System.out.println(total);

	}

}
