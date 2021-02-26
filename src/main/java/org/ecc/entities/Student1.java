package org.ecc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class Student1 {
	@Id
	@NotNull
	@Column(name="studentid",unique=true)
	String studentid;
	@NotNull
	@Column(name="firstname")
	String firstname;
	@NotNull
	@Column(name="lastname")
	String lastname;
	@NotNull
	@Column(name="othername")
	String othername;
	@NotNull
	@Column(name="dob")
	String dob;
	
	public Student1() {
		
	}

	public Student1(String studentid, String firstname, String lastname, String othername, String dob) {
		super();
		this.studentid = studentid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.othername = othername;
		this.dob = dob;
	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getOthername() {
		return othername;
	}

	public void setOthername(String othername) {
		this.othername = othername;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	

	
	
	
	
}
