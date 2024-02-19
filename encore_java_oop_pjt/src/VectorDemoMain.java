/*
 * 싱글 쓰레드 : 순차실행 main start - 파일 다운로드 (A) - 파일 다운로드 (B) - main end 가 순차적으로 실행됨
 * 멀티 쓰레드 : 병렬실행 main start - 파일 다운로드 (A)(thread) - 파일 다운로드 (B)(thread) - main end 가 동시에 실행됨
 * ArrayList - Vector
 */ 

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemoMain {

	public static void main(String[] args) {
		/*
		List<Integer> lst = new ArrayList();
		List<Integer> vec = new Vector();
		
		new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				lst.add(1); // thread가 arraylst 접근 -> not synchronized
				vec.add(1); // thread가 vector 접근 -> synchronized
			}
		}).start(); 
		
		//2개의 thread 동시 접근
		new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				lst.add(2); 
				vec.add(2);
			}
		}).start(); 
		
		//출력용 thread
		new Thread(() -> {
			try {
				Thread.sleep(2000);
				System.out.println("ArrayList size = " + lst.size());
				System.out.println("Vector size = " + vec.size());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}).start(); */
		
		/*
		List<Integer> vec = new Vector();
		
		//2개의 thread가 동일한 벡터에 접근
		new Thread(() -> {
			vec.add(1);
			vec.add(2);
			vec.add(3);
			
			System.out.println(vec.get(0));
			System.out.println(vec.get(1));
			System.out.println(vec.get(2));
		}).start(); 
		
		new Thread(() -> {
			vec.remove(0); // 동적으로 사이즈 변화
			vec.remove(0);
			vec.remove(0);
		}).start(); 
		
		//출력
		new Thread(() -> {
			try {
				Thread.sleep(1000);
				System.out.println("Vector size = " + vec.size());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();*/
		
		
	}

}
