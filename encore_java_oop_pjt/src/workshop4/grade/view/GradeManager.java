package workshop4.grade.view;

import workshop4.grade.entity.Student;

public class GradeManager {
	
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		
		Student[] sd = {
				new Student("kim", "10000", 22, 100, 100, 100),
				new Student("lee", "10001", 23, 20, 20, 20),
				new Student("park", "10002", 24, 30, 30, 30),
				new Student("choi", "10003", 25, 40, 40, 40),
				new Student("steve", "10004", 26, 50, 50, 50)
		};
		
		System.out.println("번호 이름 오라클 자바 서블릿 총점 평균");
		System.out.println("=================================");
		for (int i = 0; i < sd.length; i++) {
			System.out.printf("%d %s\n", i+1, sd[i].toString());
			a += sd[i].getOracle();
			b += sd[i].getJava();
			c += sd[i].getServlet();
		}
		
		System.out.println("=================================");

		System.out.printf("총점(오라클, 자바, 서블릿): %d %d %d", a,b,c);
	}
	
}
