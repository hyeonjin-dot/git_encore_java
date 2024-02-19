package com.encore.business.domin;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class businessDTO {
	private String	name;
	private String	number;
	private String	email;
	private String	fax;
	private	String	hpage;
	private	String	com;
	private	String	emp;
	private String	zip;
	private String	add;

	public businessDTO(businessDTO b) {
		this.name = b.getName();
		this.number = b.getNumber();
		this.email = b.getEmail();
		this.fax = b.getFax();
		this.hpage = b.getHpage();
		this.com = b.getCom();
		this.emp = b.getEmp();
		this.zip = b.getZip();
		this.add = b.getAdd();
	}
	
	public void makeCard(String name, String num, String email, String fax, String hpage, 
			String com, String emp, String zip, String add) {
		this.name = name;
		this.number = num;
		this.email = email;
		this.fax = fax;
		this.hpage = hpage;
		this.com = com;
		this.emp = emp;
		this.zip = zip;
		this.add = add;
	}
	
	public void changeCard(businessDTO b) {
		this.name = b.getName();
		this.number = b.getNumber();
		this.email = b.getEmail();
		this.fax = b.getFax();
		this.hpage = b.getHpage();
		this.com = b.getCom();
		this.emp = b.getEmp();
		this.zip = b.getZip();
		this.add = b.getAdd();
	}
}
