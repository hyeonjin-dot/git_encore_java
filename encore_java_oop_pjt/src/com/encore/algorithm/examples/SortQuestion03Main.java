package com.encore.algorithm.examples;

import java.util.Arrays;
import java.util.Scanner;

//encore_algorithm p.21
public class SortQuestion03Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int [] aryA = new int [n];
		int [] aryB = new int [n];
		int sum = 0;
		
		for (int i = 0; i < n; i++) 
			aryA[i] = scan.nextInt();
		
		for (int i = 0; i < n; i++)
			aryB[i] = scan.nextInt();
		
		Arrays.sort(aryA);
		Arrays.sort(aryB);
		
		for (int i = 0; i < k; i++) {
			if (aryA[i] < aryB[n - 1 - i])
				aryA[i] = aryB[n - 1 - i];
		}
		
		for (int i = 0; i < n; i++)
			sum += aryA[i];
		
		System.out.println(sum);
	}

}
