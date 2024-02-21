package com.encore.algorithm.examples;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 1. scanner 이용해서 데이터 입력
 * 2. 반복 구문 이용해서 데이터 입력
 */

// 내림차순 정렬 (encore_algorithm p.19)
public class SortQuestion01Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		int [] ary = new int[size];

		for (int i = 0; i < size; i++)
			ary[i] = scan.nextInt();
		
		Arrays.sort(ary);
		for (int i = 0; i < size; i++)
			System.out.print(ary[size - 1 - i] + " ");
	}

}
