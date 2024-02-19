import java.util.Arrays;

public class TwoAryMain {
	
	// 2차원 배열은 배열의 배열
	// 선언 방법 : int [][] numAry
	public static void main(String[] args) {
//		int [][] numAry = {{1,2,3}, {4,5,6}, {7,8}}; 
//		
//		System.out.println("length : " + numAry.length);
//		System.out.println("numAry[0] : " + numAry[0].length);
//		
//		for (int i = 0; i < numAry.length; i++) {
//			for (int j = 0; j < numAry[i].length; j++) {
//				System.out.print(numAry[i][j] + "\t");
//			}
//			System.out.println();
//		}
		
		//구구단의 결과를 2차원 배열에 담아서 출력 (2 - 9)
		// 2 4... 18 
		int [][] numAry = new int[8][9];
		
		for (int i = 2; i < 10 ; i++) {
			for (int j = 1; j < 10 ; j++) {
				numAry[i - 2][j - 1] =  i * j; 
			}
		}
		
		for (int i = 0; i < numAry.length; i++) {
			for (int j = 0; j < numAry[i].length; j++) {
				System.out.print(numAry[i][j] + "\t");
			}
			System.out.println();
		}
		
		for (int i = 0; i < numAry.length; i++) {
			System.out.println(Arrays.toString(numAry[i]));
		}
	}

}
