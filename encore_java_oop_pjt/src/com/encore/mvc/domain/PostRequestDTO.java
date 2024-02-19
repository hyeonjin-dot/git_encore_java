package com.encore.mvc.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PostRequestDTO {

	private String title;
	private String content;
	private String writer;
	
	public PostRequestDTO() {}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "PostRequestDTO [title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
}
