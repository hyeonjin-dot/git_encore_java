/*
 * 제어구문 (if, switch)
 * - 조건 판단
 */

import java.util.Scanner;

import com.encore.control.ControlStatementDemo;

public class ControlStatementMain {
	
	public static final String ANSI_BLUE = "\u001B[34m";

	public static void main(String[] args) {
		//evenCheck();
		
		ControlStatementDemo csm = new ControlStatementDemo();
//		System.out.println(csm.woodMan());
		
//		example01();
		
		// calc 메서드 호출시 사칙연산자 +,-,*,/ㅇ
		double value = csm.calc(100, '+', 100);
		System.out.println("Result >>>" + value);
		
	}
	
	public static void evenCheck() {
		// scanner로부터 숫자를 입력받아서 짝수인지 판단

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		
		if (num > 0){
			System.out.println("양수");
			if (num % 2 == 0) {
				System.out.println("짝수");
			}
			else {
				System.out.println("홀수");
			}
		}
		else {
			System.out.println("음수");
			System.out.println("프로그램 종료하겟삼");
			System.exit(0);
		}
	}
	
	public static void example01() {
		
//		메소드명 : public void example01(){}
//		구현 내용 :
//		            국어(정수), 영어(정수), 수학(정수), 총점(정수), 평균(실수) 변수 선언하고,
//		            각 점수를 키보드로 입력받고,
//		            합계(국어+영어+수학)와 평균(합계/3.0)을 계산하고,
//		            세 과목의 점수와 평균을 가지고 합격 여부 처리함
//		<합격의 조건 >
//		세 과목의 점수가 각각 40점이상이면서,
//		평균이 60점 이상이면 합격,
//		아니면 불합격 처리함
		
		int kor = 0;
		int eng = 0;
		int mat = 0;
		int sum = 0;
		double avg = 0.0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		kor = scan.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		eng = scan.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		mat = scan.nextInt();
		
		sum = kor + mat + eng;
		avg = sum / 3.0;
		
		if (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) {
			System.out.println( ANSI_BLUE + "합격");
		}
		else {
			System.err.println("불합격");
		}
		scan.close();
	}

	
}