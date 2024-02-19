import com.encore.loop.LoopDemo;

public class LoopDemoMain {

	public static void main(String[] args) {
		LoopDemo demo = new LoopDemo();
//		demo.loopMethod01();
//		demo.sumOneToTen();
//		demo.sumStartToEnd(1, 1000);
//		String msg = demo.leapYear(2020);
//		System.out.println(msg);
		
		demo.leapYearStartToEnd(1900,2024);
	}

}
