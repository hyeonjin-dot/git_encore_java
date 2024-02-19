package workshop5.guessgame;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieServiceImpl {
    private String[] sentenceDictionary = { "Matrix",
            "I know what you did last summer", "The Silence Of The Lambs",
            "Saving Private Ryan", "Black Hawk Down", "American Pie",
            "Enemy Of The State" };
    private ArrayList<String> lst = null;
    public MovieServiceImpl() {
    	lst = new ArrayList<String>(Arrays.asList(sentenceDictionary));
    }
    
    // 임의의 영화제목 리턴받기
    //Random 이용 -> Random(nextInt())
    public String selectSentence() {
    	return null;
    }
    
    //게임 초기화 화면 출력 & 숨겨진 영화 제목 반환
    public String initGame(String selectedSentence) {
    	System.out.println("=====================================");
    	System.out.println(" 영화 제목을 맞춰 보세요..... ");
    	System.out.println(" 5번까지 틀릴 수 있습니다. ");
    	System.out.println("=====================================");
    	return null;
    }
    
    //scanner, 사용자로부터 하나의 문자를 입력받아서 반환 
    public String getOneLetter() {
    	return null;
    }
    
    // 영화 제목에서 입력받은 문자를 정답으로 변경하고 찾았는지 여부를 반환
    public boolean checkString(String selectedSentence, StringBuffer solvingSentence, String letter) {
    	return true;
    }
}
