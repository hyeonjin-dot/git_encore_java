
import java.util.Random;

public class SelectSortMain {

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
		
		//2. 초기화 된 배열로부터 최소 값이 들어있는 인덱스를 리턴
		int minIdx = findMinIdx(ary);
		//System.out.println("\n최소 인덱스 " + minIdx);
	}
	
	// 배열 출력
	public static void aryPrt(int [] ary) {
		System.out.println();
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i]+ "\t");
		}
	}
	
	public static int findMinIdx (int [] ary) {
		//최소 값 찾기
		/*int idx = 0;
		
		for (int i = 1; i < ary.length; i++) {
			if (ary[i] < ary[idx])
				idx = i;
		}
		
		return idx;*/
		
		
		int minIdx = 0;
		int tmp = 0;
		
		for (int i = 0; i < ary.length - 1; i++) {
			 minIdx = i;
			for (int j = i+1 ; j < ary.length; j++) {
				// 인덱스 변경
				if (ary[minIdx] > ary[j]) {
					minIdx = j;
				}
			}
			//데이터의 스왑 
			tmp = ary[i];
			ary[i] = ary[minIdx];
			ary[minIdx] = tmp;
		}
		
		return 0;
	}

}
