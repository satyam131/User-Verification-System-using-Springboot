package com.nagarro.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CountryDto {
 int count;
 String name;
 Country country[];
public int getCount() {
	return count;
}
public String getName() {
	return name;
}
public Country[] getCountry() {
	return country;
}
public void setCount(int count) {
	this.count = count;
}
public void setName(String name) {
	this.name = name;
}
public void setCountry(Country[] country) {
	this.country = country;
}
 
 
}
