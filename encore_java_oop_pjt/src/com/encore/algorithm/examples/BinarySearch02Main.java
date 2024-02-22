package com.encore.algorithm.examples;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch02Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		int [] ary = new int[size];
		int len = scan.nextInt(); // 가져갈 길이
		int sum = 0;
		int stand = 0;
		
		for (int i = 0; i < size; i++)
			ary[i] = scan.nextInt();
		
		Arrays.sort(ary);
		stand = ary[ary.length - 1];
		while (true) {
			for(int j = 0 ; j < ary.length; j++) 
				sum = sum + ((ary[j] - stand) < 0 ? 0 : (ary[j] - stand));
			if (sum == len) {
				System.out.println(stand);
				return;
			}
			else if (sum > len) {
				stand++;
				sum = 0;
			}
			else  {
				stand--;
				sum = 0;
			}
		}
	}

}
