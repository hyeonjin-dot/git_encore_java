package com.encore.test;

/*
 * xxxxVO.java , xxxxDTO.java , xxxxxEntitiy.java
 * value object, data transform object
 * -- 업무로직이 없고 데이터만 관리하는 클래스로 
 * 변수 및 Setter, Getter 메서드만 포함 
 */

public class StudentVO {
	/* 변수 (Variable)
	 * 구문형식 : 접근지정자 변수타입 변수명 ;
	 * 접근지정자 (public, private)
	 * 변수타입 (기본타입, 참조타입)
	 * 변수명 (소문자 시작)
	 * 선언 위치가 있음 (전역변수, 지역변수)
	 * - 클래스 블럭 내에 선언하는 변수 -> 전역 변수 
	 * (클래스 내에서 접근 가능한 범위를 가짐)
	 * - 메서드 내에 선언하는 변수 -> 지역 변수
	 */
	
	// 전역 변수
	private String	name ; // 외부에서의 접근 불허
	private int		age ;
	private double	height ;
	private boolean	isMarriage ;
	
	
	/*
	 * 생성자
	 * 접근지정자 클래스이름([매개변수]){
	 * }
	 */
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isMarriage() {
		return isMarriage;
	}
	public void setMarriage(boolean isMarriage) {
		this.isMarriage = isMarriage;
	}
	
}
