
public class BinarySearchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Wrapper (int - Integer)
//		Integer i = new Integer(10);
//		int sum = i + 10;
//		System.out.println(sum);

//		Integer [] ary = new Integer[14];
//		for (int i = 0; i < ary.length; i++) {
//			ary[i] = (int) (Math.random() * 100 + 1);
//			//System.out.println(ary[i]);
//		}
		Integer [] ary = {1,3,4,5,7,9,10,11,13,15,16, 18,19,20};
		aryPrt(ary);
		
		/*
		 * 이진 탐색 개념 정리
		 * - 중앙값의 인덱스를 필요
		 * - 찾고자 하는 데이터 (target)
		 * - low(0), high(ary.length - 1)
		 * - mid 값을 조절하면서 반복 (재귀)
		 * 종료 조건 
		 * - 데이터 검색 성공시 종료
		 * - 데이터 검색 실패시 종료
		 * - 더 이상 검색할 데이터가 없는 경우 (반복, 재귀) 
		 */
		/*System.out.print("\nmid idx ");
		int low = 0;
		int high = ary.length - 1;
		int mid = low + (low + high) / 2; // 앞에 low를 더하는 이유는 exception 뜨지 말라고
		int target = 7;
		System.out.println(mid + " value " + ary[mid]);
		

		
		System.out.println("low  = "  + low);
		System.out.println("high  = "  + high);	
		System.out.println("찾고자 하는 데이터가 작아서 중앙값 조절 >>>>");
		mid = low + (low + high) /2;
		System.out.println("mid idx " + mid + " value " + ary[mid]);*/
		
		//int findIdx = search(ary, 7);
		int findIdx = search(ary, 7, 0, ary.length - 1);
		if (findIdx != -1)
			System.out.println("탐색 완료 : " + ary[findIdx]);
		else 
			System.out.println("탐색 실패 : " + findIdx );
	}
	
	// 반복구문
	//return value : index 성공시 해당인덱스 실패시 -1
	public static int search(Integer [] ary, int target) {
		int low = 0;
		int high = ary.length - 1;
		int mid = low + (low + high)/2;
		
		while (high >= low) {
			if (ary[mid] == target) {
				//System.out.println("탐색 완료");
				return mid;
			}
			else if (ary[mid] > target) {
				high = mid - 1;
			}else { //ary[mid] > target
				 low = mid + 1;
			}
			mid = (low + high) /2;
		}
		
		return -1;
	}
	
	//재구ㅣ
	public static int search(Integer[] ary, int target, int start, int end) {
		if (start >= end)
			return -1;
		
		int mid = start + (end - start)/2;
		
		if (ary[mid] == target) 
			return mid;
		else if (ary[mid] > target)
			return search(ary, target, start, mid - 1);
		else //ary[mid] > target
			return search(ary, target, mid + 1, end);
	}

	public static void aryPrt(Integer[] ary) {
		for (Integer data : ary) {
			System.out.print(data + "\t");
		}
		System.out.println();
	}
}
