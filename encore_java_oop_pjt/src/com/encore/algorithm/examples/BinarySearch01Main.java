package com.encore.algorithm.examples;

import java.util.Arrays;
import java.util.Scanner;

//encore_algorithm p.36
public class BinarySearch01Main {

	public static int search(int [] ary, int target) {
		int low = 0;
		int high = ary.length - 1;
		int mid = low + (low + high) / 2;
		
		while (high >= low) {
			if (ary[mid] == target)
				return mid;
			else if (ary[mid] < target)
				low = mid + 1;
			else 
				high = mid - 1;
			mid = (high + low) / 2;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		int [] ary = new int[size];
		for (int i = 0; i < size; i++) {
			ary[i] = scan.nextInt();
		}
		
		int findNum = scan.nextInt();
		int [] find = new int[size];
		for (int i = 0; i < findNum; i++) {
			find[i] = scan.nextInt();
		}
		
		Arrays.sort(ary);

		String res = "";
		for (int i = 0; i < findNum ; i++) {
			res = search(ary, find[i]) > -1 ? "yes " : "no ";
			System.out.print(res);
		}
	}

}
