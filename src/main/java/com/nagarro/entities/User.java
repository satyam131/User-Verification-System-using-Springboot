package com.nagarro.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int userId;
	String name;
	int age;
	String gender;
	String dob;
	String nationality;
	String verificationStatus;
	String dateCreated;
	String dateModified;
	public int getUserId() {
		return userId;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getDob() {
		return dob;
	}
	public String getNationality() {
		return nationality;
	}
	public String getVerificationStatus() {
		return verificationStatus;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public String getDateModified() {
		return dateModified;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public void setVerificationStatus(String verificationStatus) {
		this.verificationStatus = verificationStatus;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public void setDateModified(String dateModified) {
		this.dateModified = dateModified;
	}
	
	
}
