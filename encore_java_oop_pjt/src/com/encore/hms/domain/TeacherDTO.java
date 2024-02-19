package com.encore.hms.domain;
import java.io.Serializable;

import com.encore.hms.domain.sup.Person;
public class TeacherDTO extends Person implements Serializable {
    
    
    private String subject;
    
    public TeacherDTO() {
        super();
        // TODO Auto-generated constructor stub
    }
    public TeacherDTO(String name, int age, String address, String subject) {
        super(name,age,address);
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String teacherInfo() {
        return super.personInfo() +  ", subject=" + this.getSubject();
    }
    @Override
    public String personInfo() {
        return super.personInfo() +  ", subject=" + this.getSubject();
    }
}
