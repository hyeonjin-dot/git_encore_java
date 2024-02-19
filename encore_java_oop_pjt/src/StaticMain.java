import com.encore.staticdemo.StaticDemo;

public class StaticMain {

	public static void main(String[] args) {
		
		StaticDemo demo1 = new StaticDemo("jslim");
		System.out.println(demo1.getName());
		StaticDemo demo2 = new StaticDemo("encore");
		System.out.println(demo2.getName());
		
		demo1.staticMsg = "demo1 msg";
		demo2.staticMsg = "demo2 msg";
		System.out.println(demo1.staticMsg);
		
		demo1.nonStatic();
		//StaticDemo.nonStatic(); 에러
		// staticMethod()는 클래스 소유 -> 클래스 이름으로 접근 가능
		StaticDemo.staticMethod(); 
		
	}

}
