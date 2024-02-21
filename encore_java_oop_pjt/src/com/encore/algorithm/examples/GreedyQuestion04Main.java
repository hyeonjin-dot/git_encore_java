package com.encore.algorithm.examples;

import java.util.Scanner;

//encore_algorithm p.26
public class GreedyQuestion04Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int cnt = 0;
		
		while (n != 1) {
			if (n % k == 0) 
				n = n / k;
			else
				n = n - 1;
			cnt++;
		}
		System.out.println(cnt);
	}

}
