import com.encore.lambda.ILambda;
import com.encore.lambda.LambdaImpl;
import com.encore.lambda.Operation;

public class LambdaMain {

	public static void main(String[] args) {
//		ILambda lambda01 = new ILambda() {
//			@Override
//			public void printInfo(String str) {
//				// TODO Auto-generated method stub
//				System.out.println(str);
//			}
//			@Override
//			public int add(int x, int y) {
//				// TODO Auto-generated method stub
//				return x+y;
//			}
//		};
//		ILambda lambda02 = (x,y) -> { return x + y;};
//		int res = lambda02.add(10,10);
//		
//		lambda01.printInfo("hi");
//		lambda02.printInfo("hi");
		
//		ILambda lambda = new LambdaImpl();
//		lambda.printInfo("기존 코드 방식");
//		int res = lambda.add(10, 10);
//		System.out.println("sum >> " + res);
		
//		int addSum = result((x,y) -> x+y);
//		System.out.println(addSum);
		
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				for (int i=0; i < 10; i++)
//					System.out.println(i);
//			}
//		});
//		thread.start();
//		Thread thread = new Thread(
//				() -> {
//					for (int i=0; i < 10; i++)
//						System.out.println(i);
//				}
//		);
//		thread.start();
		System.out.println(Operation.DIVIDE.apply(2, 3));
	}
	
	public static int result(ILambda lambda) {
		return lambda.add(10, 10);
	}

}
