package com.encore.mvc.controller;

import java.util.Map;

import com.encore.mvc.domain.PostRequestDTO;
import com.encore.mvc.model.service.EncoreServiceImpl;

public class InsertController {
	
	private EncoreServiceImpl service;
	
	public InsertController() {
		service = new EncoreServiceImpl();
	}
	
	public int execute(PostRequestDTO params) {
		System.out.println(">> InsertController insertRow << ");
		System.out.println(">> params : " + params);
		
		// 의존 관계 형성 후 메서드 호출 / 반환
		return service.insertService(params);
	}
	
	public int execute(Map<String, String> params) {
		System.out.println(">> InsertController insertRow << ");
		System.out.println(">> params : " + params);
		
		// 의존 관계 형성 후 메서드 호출 / 반환
		return service.insertService(params);
	}
}
