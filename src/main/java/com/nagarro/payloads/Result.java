package com.nagarro.payloads;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
    private String gender;
    private Name name;
    private String nat;
    private String email;
    private String phone;
    private String city;
    private String state;
    private String postcode;
    private Register registered;
    DOB dob;
	public String getGender() {
		return gender;
	}
	public Name getName() {
		return name;
	}
	public String getNat() {
		return nat;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getPostcode() {
		return postcode;
	}
	public Register getRegistered() {
		return registered;
	}
	public DOB getDob() {
		return dob;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public void setNat(String nat) {
		this.nat = nat;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public void setRegistered(Register registered) {
		this.registered = registered;
	}
	public void setDob(DOB dob) {
		this.dob = dob;
	}
    
    
}
