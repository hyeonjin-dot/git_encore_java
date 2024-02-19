package com.encore.post.view;

import java.util.Scanner;

import com.encore.post.domain.PostRequestDTO;
import com.encore.post.service.PostService;

public class PostView {
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println(">>>>> Beyond 5th <<<<<");
			System.out.println("1. login");
			System.out.println("2. join");
			System.out.println("3. post write");
			System.out.println("4. post delete");
			System.out.println("99. exit");
			System.out.print("input num : ");
			int num = scan.nextInt();
			
			if (num == 99) {
				System.exit(0);
			}
			if (num == 3) {
				requestSave();
			}
			if (num == 4) {
				requestDelete();
			}
		}
	}
	
	public void requestSave() {
		System.out.println("debug >>>>> client post view");
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = scan.nextLine();
		System.out.print("제목 : ");
		String title = scan.nextLine();
		System.out.print("내용 : ");
		String content = scan.nextLine();
		System.out.print("조회수 : ");
		int cnt = scan.nextInt();
		System.out.print("공개여부 : ");
		Boolean isFlag = scan.nextBoolean();
		
		PostRequestDTO input = new PostRequestDTO(id, title, content, cnt, isFlag);
		PostService pServ = new PostService();
		String msg = pServ.savePost(input);
		System.out.println("Result >>>> " + msg);
		scan.close();
	}
	
	// terminal로부터 사용자 아이디를 입력받아
	// 해당 아이디를 dto에 넣고 
	// postService 클래스에 정의된 postDelete(PostRequestDTO param)
	// 메서드를 호출하여 삭제되었습니다라는 메세지 반환받아서 출력
	public void requestDelete() {
		System.out.println("debug >>>>> client post view");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = scan.nextLine();
		
		PostRequestDTO input = new PostRequestDTO(id);
		PostService pServ = new PostService();
		String msg = pServ.deletePost(input);
		System.out.println("Result >>> " + msg);
	}
	
}
