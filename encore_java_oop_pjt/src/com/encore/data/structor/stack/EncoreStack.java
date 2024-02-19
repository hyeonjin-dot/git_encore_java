package com.encore.data.structor.stack;

import java.util.EmptyStackException;

public class EncoreStack {
	
	private int [] stackAry;
	private int top;
	
	public EncoreStack(){
		stackAry = new int[6];
		top = -1;
	}
	
	public void push(int data) {
		stackAry[++top] = data;
	}
	
	public int pop() {
		if (top == -1) // 하나도 없는 경우
			throw new EmptyStackException(); // 에러 발생
		return stackAry[top--];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public int size() {
		return top + 1;
	}
	
	// 마지막 인덱스 값 리턴
	public int peek() {
		if (top == -1) // 하나도 없는 경우
			throw new EmptyStackException(); // 에러 발생
		return stackAry[top];
	}
	
	// 출력
	public void prtStack() {
		System.out.print("[");
		if (top > -1) {
			for (int i = 0 ; i <= top; i++) {
				System.out.print(stackAry[i]);
				if (i != top)
					System.out.print(", ");
			}
		}
		System.out.print("]");
	}
	
	// 강사님이 구현한 거 (위랑 출력 모습이 다름)
	public void prtStack2() {
		for (int i = top; i >= 0 ; --i) 
			System.out.println(stackAry[i]);
	}
}
