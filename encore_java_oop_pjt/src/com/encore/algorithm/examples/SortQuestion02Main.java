package com.encore.algorithm.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//encore_algorithm p.20
public class SortQuestion02Main implements Comparable<SortQuestion02Main>{
	
	private String name;
	private int score;
	
	public SortQuestion02Main(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public int compareTo(SortQuestion02Main o) {
		return this.score - o.getScore();
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		List<SortQuestion02Main> ary = new ArrayList<SortQuestion02Main>();
		int score = 0;
		String name = "";
		
		for (int i = 0; i < size; i++) {
			name = scan.next();
			score = scan.nextInt();
			ary.add(new SortQuestion02Main(name, score));
		}
		
		Collections.sort(ary);
		
		for (SortQuestion02Main t : ary) {
			System.out.println(t.getName());
		}
	}
}
