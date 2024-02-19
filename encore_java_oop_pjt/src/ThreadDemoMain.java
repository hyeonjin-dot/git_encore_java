import com.encore.thread.ShareObj;

public class ThreadDemoMain {

	public static void main(String[] args) {
		System.out.println("main start!");
		
		ShareObj obj01 = new ShareObj();
		Thread thread01 = new Thread(obj01);
		thread01.start(); 
		
		ShareObj obj02 = new ShareObj();
		Thread thread02 = new Thread(obj02);
		thread02.start();
		
		System.out.println("main end!");
	}

}
