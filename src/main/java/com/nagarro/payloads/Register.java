package com.nagarro.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Register {
	String date;
	int age;
	public String getDate() {
		return date;
	}
	public int getAge() {
		return age;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setAge(int age) {
		this.age = age;
	} 
	
	
}
