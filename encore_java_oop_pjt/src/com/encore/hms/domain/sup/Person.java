package com.encore.hms.domain.sup;

import java.io.Serializable;

public class Person implements Serializable {
    //공통 요소
    // 접근제어자가 private 이므로 자식이지만 접근을 허용하지 않음
    // but, protected로 열어주면 자식의 접근을 허용함.
    private String name;
    private int age;
    private String address;
    public Person() {
        super(); //부모 지칭
    
    }
    public Person(String name, int age, String address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String personInfo() {
        return "name=" + name + ", age=" + age + ", address=" + address ;
    }
    
    
}