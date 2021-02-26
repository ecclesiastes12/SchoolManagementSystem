package org.ecc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;


@Entity
public class Student {

	@Id
	@NotNull
	
	String admissionNumber;
	
	@NotNull
	String firstName;
	
	@NotNull
	String lastName;
	
	@NotNull
	
	String gender;
	
	@NotNull
	String date;
	
	@NotNull
	String gradeLevel;
	
	@NotNull
	String nationality;
	
	//@n
	String mobileNumber;
	
	//@Null
	String email;
	
	//@Null
	String bloodGroup;
	
	//@Null
	String religion;
	
	@NotNull
	String admissionDate;
	
	@NotNull
	String fatherName;
	
	@NotNull
	String fatherNumber;
	
	@NotNull
	String fatherOccupation;
	
	@NotNull
	String motherName;
	
	@NotNull
	String motherNumber;
	
	@NotNull
	String motherOccupation;
	
	public Student() {
		
	}

	public Student(String admissionNumber, String firstName, String lastName, String gender,
			String date, String gradeLevel, String nationality, String mobileNumber, String email, String bloodGroup,
			String religion, String admissionDate, String fatherName, String fatherNumber, String fatherOccupation, String motherName,
			String motherNumber, String motherOccupation) {
		super();
		this.admissionNumber = admissionNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.date = date;
		this.gradeLevel = gradeLevel;
		this.nationality = nationality;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.bloodGroup = bloodGroup;
		this.religion = religion;
		this.admissionDate = admissionDate;
		this.fatherName = fatherName;
		this.fatherNumber = fatherNumber;
		this.fatherOccupation = fatherOccupation;
		this.motherName = motherName;
		this.motherNumber = motherNumber;
		this.motherOccupation = motherOccupation;
	}

	public String getAdmissionNumber() {
		return admissionNumber;
	}

	public void setAdmissionNumber(String admissionNumber) {
		this.admissionNumber = admissionNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getdate() {
		return date;
	}

	public void setdate(String date) {
		this.date = date;
	}

	public String getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(String gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getFatherNumber() {
		return fatherNumber;
	}

	public void setFatherNumber(String fatherNumber) {
		this.fatherNumber = fatherNumber;
	}

	public String getFatherOccupation() {
		return fatherOccupation;
	}

	public void setFatherOccupation(String fatherOccupation) {
		this.fatherOccupation = fatherOccupation;
	}
	
	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMotherNumber() {
		return motherNumber;
	}

	public void setMotherNumber(String motherNumber) {
		this.motherNumber = motherNumber;
	}
	
	public String getMotherOccupation() {
		return motherOccupation;
	}

	public void setMotherOccupation(String motherOccupation) {
		this.motherOccupation = motherOccupation;
	}
	
	
	
	
	
	
	
	
}
