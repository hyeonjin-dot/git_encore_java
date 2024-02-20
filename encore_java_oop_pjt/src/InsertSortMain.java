import java.util.Arrays;
import java.util.Random;

public class InsertSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 10개의 방을 가지는 배열 만들고 랜덤하게 1 -100 값을 만들고 출력
		int [] ary = new int [10];
		// 랜덤하게 배열을 초기화
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			ary[i] = (rand.nextInt(99) + 1); 
		}
		
		System.out.print("정렬 전 >>> ");
		aryPrt(ary);
		
		Arrays.sort(ary);
		
		System.out.print("\n정렬 후 >>> ");
		aryPrt(ary);
		
		//입력하고자 하는 데이터가 중복이 아닌 데이터만 생성해서 전달
		// 로또 코드 참조?
		int insertData = 0;
		int flag = 0;
		
		while (true) {
			flag = 0;
			insertData = (rand.nextInt(99) + 1); 
			for (int i = 0; i < ary.length; i++) {
				if (ary[i] == insertData) {
					flag++;
					break;
				}
			}
			if (flag == 0)
				break;
		}
		
		int insertIdx = findInsertIdx(ary, insertData);
		System.out.println("\n삽입할 곳의 인덱스 : " + insertIdx);
		
		//선택 정렬 -> 정렬된 배열에 데이터를 추가하면서 수행

	}

	// 배열 출력
	public static void aryPrt(int [] ary) {
		System.out.println();
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i]+ "\t");
		}
	}
	
	// 정렬된 배열에서 특정 데이터가 들어갈 번지를 반환
	public static int findInsertIdx(int [] ary, int data) {
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] > data)
				return i;
		}
		return ary.length;
	}
}
