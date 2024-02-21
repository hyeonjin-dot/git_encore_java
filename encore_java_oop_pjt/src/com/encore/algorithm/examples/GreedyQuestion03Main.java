package com.encore.algorithm.examples;

import java.util.Arrays;
import java.util.Scanner;

//encore_algorithm p.25
public class GreedyQuestion03Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt(); // 가로
		int n = scan.nextInt(); // 세로
		int [][] ary = new int[m][n];
		int [] res = new int [m];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				ary[i][j] = scan.nextInt();
		}
		
		for (int i = 0; i < m; i++) {
			Arrays.sort(ary[i]);
			res[i] = ary[i][0];
		}
		Arrays.sort(res);
		System.out.println(res[m - 1]);
	}

}
