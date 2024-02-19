import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;
import com.encore.hms.domain.sup.Person;

/*
 * List 계열의 자료구조는 순서가 있고, 중복 허용, 객체(Object를 상속받는 타입)를 담으며, 동적이다(=> List의 길이와 요소의 개수 동일)
 * Set 계열의 자료구조는 순서가 없고, 중복 허용 x, 객체(Object를 상속받는 타입)를 담으며, 동적이다
 * 
 */
public class ListDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> col01 = new  Vector(); // <> 모든 객체 타입을 받겠다.
		// 변수를 정의하는 시점에 타입을 지정 (not new)
		// 타입을 지정 - 제너릭스 문법 (안정성 체크로 컴파일시 오류)
		
		col01.add(new StudentDTO());
		col01.add(new StudentDTO());
		col01.add(new TeacherDTO());
		System.out.println(col01.get(0).personInfo());
		System.out.println(col01.get(2).personInfo());
		 
		List<String> col02 = new LinkedList();
		col02.add("B");
		col02.add("C");
		col02.add("D");
		System.out.println(col02.get(0));
		
		Collection col03 = new HashSet();
		col03.add("C");
		
	}

}
