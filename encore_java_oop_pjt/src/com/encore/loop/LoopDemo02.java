package com.encore.loop;

import java.util.Scanner;

public class LoopDemo02 {
	
	public LoopDemo02() {}
	
	public void sumRandom() {
		int nan = (int)(Math.random() * 100) + 1;
		int sum = 0;
		
		for (int i = 1; i <= nan ; i++)
			sum += i;
		
		System.out.println("nan = " + nan + "\nsum = " + sum);
	}
	
	//난수 두 개를 구해서 작은것부터 큰 것 까지의 합
	public void sumRandomTow() {
		int nan1 = (int)(Math.random() * 100) + 1;
		int nan2 = (int)(Math.random() * 100) + 1;
		int sum = 0;
		
		for (int i = (nan1 < nan2 ? nan1 : nan2); i <= (nan1 > nan2 ? nan1 : nan2); i++)
			sum += i;
		
		System.out.println("nan1 = " + nan1 + "\nnan2 = " + nan2 + "\nsum = " + sum);
	}
	
	public void charPrint(char start, char end) {
		for (char idx = start; idx <= end; idx++) {
			System.out.printf("%c \t", idx);
		}
		System.out.println();
	}
	
	public void sumOdd() {
		int sum = 0;
		for (int i = 1; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println("sum : "+sum);
	}
	
	//1-(100) 사이의 난수를 발생시켜 짝수의 개수가 몇개인지 출력
	public void countEven() {
		int cnt = 0;
		int nan = (int)(Math.random() * 100) + 1;
		for (int i = 1; i <= nan; i++) {
			if (i % 2 == 0)
				cnt++;
		}
		System.out.println("nan = " + nan + "\n" + cnt + "개");
	}
	
	// 매개변수로 문자열을 입력받아서 문자 하나씩 추출하여 출력
	public void splitString(String str) {
		for (int i = 0; i < str.length(); i++)
			System.out.println(str.charAt(i));
	}
	
	//스캐너로 값을 입력받고 1부터  누적 합 구하다가 값 넘으면 끝 출력
	public void sumBreak() {
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 입력하세요. : ");
		int input = scan.nextInt();
		
		for (int i = 0; true ; i++) {
			sum += i;
			if (sum >= input)
				break;
		}
		
		System.out.printf("입력 값 : %d \n출력 값 : %d", input, sum);
		scan.close();
	}
	
	public void nestedFor() {
		for (int i = 1; i <= 10; i++) {
			System.out.print("*");
		}
	}
	
}
