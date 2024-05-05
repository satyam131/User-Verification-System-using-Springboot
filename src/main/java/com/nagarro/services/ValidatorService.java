package com.nagarro.services;

import org.springframework.stereotype.Service;

@Service
public class ValidatorService {
	public void validations(String sortType, String sortOrder, String limit, String offset) {
		validateParameter("name", sortType);
		validateParameter("age", sortOrder);
		validateParameter("limit", limit);
		validateParameter("offset", offset);
	}

	public void validateParameter(String parameterType, String inputData) {
		Validator validator = ValidatorFactory.getValidator(parameterType);
		if (validator.validate(inputData) == false) {
			throw new IllegalArgumentException("Pass valid " + parameterType + " parameter to process the data.");
		}
		if (parameterType.equals("size") || parameterType.equals("limit")) {
			int inputValue = Integer.parseInt(inputData);
			if (inputValue < 1 || inputValue > 5)
				throw new IllegalArgumentException(parameterType + " should be between 1 and 5");
		}
	}
}  
