package com.encore.control;

import java.util.Scanner;
import lombok.NoArgsConstructor;

@NoArgsConstructor

public class ControlStatementDemo {

	// A 또는 Bㄹㅏ는 값을 기대할 수 있다.
	// 조건식의 값 : true -> if
	// false -> else
	
	// 메뉴구성 금/은/쇠
	// 조건 1,2,3만 들어와야함
	// 1 -> 거짓말을 하는구나. 아무 도끼도 줄 수 없다.
	// 2 -> 거짓말을 하는구나. 아무 도끼도 줄 수 없다.
	// 3 -> 정직하구나. 너에게 세개의 모든 도끼를 주마.
	// 조건 판단이 끝나면 산신령은 연못으로 사라짐.......
	public String woodMan() {
		
		String msg = null;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		
		if (num > 0 && num < 4) {
			if (num  == 1) {
				System.out.println("거짓말을 하는구나. 아무 도끼도 줄 수 없다.");
				msg = "맨손";
			}
			else if (num == 2) {
				System.out.println("거짓말을 하는구나. 아무 도끼도 줄 수 없다.");
				msg = "맨손";
			}
			else {
				System.out.println("정직하구나. 너에게 세개의 모든 도끼를 주마.");
				msg = "가득한 손";
			}
		}
		System.out.println("...연못 속으로.........................");
		
		scan.close();
		return msg;
	}
	
	public double calc(int num1, char c, int num2) {
		
		char t = (c == '+' ? '+': (c == '-') ? '-': ((c == '*') ? '*':'/'));
		System.out.println(t);
		
		switch(c) {
		case  '+':
			return (double)(num1+num2);
		case  '-':
			return (double)(num1-num2);
		case  '*':
			return (double)(num1*num2);
		case  '/':
			return (num1/(double)num2);
		}

		return 0.0;
			
	}
}
