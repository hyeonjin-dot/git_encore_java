
public class ExceptionMain {

	public static void main(String[] args) throws Exception{
		/*
		String [] strAry = {"SW", "java", "python"};
		
		try {
			System.out.println("예외 발생 코드 시작점");
			for (int i = 0; i <= strAry.length; i++) {
				System.out.println(strAry[i]);
			}
			System.out.println("예외 발생 코드 종료점"); 
		} catch(Exception e){
			//System.out.println("예외 발생 시 호출");
			e.printStackTrace();
		} finally {
			System.out.println("예외발생 여부와 상관없이 항상 수행");
		}
		
		System.out.println("메인 메서드 종료");
		*/
		
		int res = userException();

		System.out.println("메인 메서드 종료");
		
	}
	
	public static int userException() throws ArithmeticException {
		int res = 10/0;
		return res;
	}
}