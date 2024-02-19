package workshop1.primenumber;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int num = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		num = scan.nextInt();
		
		int cnt = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println(num + "는 소수가 아님");
				cnt++;
				break;
			}
			else
				continue;
		}
		if (num == 1 || cnt == 0)
			System.out.println(num + "는 소수임");
	}
}
