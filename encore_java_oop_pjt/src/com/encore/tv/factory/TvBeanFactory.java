package com.encore.tv.factory;

import com.encore.tv.domain.LgTV;
import com.encore.tv.domain.SamsungTV;
import com.encore.tv.util.TV;

/*
 * Singleton pattern : 인스턴스의 갯수를 하나로 유지하는 방법
 * 구현 방법)
 * 1. 생성자의 접근 지정자를 private 
 * 2. getInstance() 정의 후 자기 자신의 생성된 객체를 반환하는 구현 -> 외부에서 객체 생성 불가
 */
public class TvBeanFactory {//Bean : 프레임워크가 인스턴스를 생성해서 관리하는 것
	private TV [] ary;
	private static TvBeanFactory instance;

	private TvBeanFactory() {
		ary = new TV [2];
		ary[0] = new SamsungTV();
		ary[1] = new LgTV();
	}
	
	public static TvBeanFactory getInsatnce() {
		if (instance == null) {
			instance = new TvBeanFactory();
		}
		return instance;
	}
	
	public TV getBean(String brandName) {
		return (brandName.equals("samsung")) ? ary[0] : ary[1];
	}
}

