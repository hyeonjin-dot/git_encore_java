import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.encore.mvc.domain.DepartmentResponseDTO;

public class DataBaseMain {

	public static void main(String[] args) {
		// url, driver, id, pwd
		String URL 		= "jdbc:mariadb://localhost:3306/mysql";
		String DRIVER 	= "org.mariadb.jdbc.Driver";
		String ID 		= "root";
		String PWD 		= "123456789";
		Connection conn = null; 
		PreparedStatement pstmt = null;
		ResultSet		rset = null;
		
		/* JDBC
		 * try{
		 * =============ORM 담당=================
		 * 1. 벤더사에서 제공하는 드라이버 로딩
		 * 2. 연결(url, id, pwd)
		 * 3. 실행ㄹ구문을 담을 수 있는 그릇이 필요 (statement, preparedStatement)
		 * 4. 실행 (execute - executeQuery(Select), executeUpdate(insert, delete, update))
		 * 5. 실행 결과를 반환
		 * ===================================== (Mybatis, JPA)
		 * 6. 결과 객체화 시키고 다건인 경우 자료구조를 이용해서 담는 것
		 * 7. 외부리소스(디비연결)을 닫기
		 * } catch(){
		 * 
		 * } finally(){
		 * 
		 * }
		 */
		
		try {
			Class.forName(DRIVER); // driver 로딩
			System.out.println("드라이버 로딩 완료");
			conn = DriverManager.getConnection(URL, ID, PWD);
			System.out.println("디비 연결 완료 >> " + conn);
			/*String sql = "select dept_id, dept_name, loc_id from department where dept_id = ?";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setString(1, "10"); // -> ?에 10을 넣어줌 (타입 확인 잘해야함)
			rset = pstmt.executeQuery(); // 가상의 테이블의 결과를 받음
			
			DepartmentResponseDTO response = null;
			while (rset.next()) { // record를 다음으로 넘김 
				System.out.println("true"); // record의 개수만큼 출력됨
				//rset.getString(1); // select되는 순서 혹은 col의 이름 (ex. 1 == dept_id)
				response = new DepartmentResponseDTO();
				response.setDept_id(rset.getString(1));
				response.setDept_name(rset.getString(2));
				response.setLoc_id(rset.getString(3));
			}
			System.out.println("Result >> " + response);*/ //single finder select
			
			String sql = "insert into department values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "70");
			pstmt.setString(2, "교육");
			pstmt.setString(3, "A3");
			int res = pstmt.executeUpdate(); // 실행한 쿼리 개수 return 실패시 0 리턴(roll back)
			System.out.println("DML result >> " + res);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}