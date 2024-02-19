package com.encore.staticdemo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class StaticDemo {
	
	// 전역변수
	// 인스턴스 소유
	private String			name;
	// 클래스 소유
	public static String	staticMsg;
	
	public static final String URL = "나는 상수";
	
	public void nonStatic() {
		System.out.println("나는 인스턴스 소유의 메서드 입니다.");
	}
	
	public static void staticMethod() {
		System.out.println("나는 클래스 소유의 메서드 입니다.");
	}
	
}









