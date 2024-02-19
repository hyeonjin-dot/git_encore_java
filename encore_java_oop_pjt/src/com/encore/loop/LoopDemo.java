package com.encore.loop;

public class LoopDemo {
	
	public LoopDemo() {}
	
	public void loopMethod01() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("idx value = " + i);
		}
	}
	
	public void sumOneToTen() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
	}
	
	public void sumStartToEnd(int s, int e) {
		int sum = 0;
		for (int i = s; i <= e; i++)
			sum += i;
		System.out.printf("%d부터 %d까지의 합 : %d", s, e, sum);
	}
	
	//윤년판단
	// 4의 배수이면서 100의 배수가 아니거나 400의 배수일때
	public String leapYear(int year) {
		String msg = null;
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 )
			msg = "윤년";
		else
			msg = "평년";
		
		return msg;
	}
	
	public void leapYearStartToEnd(int s, int e) {
		int cnt = 0;
		for (int i = s; i <= e; i++) {
			if (leapYear(i).equals("윤년")) {
				cnt++;
				System.out.print(i + " ");
				if (cnt == 5) {
					System.out.println();
					cnt = 0;
				}
			}
		}
	}
	
}