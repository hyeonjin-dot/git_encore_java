
public class StringDemoMain {

	public static void main(String[] args) {
		//자바에서 유일하게 참조타입이지만 기본타입처럼 사용가능한 변수의 타입은 String
		// String은 인스턴스 생성없이 사용 가능하지만 객체로 취급이 된다.
		String str01 = new String("ddd");
		String str02 = new String("ddd");
		
		if (str01 == str02)
			System.out.println("주소값 same");
		else
			System.out.println("주소값 diff");
		
		if (str01.equals(str02))
			System.out.println("값 same");
		else
			System.out.println("값 diff");
	}
}
