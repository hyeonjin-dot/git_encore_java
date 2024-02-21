import java.util.Random;

public class QuickMain {

	public static void main(String[] args) {
		int [] ary = new int [10];
		// 랜덤하게 배열을 초기화
		Random rand = new Random();
		for (int i = 0; i < ary.length; i++) {
			ary[i] = (rand.nextInt(99) + 1); 
			for (int j = 0; j < i; j++) {
				if (ary[j] == ary[i]) {
					i--;
					break;
				}
			}
		}
		
		System.out.print("정렬 전 >>> ");
		aryPrt(ary);
		quickSort(ary, 0, ary.length - 1);
		System.out.println();
		aryPrt(ary);
	}
	
	public static void quickSort(int [] ary, int low, int high) {
		if (low >= high)
			return ;
		
		int pivot = low;
		int left = low + 1;
		int right = high;
		int tmp = 0;
		
		while (left <= right) {
			// 피봇보다 큰 데이터를 찾을 때 까지 반복
			while (left <= high && ary[left] <= ary[pivot])
				left++;
			// 피봇보다 작은 데이터를 찾을 때 까지 반복
			while (right > low && ary[right] >= ary[pivot])
				right--;
			tmp = ary[right];
			if (left > right) { // 
				ary[right] = ary[pivot];
				ary[pivot]= tmp;
			}
			else {
				ary[right] = ary[left];
				ary[left]= tmp;
			}
		}

		quickSort(ary, low, right - 1);
		quickSort(ary, right + 1, high);
		
		/*if (end <= start)
			return ;
		
		int pivot = ary[(start + end) / 2];
		int low = start;
		int high = end;
		int tmp;
		
		while (low <= high) {
			while (ary[low] < pivot)
				low++;
			while (ary[high] > pivot)
				high--;
			if (low <= high) {
				tmp = ary[low];
				ary[low] = ary[high];
				ary[high] = tmp;
				low++;
				high--;
			}
		}
		
		quickSort(ary, start, low - 1);
		quickSort(ary, low, end);*/
	}

	// 배열 출력
	public static void aryPrt(int [] ary) {
		System.out.println();
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i]+ "\t");
		}
	}
}
