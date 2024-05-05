package com.nagarro.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GenderDto {
	int count;
	String gender;
	String name;
	float probability;
	public int getCount() {
		return count;
	}
	public String getGender() {
		return gender;
	}
	public String getName() {
		return name;
	}
	public float getProbability() {
		return probability;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setProbability(float probability) {
		this.probability = probability;
	}
	
	
}
