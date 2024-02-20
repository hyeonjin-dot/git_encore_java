/*
 * 정렬 : 모든 프로그램은 오름차순을 기본으로 정렬
 * JAVA 기준을 정렬하지 않으면 오름차순
 * 기본 타입과 배열이 기본 타입을 요소로 가지고 있다면 
 * Arrays.sort(), Collections.sort() 사용
 * [정렬의 일반화된 규칙]
 * - 비교 결과 리턴될 때
 * - 음수 : 두 원소의 위치를 교환하지 않음
 * - 양수 : 두 원소의 위치 교환
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import com.encore.compare.EncoreInteger;
import com.encore.compare.Teacher;

public class CompareSubMain {

	public static void main(String[] args) {
		EncoreInteger [] ary = new EncoreInteger [10];
		// 랜덤하게 배열을 초기화
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			ary[i] = new EncoreInteger(rand.nextInt(99) + 1); 
		}
		
		Comparator<EncoreInteger> comp = new Comparator<EncoreInteger>() {
			
			@Override
			public int compare(EncoreInteger o1, EncoreInteger o2) {
				if (o1.getData() > o2.getData())
					return 1;
				else if (o1.getData() == o2.getData())
					return 0;
				else
					return -1;
			}
		}; 
		
		
		System.out.print("정렬 전 >>> ");
		for (int i = 0; i < 10; i++) {
			System.out.print(ary[i].getData() + "\t");
		}
		
		// 정렬
		/*for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 9; i++) {
				if (comp.compare(ary[i], ary[i + 1]) == 1){
					EncoreInteger tmp = null;
					tmp = ary[i];
					ary[i] = ary[i + 1];
					ary[i + 1] = tmp;
				}
			}
		}*/
		
		//Arrays.sort(ary, Collections.reverseOrder()); // Collections.reverseOrder() -> 내림 차순
		Arrays.sort(ary);
		
		System.out.print("\n정렬 후 >>> ");
		for (int i = 0; i < 10; i++) {
			System.out.print(ary[i].getData() + "\t");
		}
	}
}
