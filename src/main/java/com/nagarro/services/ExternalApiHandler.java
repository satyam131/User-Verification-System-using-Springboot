package com.nagarro.services;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.entities.User;
import com.nagarro.payloads.Country;
import com.nagarro.payloads.CountryDto;
import com.nagarro.payloads.GenderDto;
import com.nagarro.payloads.Result;
import com.nagarro.repositories.UserRepository;

@Service
public class ExternalApiHandler {

	@Autowired
	ApiService apiService;

	@Autowired
	UserRepository userRepo;

	public User apiProcessing(Result result) {
		String firstName = result.getName().getFirst();
		CompletableFuture<CountryDto> countryFuture = CompletableFuture.supplyAsync(() -> {
			try {
				return this.apiService.callAPI2(firstName);
			} catch (Exception e) {
				return null;
			}
		});

		CompletableFuture<GenderDto> genderFuture = CompletableFuture.supplyAsync(() -> {
			try {
				return this.apiService.callAPI3(firstName);
			} catch (Exception e) {
				return null;
			}
		});

		CompletableFuture.allOf(countryFuture, genderFuture).join();

		CountryDto countryData = countryFuture.join();
		GenderDto genderData = genderFuture.join();
		Country countries[] = countryData.getCountry();
		User user = new User();
		user.setName(result.getName().getTitle() + result.getName().getFirst() + result.getName().getLast());
		user.setGender(result.getGender());
		user.setAge(result.getDob().getAge());
		user.setDateCreated(result.getDob().getDate());
		user.setDateModified(result.getDob().getDate());
		user.setNationality(result.getNat());
		user.setDob(result.getDob().getDate());
		if (genderData.getGender().equals(result.getGender())) { 
			boolean isCountryExist = Arrays.stream(countries)
					.anyMatch(country -> result.getNat().equals(country.getCountry_id()));
			if (isCountryExist == true)
				user.setVerificationStatus("VERIFIED");
			else
				user.setVerificationStatus("TO_BE_VERIFIED");
		} else {
			user.setVerificationStatus("TO_BE_VERIFIED");
		}
		return userRepo.save(user);

	}
}
