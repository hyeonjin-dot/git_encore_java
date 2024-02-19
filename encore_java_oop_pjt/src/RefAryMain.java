import com.encore.hms.domain.*;
import com.encore.hms.domain.sup.Person;

public class RefAryMain {

	public static void main(String[] args) {
		//학생 객체 30명 관리
		// EmployeeDTO emp01, emp02,,.emp30;
		
		int idx = 0;
		StudentDTO [] empAry = new StudentDTO [30]; // 배열 생성
		empAry[idx++] = new StudentDTO("임정섭", 20, "서울", "1992"); 
		//empAry[idx++] = new EmployeeDTO("임정섭", 20, "서울", "1992"); // -> 에러
		// 배열에 다른 타입을 담을 수 없다.
		
		// 만약, 학생 강사 직원 객체를 담는 배열을 사용하고자 한다면?
		// 3개의 배열을 만들어야 함
		// 변수의 다형성이 적용된다면 -> 1개의 배열로 만들 수 있음.
		
		// 타입의 다형성을 배열에 적용한다면
		int perIdx = 0;
		Person [] perAry = new Person[10];
		perAry[perIdx++] = new StudentDTO("임정섭", 20, "서울", "1992"); 
		perAry[perIdx++] = new TeacherDTO("임정섭", 20, "서울", "자바"); 
		perAry[perIdx++] = new EmployeeDTO("임정섭", 20, "서울", "교육 운영팀");
		
		for (int i = 0; i < perAry.length; i++) {
			Person per = perAry[i];
//			if (per instanceof StudentDTO) {
//				StudentDTO obj = (StudentDTO) per;
//				System.out.println(obj.studentInfo());
//			}
//			if (per instanceof TeacherDTO) {
//				TeacherDTO obj = (TeacherDTO) per;
//				System.out.println(obj.teacherInfo());
//			}
//			if (per instanceof EmployeeDTO) {
//				EmployeeDTO obj = (EmployeeDTO) per;
//				System.out.println(obj.employeeInfo());
			System.out.println(per.personInfo()); // 모든 파일에 overriding해서 가능
			}
		
		System.out.println(">> main demon thread end <<");
		
		
		}
		
}
