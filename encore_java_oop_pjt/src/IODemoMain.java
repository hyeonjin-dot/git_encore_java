
import java.io.IOException;

import com.encore.stream.EncoreException;
import com.encore.stream.IODemo;

public class IODemoMain {

	public static void main(String[] args) {
		IODemo demo = new IODemo();
		
//		String msg = null;
//		try {
//			msg = demo.inputStr();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println(msg);
//		String[] ary = msg.split(" ");
//		int sum = 0;
//		for (String data : ary) {
//			sum += Integer.parseInt(data);
//		}
//		System.out.println(sum);
		
//		int data = demo.inputInt();
//		System.out.println(data);
		
//		try {
//			demo.first(0);
//		} catch (EncoreException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		String msg = "aBc";
//		System.out.println(msg.equalsIgnoreCase("ABC"));
//		System.out.println(msg.contains("B"));
//		System.out.println(msg.startsWith("a"));
//		System.out.println(msg.endsWith("c"));
//		msg = " aBc ";
//		System.out.println(msg.trim());
//		msg = "abcdef";
//		System.out.println(msg.charAt(0));
//		System.out.println(msg.substring(2));
		
		boolean flag = demo.outputFile();
		String msg = (flag == true) ? "저장 성공" : "저장 실패";
		System.out.println(msg);
	}

}
