package com.encore.algorithm.examples;

import java.util.Scanner;

// encore_algorithm p.23
public class GreedyQuestion01Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		int cnt = 0;
		
		cnt = input / 500;
		input = input % 500;
		cnt += input / 100;
		input = input % 100;
		cnt += input / 50;
		input = input % 50;
		cnt += input / 10;
		
		System.out.println(cnt);
	}

}
