package com.nagarro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nagarro.payloads.CountryDto;
import com.nagarro.payloads.GenderDto;
import com.nagarro.payloads.UserDto;

@Service
public class ApiService {
	@Autowired
	private WebClient webClientAPI1;
	@Autowired
	private WebClient webClientAPI2;
	@Autowired
	private WebClient webClientAPI3;

	public UserDto callAPI1(int results) {
		String response = webClientAPI1.get().uri("https://randomuser.me/api/?results="+results).retrieve().bodyToMono(String.class)
				.block(); 
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.readValue(response, UserDto.class);
		} catch (Exception e) {
			// Handle exception if JSON parsing fails
			e.printStackTrace();
			return null;
		}
	}
             
	public CountryDto callAPI2(String name) {
		String response= webClientAPI2.get().uri("https://api.nationalize.io/?name=" + name).retrieve().bodyToMono(String.class)
				.block(); 
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.readValue(response, CountryDto.class);
		} catch (Exception e) {
			// Handle exception if JSON parsing fails
			e.printStackTrace();
			return null;
		}
	}

	public GenderDto callAPI3(String name) {
		String response= webClientAPI3.get().uri("https://api.genderize.io/?name=" + name).retrieve().bodyToMono(String.class)
				.block(); 
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.readValue(response, GenderDto.class);
		} catch (Exception e) {
			// Handle exception if JSON parsing fails
			e.printStackTrace();
			return null;
		}
	}
}
