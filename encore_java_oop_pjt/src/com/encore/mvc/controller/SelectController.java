package com.encore.mvc.controller;

import java.util.List;

import com.encore.mvc.domain.PostRequestDTO;
import com.encore.mvc.domain.PostResponseDTO;
import com.encore.mvc.model.service.EncoreServiceImpl;

public class SelectController {
	
	private EncoreServiceImpl service;
	
	public SelectController() {
		service = new EncoreServiceImpl();
	}
	
//	public int execute(PostRequestDTO params) {
//		System.out.println(">> SelectController insertRow << ");
//		System.out.println(">> params : " + params);
//		
//		// 의존 관계 형성 후 메서드 호출 / 반환
//		return service.insertService(params);
//	}

	public List<PostResponseDTO> execute() {
		System.out.println(">> SelectController selectRow << ");
		return service.selectService();
	}
}
