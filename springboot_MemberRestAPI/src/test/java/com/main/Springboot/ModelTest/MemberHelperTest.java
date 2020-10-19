package com.main.Springboot.ModelTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.main.Springboot.Model.MemberHelper;

@SpringBootTest
public class MemberHelperTest {
	
	@Autowired
	private MemberHelper mHelper;
	
	@Test
	void contextLoads() throws Exception {
		System.out.println("MemberHelper Test Start...");
	}
	
	@Test
	public void isPwLength5to12CharactersTest_Length4() {
		String testPassword = "1234";
		boolean expected = false;
		boolean actual = mHelper.isPwLength5to12Characters(testPassword);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void isPwLength5to12CharactersTest_Length12() {
		String testPassword = "123412341234";
		boolean expected = true;
		boolean actual = mHelper.isPwLength5to12Characters(testPassword);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void isPwLength5to12CharactersTest_Length16() {
		String testPassword = "1234123412341234";
		boolean expected = false;
		boolean actual = mHelper.isPwLength5to12Characters(testPassword);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void isContainLowercaseLetters_No() {
		String testPassword = "12341234SHKAJ12";
		boolean expected = false;
		boolean actual = mHelper.isContainLowercaseLetters(testPassword);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void isContainLowercaseLetters_YesCase1() {
		String testPassword = "1234scvf412341234";
		boolean expected = true;
		boolean actual = mHelper.isContainLowercaseLetters(testPassword);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void isContainLowercaseLetters_YesCase2() {
		String testPassword = "1234412341234a";
		boolean expected = true;
		boolean actual = mHelper.isContainLowercaseLetters(testPassword);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void isContainNumericalDigits_No() {
		String testPassword = "ABCDEFGHIJK";
		boolean expected = false;
		boolean actual = mHelper.isContainNumericalDigits(testPassword);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void isContainNumericalDigits_YesCase1() {
		String testPassword = "1234scvf412341234";
		boolean expected = true;
		boolean actual = mHelper.isContainNumericalDigits(testPassword);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void isContainNumericalDigits_YesCase2() {
		String testPassword = "1234412341234a";
		boolean expected = true;
		boolean actual = mHelper.isContainNumericalDigits(testPassword);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void isContainSameSequence_NoCase1() {
		String testPassword = "1213456789";
		boolean expected = false;
		boolean actual = mHelper.isContainSameSequence(testPassword);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void isContainSameSequence_NoCase2() {
		String testPassword = "ABcDEFGhIJK";
		boolean expected = false;
		boolean actual = mHelper.isContainSameSequence(testPassword);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void isContainSameSequence_YesCase1() {
		String testPassword = "aawerwrhsf";
		boolean expected = true;
		boolean actual = mHelper.isContainSameSequence(testPassword);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void isContainSameSequence_YesCase2() {
		String testPassword = "12345dd246";
		boolean expected = true;
		boolean actual = mHelper.isContainSameSequence(testPassword);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void isContainSameSequence_YesCase3() {
		String testPassword = "55aftymrnx";
		boolean expected = true;
		boolean actual = mHelper.isContainSameSequence(testPassword);
		Assertions.assertEquals(expected, actual);
	}

	@Test
	public void isContainSameSequence_YesCase4() {
		String testPassword = "aftymrnx00";
		boolean expected = true;
		boolean actual = mHelper.isContainSameSequence(testPassword);
		Assertions.assertEquals(expected, actual);
	}
	
}
