package com.encore.hms.domain;
import java.io.Serializable;

import com.encore.hms.domain.sup.Person;
public class EmployeeDTO extends Person  implements Serializable{
    
    
    private String dept;
    
    public EmployeeDTO() {
        super();
    }
    public EmployeeDTO(String name, int age, String address, String dept) {
        super(name,age,address);
        this.dept = dept;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    
    public String employeeInfo() {
        return super.personInfo() +  ", dept=" + this.getDept();
    }
    @Override
    public String personInfo() {
        return super.personInfo() +  ", dept=" + this.getDept();
    }
    
    
}