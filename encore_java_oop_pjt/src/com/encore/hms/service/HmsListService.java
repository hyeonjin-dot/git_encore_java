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
import java.util.ArrayList;
import java.util.List;

import com.encore.hms.domain.*;
import com.encore.hms.domain.sup.Person;
import com.encore.hms.util.HmsType;

/*
 * business logic 가지고 있는 클래스
 * 1. collection list 관리
 * 2. 생성된 collection 학생, 강사, 직원 객체를 담을 것
 * 3. 배열의 인덱스를 이용하여 찾기, 수정, 삭제 등의 기능을 수행
 */

public class HmsListService {
	
	private List<Person> lst;
	
	public HmsListService() {}
	
	public HmsListService(int size) {
		lst = new ArrayList<>();
	}
	
	public String makePerson(HmsType i, String n, int a, String add, String com) {
		Person obj = null;
		switch (i) {
			case STU:
				obj = new StudentDTO(n, a, add, com);
				return ("학생 객체를 생성하고 배열에 담았습니다.");
			case TEA:
				obj = new TeacherDTO(n, a, add, com);
				return ("강사 객체를 생성하고 배열에 담았습니다.");
			case EMP:
				obj = new EmployeeDTO(n, a, add, com);
				return ("직원 객체를 생성하고 배열에 담았습니다.");
		}
		setAry(obj);
		return null;
	}
	
	public void setAry(Person per) {
		lst.add(per);
	}
	
	public List<Person> getAry() {
		return lst;
	}
	
	public int getIdx() {
		return lst.size();
	}
	
	//찾기
	public Person searchPerson(String name) {
		for (int i = 0; i < lst.size(); i++) {
			Person per = lst.get(i);
			if (per.getName().equals(name))
				return per;
		}
		return null;
	}
	
	public void updatePerson(String name, String comm) {
		List<Person> per = lst;
		
		int f = 0;

		for (int i = 0; i < per.size() ; i++) {
			if(per.get(i).getName().equals(name)) {
				if (per.get(i) instanceof StudentDTO) { 
					((StudentDTO)per.get(i)).setStuID(comm);
				}
				if (per.get(i) instanceof TeacherDTO) { 
					((TeacherDTO)per.get(i)).setSubject(comm);
				}
				if (per.get(i) instanceof EmployeeDTO) { 
					((EmployeeDTO)per.get(i)).setDept(comm);
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
		for (int i = 0; i < lst.size() ; i++) {
			Person per = lst.get(i);
			if(per.getName().equals(name)) {
				lst.remove(i);
				System.out.println("정보가 삭제되었습니다.");
				return ;
			}
		}
		System.out.println("정보가 존재하지 않습니다.");
		return ;
	}
	
	public void saveToFile() {
		FileOutputStream fis = null;
		ObjectOutputStream oos = null;
		
		try {
			fis = new FileOutputStream("c:/file/hms.txt"); // 
			oos = new ObjectOutputStream(fis);
			
			oos.writeObject(lst);
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
			
			lst = (List<Person>) oos.readObject();
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
