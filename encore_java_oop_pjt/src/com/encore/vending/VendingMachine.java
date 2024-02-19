package com.encore.vending;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@RequiredArgsConstructor // @NonNull로 지정해준 애들만 constructor만들어줌

public class VendingMachine {
	@NonNull
	private String	type;
	private int		input;
	private	int		menu;
	private int		t;
	private int		fh;
	private	int		h;
	
	public void init() {
		switch(getType()) {
		case "if":
			ifVending();
			break;
		case "switch":
			switchVending();
		}
		System.out.println("천원 : "+t+"개, 오백원 : "+fh+"개, 백원 : "+h+"개");
	}
	
	private void menu() {
		Scanner scan = new Scanner(System.in);
	
		System.out.print("금액을 입력하세요. : ");
		input = scan.nextInt();
		
		System.out.println("메뉴를 고르세요.");
		System.out.print("1.콜라(800원) 2.생수(500원) 3.비타민워터(1500원) >> ");
		menu = scan.nextInt();
	}
	

	private void ifVending() {
		menu();
		if (menu == 1)
			menu = 800;
		else if (menu == 2)
			menu = 500;
		else
			menu = 1500;
		
		int chg = input - menu;
		if (chg < 0) {
			System.out.println((menu-input) + "원 부족");
			System.out.println("돈을 더 넣으세요");
			System.exit(0);
		}
		System.out.println("잔돈 : "+chg+"원");
		t = chg / 1000;
		chg = chg % 1000;
		fh = chg / 500;
		h = (chg % 500) / 100;
	} 
	
	private void switchVending() {
		menu();
		switch(menu) {
		case 1 :
			menu = 800;
			break;
		case 2 :
			menu = 500;
			break;
		case 3 :
			menu = 1500;
		}
		
		int chg = input - menu;
		if (chg < 0) {
			System.out.println((menu-input) + "원 부족");
			System.out.println("돈을 더 넣으세요");
			System.exit(0);
		}
		System.out.println("잔돈 : "+chg+"원");
		t = chg / 1000;
		chg = chg % 1000;
		fh = chg / 500;
		h = (chg % 500) / 100;
	}

}
