package com.encore.compare;

import java.util.Comparator;

/*
 * Comparable [특징]
 * 1. 자기 자신과 매개변수를 비교
 * 2. 구현 메서드는 compareTo()
 * 
 * Comparator [특징]
 * 1. 인자로 전달된 두 객체의 기준값을 가지고 비교하는 것
 * 2. 구현 메서드는 compare()
 */

public class Teacher implements Comparator<Teacher>{
	public int age;
	public int classNumber;
	
	public Teacher(int age, int classNumber) {
		super();
		this.age = age;
		this.classNumber = classNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	
	@Override
	public String toString() {
		return "Teacher [age=" + age + ", classNumber=" + classNumber + "]";
	}
	
	//implements Comparable<Teacher>
//	@Override
//	public int compareTo(Teacher o) {
//		if (this.age > o.getAge())
//			return 1;
//		else if (this.age == o.getAge())
//			return 0;
//		else
//			return -1;
//	}
	
	//implements Comparator<Teacher>
	@Override
	public int compare(Teacher o1, Teacher o2) {
		if (o1.getAge() > o2.getAge())
			return 1;
		else if (o1.getAge() == o2.getAge())
			return 0;
		else
			return -1;
	}
}
