package com.encore.business.service;

import java.util.Scanner;

import com.encore.business.domin.businessDTO;
import com.encore.business.view.businessView;
import com.encore.hms.domain.sup.Person;
import com.encore.stream.EncoreException;

public class businessService {
	private businessDTO [] card;
	private	int	i = 0; //저장용, 개수
	private int v = 0; //뷰어, 인덱스
	private Scanner scan = new Scanner(System.in);
	
	public businessService(int size) {
		card = new businessDTO[size];
	}
	
	// 몇개 저장되어 있는지 리턴
	public int getSavedIdx() {
		return i;
	}
	
	// 몇번째 보고 있었는지 리턴
	public int getViewerIdx() {
		return v;
	}
	
	//input 받기 0 -> insert 1 -> update
	public String inputHere(String msg, int i) {
		boolean flag = false;
		String input = null;
		int size = Integer.parseInt(msg.replaceAll("[^0-9]", ""));
		while (flag == false) {
			System.out.print(msg);
			if (i == 1)
				System.out.print("\n새값: ");
			input = scan.nextLine().trim();
			flag = rightInput(input, size, msg.contains("*"));
		}
		return input;
	}
	
	//제대로 들어왔는지 확인
	public boolean rightInput(String msg, int size, boolean flag) {
		boolean rtn = true;
		if (size < msg.length()) {
			System.out.println("?? 최대 입력 문자수를 초과했습니다.");
			return false;
		}
		if (flag == true && msg.length() == 0) {
			System.out.println("?? 이 항목은 필수 입력 항목입니다.");
			return false;
		}
		return rtn;
	}
	
	// 결정을 함수로 뽑고 싶음 
//	public void saveInput(String msg, businessDTO b) {
//		if (msg.equals("입력")) {
//			
//		}
//		else if(msg.equals("수정")) {
//			
//		}
//		else {
//			
//		}
//	}
	
	public int previous() {
		if (i == 0)
			return -1;
		else if (v == 0) 
			return 0;
		else 
			v--;
		return 1;
	}
	
	public int next() {
		if (i == 0)
			return -1;
		else if (v == i - 1)
			return 0;
		else
			v++;
		return 1;
	}

	public void insert() {
		
		System.out.println("_______________________________________________________");
		System.out.println("'*' 표시는 필수 입력.");
		
		String name = inputHere("이름은(*) [최대10자]?", 0);
		String phone = inputHere("전화번호는(*) [최대20자]?", 0);
		String email = inputHere("이메일은(*) [최대30자]?", 0);
		String fax = inputHere("팩스는 [최대20자]?", 0);
		String hpage = inputHere("홈페이지 [최대50자]?", 0);
		String com = inputHere("회사명은 [최대20자]?", 0);
		String emp = inputHere("직책은 [최대10자]?", 0);
		String zip = inputHere("우편번호 [최대7자]?", 0);
		String add = inputHere("주소 [최대50자]?", 0);
		businessDTO b = new businessDTO(name, phone, email, fax, hpage, com, emp, zip, add);
		
		String rtn = null;
		while (true) {
			try {
				System.out.println("\n위의 내용을 입력하시겠습니까 (y/n)?");
				System.out.println("_______________________________________________________");
				rtn = scan.nextLine();
				switch (rtn) {
				case "y" :
					setAry(b);
					return;
				case "n" :
					return;
				default:
					System.out.println("?? 없는 명령어 입니다!");
					throw new EncoreException("사용자 정의 예외 발생");
				}
			}catch(Exception e) {
				scan.nextLine();
			}
		}
	}
	
	public void update() {
		if (i == 0) {
			System.out.println("수정할 내용이 없습니다.");
			return ;
		}
		System.out.println("_______________________________________________________");
		System.out.println("'*' 표시는 필수 입력.");
		String name = inputHere("이름은(*) [최대10자]?"+ card[v].getName(), 1);
		String phone = inputHere("전화번호는(*) [최대20자]?"+ card[v].getNumber(), 1);
		String email = inputHere("이메일은(*) [최대30자]?"+ card[v].getEmail(), 1);
		String fax = inputHere("팩스는 [최대20자]?"+ card[v].getFax(), 1);
		String hpage = inputHere("홈페이지 [최대50자]?"+ card[v].getHpage(), 1);
		String com = inputHere("회사명은 [최대20자]?"+ card[v].getCom(), 1);
		String emp = inputHere("직책은 [최대10자]?"+ card[v].getEmp(), 1);
		String zip = inputHere("우편번호 [최대7자]?"+ card[v].getZip(), 1);
		String add = inputHere("주소 [최대50자]?"+ card[v].getAdd(), 1);
		
		businessDTO b = new businessDTO(name, phone, email, fax, hpage, com, emp, zip, add);
		
		String rtn = null;
		while(true) {
			try {
				System.out.println("\n위의 내용으로 수정하시겠습니까 (y/n)?");
				System.out.println("_______________________________________________________");
				rtn = scan.nextLine();
				switch (rtn) {
				case "y" :
					card[v].changeCard(b);
					return;
				case "n" :
					return;
				default:
					System.out.println("?? 없는 명령어 입니다!");
					throw new EncoreException("사용자 정의 예외 발생");
				}
			}
			catch(Exception e){
				scan.nextLine();		
			}
		}
	}
	
	public void delete() {
		if (i == 0) {
			System.out.println("삭제할 내용이 없습니다.");
			return ;
		}
		String rtn = null; 
		while (true) {
			try {
				System.out.println("_______________________________________________________");
				System.out.println("정말로 삭제하시겠습니까 (y/n)?");
				System.out.println("_______________________________________________________");
				rtn = scan.nextLine();
				switch (rtn) {
				case "y" :
					for (int idx = v; idx < i ; idx++) 
						card[idx] = card[idx + 1];
					i--;
					if (v > 0)
						v--;
					card[i] = null;
					System.out.println("정보가 삭제되었습니다.");
					return;
				case "n" :
					return;
				default:
					System.out.println("?? 없는 명령어 입니다!");
					throw new EncoreException("사용자 정의 예외 발생");
				}
			}
			catch(Exception e){
				scan.nextLine();		
			}
		}
		
	}
	
	// 새로운 명함 저장
	public void setAry(businessDTO b) {
		card[i++] = new businessDTO(b);
	}
	
	// 원하는 인덱스의 명함 리턴
	public businessDTO getAry(int idx) {
		return card[idx];
	}
}