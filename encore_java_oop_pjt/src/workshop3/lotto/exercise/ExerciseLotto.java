package workshop3.lotto.exercise;

public class ExerciseLotto {
	
	private int[] lottoNum;

	public static void main(String[] args) {
		ExerciseLotto lotto = new ExerciseLotto();
		lotto.setLottoNum();
		lotto.generateLottoNumbers();
		lotto.displayLottoNumbers(lotto.lottoNum);
		lotto.sortLottoNumbers(lotto.lottoNum);
		lotto.displayLottoNumbers(lotto.lottoNum);
	}
	
	public void setLottoNum() {
		this.lottoNum = new int[6];
	}
	
	public int[] generateLottoNumbers() {
		for (int i = 0; i < 6; i++) {
			boolean f = false;
			do {
				int nan =  (int)(Math.random() * 45) + 1;
				lottoNum[i] = nan;
				for (int j = 0; j < i; j++) {
					if (lottoNum[j] == lottoNum[i]) {
						i--;
						f = true;
					}
				}
			}while(f);
		}
		return lottoNum;
	}
	
	public void displayLottoNumbers(int[] lottoNumbers) {
		System.out.println("<< Lotto >>");
		for (int i = 0; i < 6 ; i++)
			System.out.println(lottoNumbers[i]);
	}
	
	public void sortLottoNumbers(int[] lottoNumbers) {
		// 오름차순 뭐였더라
		int tmp = 0;
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0 ; j < 5; j++) {
				if (lottoNumbers[j] > lottoNumbers[j + 1]) {
					tmp = lottoNumbers[j];
					lottoNumbers[j] = lottoNumbers[j + 1];
					lottoNumbers[j + 1] = tmp;
				}
			}
		}
	}

}
