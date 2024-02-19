package com.encore.hms.domain;
import java.io.Serializable;

import com.encore.hms.domain.sup.Person;
// 상속
public class StudentDTO extends Person implements Serializable{
    //private String name;
    //private int age;
    //private String address;
    private String stuID;
    public StudentDTO() {
        
    }
    public StudentDTO(String name, int age, String address, String stuID) {
        
        /*
         * super.setName(name); super.setAge(age); super.setAddress(address);
         */     
        super(name,age,address);
        this.setStuID(stuID);
    }
    //public String getName() {
    //  return name;
    //}
    //public void setName(String name) {
    //  this.name = name;
    //}
    //public int getAge() {
    //  return age;
    //}
    //public void setAge(int age) {
    //  if(age<=0) {
    //      System.out.println("거짓말!");
    //  }else {
    //      this.age = age;
    //  }
    //}
    //public String getAddress() {
    //  return address;
    //}
    //public void setAddress(String address) {
    //  this.address = address;
    //}
    public String getStuID() {
        return stuID;
    }
    public void setStuID(String stuID) {
        this.stuID = stuID;
    }
    public String studentInfo() {
        //return "name=" + super.getName() + ", age=" + super.getAge() + ", address=" + super.getAddress() + ", stuID=" + this.getStuID() ;
        return super.personInfo() + ", stuId="+this.getStuID();
    }
    
    // overriding (상속관계에서 부모의 메서드를 자식에서 재정의하는 것)
    // 접근지정자 반환타입 메서드명 매개변수 타입과 갯수가 일치
    @Override
    public String personInfo() {
        return super.personInfo() + ", stuId="+this.getStuID();
    }
    
    
}