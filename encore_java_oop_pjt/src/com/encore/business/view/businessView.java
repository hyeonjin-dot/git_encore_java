package com.encore.business.view;

import java.util.Scanner;

import com.encore.business.domin.businessDTO;
import com.encore.business.service.businessService;
import com.encore.stream.EncoreException;

public class businessView {
	public businessDTO bus;
	private businessService service;
	
	public businessView() {
		service = new businessService(10);
	}
	
	public void mainView() {
		int i = service.getSavedIdx();
		if (i == 0) 
			mainNoView();
		else
			mainNormalView(service.getAry(service.getViewerIdx()));
	}
	
	public void mainNormalView(businessDTO bus) {
		lineView();
		System.out.println("이름: "+bus.getName());
		System.out.println("전화번호: "+bus.getNumber());
		System.out.println("이메일: "+bus.getEmail());
		System.out.println("팩스: "+bus.getFax());
		System.out.println("홈페이지: "+bus.getHpage());
		System.out.println("회사명: "+bus.getCom());
		System.out.println("직책: "+bus.getEmp());
		System.out.println("주소: ("+bus.getZip()+") "+bus.getAdd());
	}
	
	public void mainNoView() {
		lineView();
		System.out.println("[현재, 입력된 내용이 없습니다!]");
		return ;
	}
	
	public void mainMoreView(String msg) {
		System.out.println("더이상 " + msg+ " 항목이 없습니다!");
	}

	public void lineView() {
		System.out.println("_______________________________________________________");
	}

	public void askView() {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int rtn = 0;
		String input = null;
		while (true) {
			i = service.getSavedIdx();
			if (i == 0)
				mainNoView();
			else
				mainNormalView(service.getAry(service.getViewerIdx()));
			System.out.println("\n명함관리 [P(revious), N(ext), I(nsert), U(pdate), D(elete)]?");
			lineView();
			input = null;
			try {
				input = scan.nextLine();
				input = input.toLowerCase();
				switch (input){
				case "p", "previous" :
					rtn = service.previous();
					switch(rtn) {
					case -1 :
						mainNoView();
						break;
					case 0 : 
						mainMoreView("이전");
						break;
					case 1:
						mainNormalView(service.getAry(service.getViewerIdx()));
						break;
					}
					break;
				case "n", "next" :
					rtn = service.next();
					switch(rtn) {
					case -1 :
						mainNoView();
						break;
					case 0 : 
						mainMoreView("이후");
						break;
					case 1:
						mainNormalView(service.getAry(service.getViewerIdx()));
						break;
					}
					break;
				case "i", "insert" :
					service.insert();
					break;
				case "u", "update" :
					service.update();
					break;
				case "d", "delete" :
					service.delete();
					break;
				case "exit":
					System.out.println("프로그램을 종료합니다....데이터는 보관되지 않습니다....");
					System.exit(0);
					break;
				default:
					System.out.println("?? 없는 명령어 입니다!");
					throw new EncoreException("사용자 정의 예외 발생");
				}
			} catch (Exception e) {
				scan.nextLine();
			}
		}
	}

}
