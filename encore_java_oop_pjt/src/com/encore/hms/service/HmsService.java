package com.encore.hms.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.encore.hms.domain.*;
import com.encore.hms.domain.sup.Person;
import com.encore.hms.util.HmsType;

/*
 * business logic 가지고 있는 클래스
 * 1. 배열 list 관리
 * 2. 생성된 배열 학생, 강사, 직원 객체를 담을 것
 * 3. 배열의 인덱스를 이용하여 찾기, 수정, 삭제 등의 기능을 수행
 */

public class HmsService {
	private Person [] perAry;
	private int idx = 0;
	
	public HmsService() {}
	
	public HmsService(int size) {
		perAry = new Person[size];
	}
	
	public String makePerson(HmsType i, String n, int a, String add, String com) {
		Person obj = null;
		switch (i) {
			case STU:
				obj = new StudentDTO(n, a, add, com);
				setAry(obj);
				//perAry[idx++] = new StudentDTO(n, a, add, com);
				return ("학생 객체를 생성하고 배열에 담았습니다.");
			case TEA:
				obj = new TeacherDTO(n, a, add, com);
				setAry(obj);
				//perAry[idx++] = new TeacherDTO(n, a, add, com);
				return ("강사 객체를 생성하고 배열에 담았습니다.");
			case EMP:
				obj = new EmployeeDTO(n, a, add, com);
				setAry(obj);
				//perAry[idx++] = new EmployeeDTO(n, a, add, com);
				return ("직원 객체를 생성하고 배열에 담았습니다.");
		}
		return null;
	}
	
	public void setAry(Person per) {
		perAry[idx++] = per;
	}
	
	public Person[] getAry() {
		return perAry;
	}
	
	public int getIdx() {
		return idx;
	}
	
	//person 객체를 리턴 -> view 파일에서 출력
//	public void searchPerson(String name) {
//
//		Person [] per = perAry;
//		int f = 0;
//		
//		for (int i = 0; i < 10 ; i++) {
//			if(per[i] != null && per[i].getName().equals(name)) {
//				System.out.println(per[i].personInfo());
//				f++;
//				break;
//			}
//		}
//		
//		if (f == 0)
//			System.out.println("정보가 존재하지 않습니다.");
//	}
	
	public Person searchPerson(String name) {
		for (int i = 0; i < 10 ; i++) {
			if(perAry[i] != null && perAry[i].getName().equals(name))
				return perAry[i];
		}
		return null;
	}
	
	public void updatePerson(String name, String comm) {
		Person [] per = perAry;
		
		int f = 0;

		for (int i = 0; i < 10 ; i++) {
			if(per[i] != null && per[i].getName().equals(name)) {
				if (per[i] instanceof StudentDTO) { 
					((StudentDTO)per[i]).setStuID(comm);
				}
				if (per[i] instanceof TeacherDTO) { 
					((TeacherDTO)per[i]).setSubject(comm);
				}
				if (per[i] instanceof EmployeeDTO) { 
					((EmployeeDTO)per[i]).setDept(comm);
				}
				f++;
				System.out.println("정보를 수정하였습니다.");
				break;
			}
		}
		
		if (f == 0)
			System.out.println("정보가 존재하지 않습니다.");
	}
	
	public void removePerson(String name) {
		Person [] per = perAry;
		
		int f = 0;
		
		for (int i = 0; i < 10 ; i++) {
			if(per[i] != null && per[i].getName().equals(name)) {
				for (int j = i; j < 9 ; j++)
					per[j] = per[j+1];
				idx--;
				per[idx] = null;
				f++;
				System.out.println("정보가 삭제되었습니다.");
				break;
			}
		}

		if (f == 0)
			System.out.println("정보가 존재하지 않습니다.");
	}
	
	public void saveToFile() {
		FileOutputStream fis = null;
		ObjectOutputStream oos = null;
		
		try {
			fis = new FileOutputStream("c:/file/hms.txt"); // 
			oos = new ObjectOutputStream(fis);
			
			oos.writeObject(perAry);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (oos != null)
					oos.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	
	public void loadToFile() {
		FileInputStream fis = null;
		ObjectInputStream oos = null;
		
		try {
			fis = new FileInputStream("c:/file/hms.txt"); 
			oos = new ObjectInputStream(fis);
			
			perAry = (Person []) oos.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (oos != null)
					oos.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
