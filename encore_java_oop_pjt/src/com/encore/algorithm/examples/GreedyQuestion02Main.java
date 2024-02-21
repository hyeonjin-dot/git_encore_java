package com.encore.algorithm.examples;

import java.util.Arrays;
import java.util.Scanner;

//encore_algorithm p.24
public class GreedyQuestion02Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		int [] ary = new int[size];
		int m = scan.nextInt(); // 총 더할 횟수
		int k = scan.nextInt(); // 1개의 수가 최대 더해질 횟수
		int res = 0;
		int cnt = 0;
		int idx = 0;

		for (int i = 0; i < size; i++)
			ary[i] = scan.nextInt();
		
		Arrays.sort(ary);
		
		while (cnt < m){
			for (int j = 0; j < k; j++) {
				cnt++;
				if (cnt > m)
					break;
				res += ary[size - 1 - idx];
			}
			idx++;
		}
		
		System.out.println(res);
	}

}
