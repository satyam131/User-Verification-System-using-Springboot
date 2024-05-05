package com.nagarro.services.Impl;

import com.nagarro.services.Validator;

public class NumericValidator implements Validator {
	private static final NumericValidator instance = new NumericValidator();

	private NumericValidator() {
	}

	public static NumericValidator getInstance() {
		return instance;
	}

	public boolean validate(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
