package com.nagarro.services;

import com.nagarro.services.Impl.EnglishAlphabetsValidator;
import com.nagarro.services.Impl.NumericValidator;

public class ValidatorFactory {
	public static Validator getValidator(String parameterType) {
		if (parameterType.equals("limit") || parameterType.equals("offset") || parameterType.equals("size")) {
			return NumericValidator.getInstance();
		} else if (parameterType.equals("name") || parameterType.equals("age")) {
			return EnglishAlphabetsValidator.getInstance();
		}
		return null;
	}
}
