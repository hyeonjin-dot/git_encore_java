package com.encore.mvc.model.service;

import java.util.List;
import java.util.Map;

import com.encore.mvc.domain.PostRequestDTO;
import com.encore.mvc.domain.PostResponseDTO;
import com.encore.mvc.model.sql.EncoreDao;

// Service는 Dao를 갖는다.
public class EncoreServiceImpl {
	
	private EncoreDao dao;
	
	public EncoreServiceImpl() {
		dao = new EncoreDao();
	}
	
	//Dao의 insertRow() 메서드를 호출해서 결과 반환 
	public int insertService(PostRequestDTO params) {
		System.out.println(">> EncoreServiceImpl insertRow << ");
		System.out.println(">> params : " + params);
		return dao.insertRow(params);
	}
	
	public int insertService(Map<String, String> params) {
		System.out.println(">> EncoreServiceImpl insertRow << ");
		System.out.println(">> params : " + params);
		return dao.insertRow(params);
	}

	public List<PostResponseDTO> selectService() {
		System.out.println(">> EncoreServiceImpl selectRow << ");
		return dao.selectRow();
	}
}
