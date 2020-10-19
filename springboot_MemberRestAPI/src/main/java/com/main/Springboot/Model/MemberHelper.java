package com.main.Springboot.Model;

import org.springframework.stereotype.Component;

@Component
public class MemberHelper {
	/**
	 * The password must be between 5 and 12 characters in length.
	 * @param password
	 * @return true -> the length is between 5 and 12
	 */
	public boolean isPwLength5to12Characters(String password) {
		//return password.matches("^(?=[\\s\\S]{5,12}$)[a-zA-Z0-9]*[^$%^&*;:,<>?()\\\"']*$");
		return password.length() >= 5 && password.length() <= 12;
	}
	
	/**
	 * The password must consist of a lowercase letter at least.
	 * @param password
	 * @return true -> the password consist of a lowercase letter at least.
	 */
	public boolean isContainLowercaseLetters(String password) {
		return password.matches(".*[a-z].*");
	}
	
	/**
	 * The password must consist of a numerical digit at least.
	 * @param password
	 * @return true -> the password consist of a numerical digit at least.
	 */
	public boolean isContainNumericalDigits(String password) {
		return password.matches(".*[0-9].*");
	}
	
	/**
	 * The password must not contain any sequence of characters immediately followed by the same sequence.
	 * @param password
	 * @return true -> the password contain a sequence of characters immediately.
	 */
	public boolean isContainSameSequence(String password) {
		return password.toLowerCase().matches("^.*(.)\\1.*$");
	}
	
}
