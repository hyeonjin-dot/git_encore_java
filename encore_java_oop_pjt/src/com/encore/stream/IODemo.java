package com.encore.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IODemo {
	
	public String inputStr() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("input msg : ");
		String rtn = reader.readLine();
		return rtn;
	}
	
	public int inputInt() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("input msg : ");
		int rtn = 0;
		try {
			rtn = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rtn;
	}
	
	public void first(int flag) throws EncoreException {
		System.out.println("first start");
		try {
			second(flag);
		} finally {
			System.out.println("first fin");
		}
	}
	
	public void second(int flag) throws EncoreException {
		System.out.println("second start");
		try {
			third(flag);
		} finally {
			System.out.println("second fin");
		}
	}
	
	public void third(int flag) throws EncoreException {
		System.out.println("third start");
		try {
			if (flag == 0) {
				throw new EncoreException("사용자 정의 예외 발생");
			}
		}finally {
			System.out.println("third fin");
		}
	}
	
	//파일 출력 기능
	public boolean outputFile() {
		boolean flag = false;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input : ");
		String msg = scan.next();
		
		File file = new File("c:/file/testWriter.txt");
		FileWriter writer = null;
		BufferedWriter bw = null;
		
		try {
			 writer = new FileWriter(file);
			 bw = new BufferedWriter(writer);
			 bw.write(msg);
			 flag = true;
		} catch (IOException e) {
			e.printStackTrace(); 
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
}
