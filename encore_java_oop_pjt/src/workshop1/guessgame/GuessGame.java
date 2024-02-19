package workshop1.guessgame;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		int cnt = 0;
		int input = 0;
		
		Random rand = new Random();
		int hiddenNumber = rand.nextInt(100) + 1;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println(" ***********************************\r\n"
				+ " 1에서100사이의숫자를맞춰보세요.\r\n"
				+ " 10번의기회가있습니다.\r\n"
				+ " ***********************************");
		
		for (int i = 1; i < 11; i++) {
			System.out.print(i+"번째기회입니다. 숫자를입력하세요: ");
			input = scan.nextInt();
			if (input == hiddenNumber) {
				System.out.print("축하합니다.");
				System.out.println(cnt+"번 만에 맞추셨네요.");
				break ;
			}
			else if (input < hiddenNumber) {
				System.out.println(input+"보다 큽니다.");
				cnt ++;
			}
			else {
				System.out.println(input+"보다 작습니다.");
				cnt ++;
			}
		}

		if (cnt == 10)
			System.out.println("10번의기회가끝났습니다. 다시 한 번시도해보세요.");
	}

}
