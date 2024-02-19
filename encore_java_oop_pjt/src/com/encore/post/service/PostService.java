package com.encore.post.service;

import com.encore.post.domain.PostRequestDTO;

// xxxService, xxxServiceImp1 비지니스 로직을 처리
// 사용자가 블로그에 글 작성(savePost), 수정, 삭제, 검색, 읽기 <- 메서드
// 아이디, 제목, 내용, 등록일, 조회수, 공개/비공개

public class PostService {
	
	public String savePost(String id, String title, String content, String date, int cnt, boolean isFlag) {
		System.out.println("debug >>>> working method completed......");
		return "작성한 글 저장";
	}
	
	public String savePost(PostRequestDTO params) {
		System.out.println("debug >>>> working method completed......");
		return "작성한 글 저장";
	}
	
	public String deletePost(PostRequestDTO params) {
		System.out.println("debug >>>> working method completed......");
		return params.getId()+" 작성 글 삭제";
	}

}
