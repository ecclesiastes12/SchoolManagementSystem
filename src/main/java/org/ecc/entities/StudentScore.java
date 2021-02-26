package org.ecc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class StudentScore {

	@Id
	@GeneratedValue()
	Long scoreId;
	String studentId;
	String coreSubject1;
	String coreSubject2;
	String coreSubject3;
	String coreSubject4;
	String electiveSubject1;
	String electiveSubject2;
	String electiveSubject3;
	String electiveSubject4;
	
	public StudentScore() {
		
	}

	public StudentScore(Long scoreId, String studentId, String coreSubject1, String coreSubject2, String coreSubject3,
			String coreSubject4, String electiveSubject1, String electiveSubject2, String electiveSubject3,
			String electiveSubject4) {
		
		this.scoreId = scoreId;
		this.studentId = studentId;
		this.coreSubject1 = coreSubject1;
		this.coreSubject2 = coreSubject2;
		this.coreSubject3 = coreSubject3;
		this.coreSubject4 = coreSubject4;
		this.electiveSubject1 = electiveSubject1;
		this.electiveSubject2 = electiveSubject2;
		this.electiveSubject3 = electiveSubject3;
		this.electiveSubject4 = electiveSubject4;
	}

	public Long getScoreId() {
		return scoreId;
	}

	public void setScoreId(Long scoreId) {
		this.scoreId = scoreId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getCoreSubject1() {
		return coreSubject1;
	}

	public void setCoreSubject1(String coreSubject1) {
		this.coreSubject1 = coreSubject1;
	}

	public String getCoreSubject2() {
		return coreSubject2;
	}

	public void setCoreSubject2(String coreSubject2) {
		this.coreSubject2 = coreSubject2;
	}

	public String getCoreSubject3() {
		return coreSubject3;
	}

	public void setCoreSubject3(String coreSubject3) {
		this.coreSubject3 = coreSubject3;
	}

	public String getCoreSubject4() {
		return coreSubject4;
	}

	public void setCoreSubject4(String coreSubject4) {
		this.coreSubject4 = coreSubject4;
	}

	public String getElectiveSubject1() {
		return electiveSubject1;
	}

	public void setElectiveSubject1(String electiveSubject1) {
		this.electiveSubject1 = electiveSubject1;
	}

	public String getElectiveSubject2() {
		return electiveSubject2;
	}

	public void setElectiveSubject2(String electiveSubject2) {
		this.electiveSubject2 = electiveSubject2;
	}

	public String getElectiveSubject3() {
		return electiveSubject3;
	}

	public void setElectiveSubject3(String electiveSubject3) {
		this.electiveSubject3 = electiveSubject3;
	}

	public String getElectiveSubject4() {
		return electiveSubject4;
	}

	public void setElectiveSubject4(String electiveSubject4) {
		this.electiveSubject4 = electiveSubject4;
	}
	
	
	
}
