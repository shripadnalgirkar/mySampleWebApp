package com.biz;

public class Validator {

	public Validator() {
		// TODO Auto-generated constructor stub
	}

	public boolean validateAge(int age) {
		boolean isAgeValid = false;
		if(age>18) {
			isAgeValid = true;
		}
		
		return isAgeValid;
	}
}
