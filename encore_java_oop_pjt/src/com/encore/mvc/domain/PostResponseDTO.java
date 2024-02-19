package com.encore.mvc.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class PostResponseDTO {

	private int		idx;
	private String	title;
	private String	content;
	private String	writer;
	
	public PostResponseDTO() {}
	
	@Override
	public String toString() {
		return "PostResponseDTO [idx=" + idx + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
}
