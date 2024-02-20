import java.util.Comparator;

import com.encore.compare.Teacher;

public class CompareMain {
	
	public static void main(String[] args) {
		/*
		 * 기본타입은 크기를 비교하여 정렬할 수 있다.
		 * 객체를 비교할 때 Comparable(compareTo(T)) vs Comparator(compare(T, T))
		 * 해당 비교를 통해 객체 정렬 할 수 있는 것
		 * 객체를 비교하기 위해서는 기준이 필요 (객체가 소유하고 있는 변수를 선정)
		 * 객체는 Comparable 또는 Comparable 인터페이스를 구현하고 메서드를 오버라이딩해야 함
		 */
		
		// 기본 데이터 타입은 연산자를 통해서 쉽게 비교할 수 있음
//		int x = 1;
//		int y = 2;
//		
//		if (x > y)
//			System.out.println("-1");
//		else if (x == y)
//			System.out.println("0");
//		else
//			System.out.println("1");
		
		Teacher tea01 = new Teacher(20,5);
		Teacher tea02 = new Teacher(30,2);
		
		// thread -> 익명의 클래스, 람다식
		Comparator<Teacher> comp = new Comparator<Teacher>() {
			
			@Override
			public int compare(Teacher o1, Teacher o2) {
				if (o1.getAge() > o2.getAge())
					return 1;
				else if (o1.getAge() == o2.getAge())
					return 0;
				else
					return -1;
			}
		}; 
		
		int flag = comp.compare(tea01, tea02);
		
		if (flag == 1) {
			System.out.println("오름차순 정렬이라면 자리 변경 필요, 내림차순 정렬이라면 자리 변경 불필요");
		}else if (flag == 0) {
			System.out.println("두 값이 같다");
		}else {
			System.out.println("오름차순 정렬이라면 자리 변경 불필요, 내림차순 정렬이라면 자리 변경 필요");
		}
		
		//System.out.println("기준을 여러개 잡고 싶다면? (나이를 기준으로 동일하다면 반을 기준으로 비교)");
		
	}
}
