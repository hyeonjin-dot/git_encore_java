import com.encore.test.StudentVO;

public class ReferenceMain {
/*
 * 기본타입과 참조타입의 차이점
 * 기본타입은 선언과 동시에 값을 할당 가능
 * 기본타입은 값을 담는 변수
 * 참조타입은 선언과 동시에 값을 할당 불가
 * 참조타입은 값을 담는 변수가 아니라 주소값을 담는 변수
 * 주소값을 담기 위해서는 객체 생성이라는 것이 필요
 * 객체 생성시 사용하는 연산자는 new
 * new 뒤에는 생성자(constructor)를 호출
 */
	public static void main(String[] args) {
		StudentVO stuObj = new StudentVO(); 
		// new Student() -> 주소값 호출, 객체 생성
		// StudentVO <- 참조타입
		
//		stuObj.name = "ss";
//		System.out.println(stuObj.name);
		
		System.out.println("인스턴트 소유의 메서드 호출");
		stuObj.setName("dfdf");
		
		String returnValue = stuObj.getName();
		System.out.println(returnValue); // 값을 유지하기 위해
		
		System.out.println(stuObj.getName());
	}

}
