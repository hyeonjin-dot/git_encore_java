import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.encore.generics.ClassName;
import com.encore.generics.Golf;
import com.encore.generics.ShortTrackSkating;
import com.encore.generics.Skating;
import com.encore.generics.SpeedSkating;
import com.encore.generics.Sports;
import com.encore.generics.Student;

public class GenericsMain {

	public static void main(String[] args) {
		/* <? extends xxx>, <? super xxx>
		 * 제너릭스 사용시 코드 상의 이점 
		 * 1. 컴파일 타입시 타입의 안정성 유지
		 * 2. 불필요한 다운캐스팅 지양
		 */ 
		//List<String> lst = new ArrayList<String>();
		//ClassName<String, Integer> obj = new ClassName<String, Integer>();
		//ClassName<Student> obj = new ClassName<Student>();
		
		//<E>
//		ClassName<String> obj01 = new ClassName<String>();
//		ClassName<Integer> obj02 = new ClassName<Integer>();
//		
//		obj01.setX("10");
//		obj02.setX(10);
//		System.out.println("obj01 value : " + obj01.getX() + "\n변수의 타입 출력 : " + obj01.getX().getClass().getName());
//		System.out.println("obj01 value : " + obj02.getX() + "\n변수의 타입 출력 : " + obj02.getX().getClass().getName());
		
		// <K, V>
		//Map<String, Integer> map = new HashMap<String, Integer>(); // 이 느낌
//		ClassName<String, Integer> obj = new ClassName<String, Integer>();
//		obj.setX("10", 10);
//		System.out.println("obj Key value : " + obj.getKey() + "\n변수의 타입 출력 : " + obj.getKey().getClass().getName());
		
		// 제너릭스의 다형성
		// 와일드카드(기호 : ?) 사용 가능
		/*
		 * <? extends Skating> -> Skating 상속받는 하위 객체를 포함하겠다.
		 * <? super Golf> -> Golf와 상위 클래스로 제한 
		 */
//		List<Sports> lst = new ArrayList();
//		lst.add(new Golf());
//		lst.add(new Skating());
//		lst.add(new ShortTrackSkating());
	
		// ? 저장은 X, 꺼낼 수 있음 -> 반환 타입은 object
		// 메서드의 리턴타입, 매개변수 지정
		//List<?> lst = new ArrayList();
//		lst.add(null); // null값 허용
//		lst.add(new Golf()); // 객체를 담을 수 없기 때문에 에러
		
		//<? extends Skating> == <Skating> 
		// 저장 X, 꺼낼 수 있는데 반환 타입은 Skating
		// 메서드의 리턴타입, 매개변수 지정
//		List<? extends Skating> lst = new ArrayList();
//		lst.add(new SpeedSkating()); // 객체를 담을 수 없기 때문에 에러
		
		// 저장 가능 (타입 : Golf, 상위 타입)
		// 반환타입은 Object
		//List<? super Golf> lst = new ArrayList();
		
		// 상황에 대한 이해...
		//List<Sports> lst = new ArrayList();
		List<Skating> lst = new ArrayList();
		lst.add(new ShortTrackSkating());
		lst.add(new SpeedSkating());
		getExtendsMethod(lst);
		
	}
	
	public static void getExtendsMethod(List<? extends Skating> lst) { // casting의 문제 발생 가능 
		
	}

}
