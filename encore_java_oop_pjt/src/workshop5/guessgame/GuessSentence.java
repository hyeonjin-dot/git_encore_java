package workshop5.guessgame;

import java.util.Scanner;

public class GuessSentence {
	public static final	String[] sentenceDictionary = {"Matrix" ,"Matrix","Matrix","Matrix"};
	
	public static void main(String[] args) {
		
		String sent = selectSentence();
		StringBuffer bf = new StringBuffer();
		boolean	ck = true;
		initGame(sent);
		
		for (int i = 0; i < sent.length(); i++)
			bf.append("\u25A1");
		
		for (int i = 0 ; i < 5 ; i++) {
			System.out.printf("\n[남은 기회] : %d\n", 5-i);
			System.out.print("한 글자를 입력하세요:");
			ck = checkString(sent, bf, getOneLetter());
			if (!ck)
				System.out.println("\n해당 글자가 없습니다.\n");
			else
				i--;
			if (bf.indexOf("\u25A1") == -1) { //
				System.out.println("\n" + bf);
				System.out.println("축하합니다.");
				break;
			}
		}
		
	}
	
	public static String selectSentence() {
		int nan = (int)(Math.random() * 4);
		return sentenceDictionary[nan];
	}
	
	public static String getOneLetter() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		return input;
	}
	
	public static String initGame(String selectedSentence) {
		System.out.println("=====================================");
		System.out.println("영화 제목을 맞춰보세요...............\n5번 까지 틀릴 수 있는 기회가 있습니다.");
		System.out.println("=====================================");
		
		for (int i = 0; i < selectedSentence.length() - 1; i++) {
			if (selectedSentence.substring(i, i + 1).equals(" "))
				System.out.print(" ");
			else
				System.out.print("\u25A1" );
		}
		if (selectedSentence.substring(selectedSentence.length() - 1).equals(" "))
			System.out.print(" ");
		else
			System.out.print("\u25A1" );
		
		return null;
	}
	
	public static boolean checkString(String selectedSentence, StringBuffer solvingSentence, String letter) {
		boolean rtn = false;
		
		System.out.println("");
		
		for (int i = 0; i < selectedSentence.length() ; i++) {
			if (selectedSentence.substring(i, i + 1).equalsIgnoreCase(letter)) {
				if (solvingSentence.indexOf(letter) == -1)
					solvingSentence.setCharAt(i, selectedSentence.charAt(i));
				rtn = true;
			}
		}
		
		System.out.println(solvingSentence);
		
		
		System.out.println("");
		return rtn;
	}
}
