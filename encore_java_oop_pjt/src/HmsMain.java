//import com.encore.hms.service.HmsService;
import com.encore.hms.service.HmsListService;
import com.encore.hms.util.HmsType;
import com.encore.hms.view.HmsView;


// 1.stu 2.tea 3.emp
public class HmsMain {
	public static void main(String[] args) {
//		HmsService service = new HmsService(10);
//		String msg = service.makePerson(HmsType.STU, "임",20, "서울", "1992");
//		// 출력예시) 학생|강사|직원 객체를 배열에 담았습니다.
//		System.out.println(msg);
//		msg = service.makePerson(HmsType.TEA, "임",20, "서울", "1992");
//		System.out.println(msg);
//		msg = service.makePerson(HmsType.EMP, "임",20, "서울", "1992");
		
		HmsView view = new HmsView();
		view.mainMenu();
	}
}