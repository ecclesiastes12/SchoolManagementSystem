package org.ecc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Subject {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long subjectId;
	
	@NotNull
	@Column(unique=true)
	private String coursecode;
	
	@NotNull
	private String subjectname;
	
	public Subject() {
		
	}

	public Subject(Long subjectId, String coursecode, String subjectname) {
		
		this.subjectId = subjectId;
		this.coursecode = coursecode;
		this.subjectname = subjectname;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public String getCoursecode() {
		return coursecode;
	}

	public void setCoursecode(String coursecode) {
		this.coursecode = coursecode;
	}

	public String getSubjectname() {
		return subjectname;
	}

	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}

	
	
}
