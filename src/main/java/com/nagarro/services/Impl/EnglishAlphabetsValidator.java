package com.nagarro.services.Impl;

import com.nagarro.services.Validator;

public class EnglishAlphabetsValidator implements Validator {
	private static final EnglishAlphabetsValidator instance = new EnglishAlphabetsValidator();

	private EnglishAlphabetsValidator() {
	}

	public static EnglishAlphabetsValidator getInstance() {
		return instance;
	}

	public boolean validate(String input) {
		return input.matches("^[a-zA-Z]+$");
	}
}
