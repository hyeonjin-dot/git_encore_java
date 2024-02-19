package com.encore.hms.view;

import java.util.List;
import java.util.Scanner;

import com.encore.hms.domain.sup.Person;
import com.encore.hms.service.HmsListService;
import com.encore.hms.util.HmsType;

public class HmsView {
	public static Scanner scan = new Scanner(System.in);
	private HmsListService service;
	
	// HmsView는 HmsService와 의논성 주입(Dependency Injection) 관계가 형성
	// 즉, HmsView는 HmsService의 객체 생성을 통한 접근을 필요로 하는 것.
	public HmsView() {
		service = new HmsListService(10);
	}
	
	public void mainMenu() {
		while(true) {
			System.out.println();
			System.out.println(">>>>>> HMS <<<<<<");
			System.out.println("1. 전체출력");
			System.out.println("2. 이름으로 검색");
			System.out.println("3. 이름으로 찾아서 수정");
			System.out.println("4. 이름으로 찾아서 삭제");
			System.out.println("5. 생성");
			System.out.println("99. 종료");
			System.out.print("Input Number : ");
			int num = 0;
			
			try {
				num = scan.nextInt();
				switch(num) {
					case 1:
						perPrint();
						break;
					case 2:
						search();
						break;
					case 3:
						update();
						break;
					case 4:
						remove();
						break;
					case 5:
						subMenu();
						break;
					case 99:
						System.out.print("데이터 저장(Y/N) 하시겠습니까?");
						String confirmYN = scan.next().toLowerCase();
						if (confirmYN.equals("y")) {
							service.saveToFile();
							System.out.println("데이터 저장 완료!");
						}
						else {
							System.out.println("프로그램을 종료합니다....데이터는 보관되지 않습니다....");
						}
						System.exit(0);
						break;
					default :
						System.out.println("메뉴에 정의된 숫자만 입력해주세요.");	
				}
			} catch (Exception e) {
				System.out.println("숫자만 입력하세요");
				scan.nextLine();
			}
		}
	}
	
	public void perPrint() {
		System.out.println();
		System.out.println(">> 전체 출력 <<");
		List<Person> perAry = service.getAry();
		if (service.getIdx() == 0) {
			service.loadToFile();
			//System.out.println(">>> 데이터가 존재하지 않습니다. <<<");
		}
		else {
			for (Person per: perAry)
				if (per != null)
					System.out.println(per.personInfo());
				else
					break;
		}
	}
	
	public void subMenu() {
		while (true) {
			System.out.println();
			System.out.println(">>>>>> 객체 생성을 위한 sub Menu");
			System.out.println("1. 학생");
			System.out.println("2. 강사");
			System.out.println("3. 직원");
			System.out.println("99. 상위메뉴 이동");
			System.out.print("Input Number : ");
			
			int num = scan.nextInt();
			switch(num) {
			case 1:
			case 2:
			case 3:
				makePerson(num);
				break;
			case 99:
				System.out.println("상위 메뉴로 이동합니다.");
				return;
			}
		}
	}
	
	public void makePerson(int num) {
		System.out.println();
		System.out.println(">> 객체 생성 <<");
		
		HmsType flag = HmsType.STU;
		
		System.out.print("이름을 입력하세요 : ");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();
		System.out.print("주소를 입력하세요 : ");
		scan.nextLine();
		String add = scan.nextLine();
		
		switch(num) {
		case 1:
			System.out.print("학번을 입력하세요 : ");
			break;
		case 2:
			System.out.print("과목을 입력하세요 : ");
			flag = HmsType.TEA;
			break;
		case 3:
			System.out.print("부서를 입력하세요 : ");
			flag = HmsType.EMP;
		}
		String comm = scan.nextLine();
		
		System.out.println(service.makePerson(flag, name, age, add, comm));
	}
	
	public void search() {
		scan.nextLine();
		System.out.print("이름을 입력하세요 : ");
		String name = scan.nextLine();
		Person per = service.searchPerson(name);
		if (per != null)
			System.out.println(per.personInfo());
		else
			System.out.println("정보가 존재하지 않습니다.");
	}
	
	// 학번, 과목, 부서 수정
	public void update() {
		scan.nextLine();
		System.out.print("이름을 입력하세요 : ");
		String name = scan.nextLine();
		System.out.print("수정할 내용을 입력하세요 : ");
		String comm = scan.nextLine();

		service.updatePerson(name, comm);
		
	}
	
	// 삭제하고 앞으로 댕김
	public void remove() {
		scan.nextLine();
		System.out.print("이름을 입력하세요 : ");
		String name = scan.nextLine();
		
		service.removePerson(name);

	}

}