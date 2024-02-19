import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;

import com.encore.data.structor.list.EncoreNode;
import com.encore.data.structor.list.EncoreNodeList;

public class LinkedListDemoMain {

	public static void main(String[] args) throws Exception {
		
		/*List<Integer> lst = new LinkedList();
		lst.add(1);*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		/*BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		writer.write("데이터를 입력하세요 : ");
		writer.flush();*/
		
		System.out.print("데이터를 입력하세요 : ");
		int data = Integer.parseInt(reader.readLine());
		
		// LinkedList의 header 생성
		EncoreNodeList mgr = new EncoreNodeList(data); 
		
		while(true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 연결리스트 데이터 출력");
			System.out.println("2. 연결리스트 데이터 추가");
			System.out.println("3. 연결리스트 데이터 삭제");
			System.out.println("99. 프로그램 종료");
			System.out.print("원하는 번호 입력 : ");
			
			int num = Integer.parseInt(reader.readLine());
			switch(num) {
			case 1:
				System.out.println(">> 데이터 출력 <<");
				mgr.desc();
				break;
			case 2:
				System.out.println(">> 데이터 추가 <<");
				System.out.print("추가 할 데이터를 입력하세요 : ");
				int addData = Integer.parseInt(reader.readLine());
				mgr.add(addData);
				break;
			case 3:
				System.out.println(">> 데이터 삭제 <<");
				System.out.print("삭제 할 데이터를 입력하세요 : ");
				int removeData = Integer.parseInt(reader.readLine());
				mgr.remove(removeData);
				break;
			case 99:
				System.out.println(">> 종료 <<");
				System.exit(0);
				break;
			default :
				System.out.println("다른 값을 입력하세요.");
			}
		}
		
	}

}
