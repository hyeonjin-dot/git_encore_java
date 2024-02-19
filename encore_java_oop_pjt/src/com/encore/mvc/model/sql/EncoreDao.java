package com.encore.mvc.model.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.encore.mvc.domain.PostRequestDTO;
import com.encore.mvc.domain.PostResponseDTO;

//DB 관계를 전담하는 객체
public class EncoreDao {
	
	// url, driver, id, pwd
	public static final String URL 		= "jdbc:mariadb://localhost:3306/encore";
	public static final String DRIVER 	= "org.mariadb.jdbc.Driver";
	public static final String ID 		= "root";
	public static final String PWD 		= "123456789";
	
	public EncoreDao() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public int insertRow(PostRequestDTO params) {
		System.out.println(">> Dao insertRow << ");
		System.out.println(">> params : " + params);
		
		Connection 			conn = null; 
		PreparedStatement 	pstmt = null;
		int					flag = 0;
		String				query = "insert into post_tbl(title, content, writer) values(?, ?, ?)";
		try {
			conn = DriverManager.getConnection(URL, ID, PWD);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, params.getTitle());
			pstmt.setString(2, params.getContent());
			pstmt.setString(3, params.getWriter());
			flag = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return flag;
	}
	
	public int insertRow(Map<String, String> params) {
		System.out.println(">> Dao insertRow << ");
		System.out.println(">> params : " + params);
		
		Connection 			conn = null; 
		PreparedStatement 	pstmt = null;
		int					flag = 0;
		String				query = "insert into post_tbl(title, content, writer) values(?, ?, ?)";
		try {
			conn = DriverManager.getConnection(URL, ID, PWD);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, params.get("title"));
			pstmt.setString(2, params.get("content"));
			pstmt.setString(3, params.get("writer"));
			flag = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return flag;
	}

	// postresponsedto - idx, title, content, writer
	// return list.add(PostResponseDTO)
	public List<PostResponseDTO> selectRow(){
		System.out.println(">>>Dao select Row<<<");
		
		String query = "select idx, title, content, writer from post_tbl";
		Connection 			conn = null; 
		PreparedStatement 	pstmt = null;
		ResultSet			rset = null;
		List<PostResponseDTO> lst = new ArrayList<PostResponseDTO>();
		PostResponseDTO response = null;
		
		int					flag = 0;
		try {
			conn = DriverManager.getConnection(URL, ID, PWD);
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			
			while (rset.next()) { // record를 다음으로 넘김 
				response = new PostResponseDTO();
				response.setIdx(rset.getInt(1));
				response.setTitle(rset.getString(2));
				response.setContent(rset.getString(3));
				response.setWriter(rset.getString(4));
				lst.add(response);
				response = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return lst;
	}
}