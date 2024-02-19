package com.encore.mvc.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class DepartmentDTO {
	private String dept_id;
	private String dept_name;
	private String loc_id;
	
}
