package com.main.Springboot.ServiceTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.main.Springboot.Model.ResponseCheckPwModel;
import com.main.Springboot.Service.MemberService;
import com.main.Springboot.Service.MemberService.ResponseCheckMessageType;

@SpringBootTest
public class MemberServiceTest {
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	ResponseCheckPwModel resCheckPwModel;
	
	@Test
	void contextLoads() throws Exception {
		System.out.println("MemberServiceTest Test Start...");
	}
	
	@Test
	public void memberServiceTest_NoError() {
		String testPassword = "a1234567bx";
		
		resCheckPwModel.setMessage(ResponseCheckMessageType.NoError.toString());
		String expected = resCheckPwModel.getMessage();
		String actual = (String) memberService.checkPassword(testPassword).getMessage();
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void memberServiceTest_LengthError1_length4() {
		String testPassword = "a123";
		
		resCheckPwModel.setMessage(ResponseCheckMessageType.LengthError.toString());
		String expected = resCheckPwModel.getMessage();
		String actual = (String) memberService.checkPassword(testPassword).getMessage();
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void memberServiceTest_LengthError2_length13() {
		String testPassword = "a123123412341";
		
		resCheckPwModel.setMessage(ResponseCheckMessageType.LengthError.toString());
		String expected = resCheckPwModel.getMessage();
		String actual = (String) memberService.checkPassword(testPassword).getMessage();
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void memberServiceTest_LowercaseError1_digitalOnly() {
		String testPassword = "0123123412341";
		
		resCheckPwModel.setMessage(ResponseCheckMessageType.LowercaseError.toString());
		String expected = resCheckPwModel.getMessage();
		String actual = (String) memberService.checkPassword(testPassword).getMessage();
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void memberServiceTest_LowercaseError2_uppercaseOnly() {
		String testPassword = "QWERTYUIO123";
		
		resCheckPwModel.setMessage(ResponseCheckMessageType.LowercaseError.toString());
		String expected = resCheckPwModel.getMessage();
		String actual = (String) memberService.checkPassword(testPassword).getMessage();
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void memberServiceTest_SequenceError1_digital() {
		String testPassword = "a123456788";
		
		resCheckPwModel.setMessage(ResponseCheckMessageType.SequenceError.toString());
		String expected = resCheckPwModel.getMessage();
		String actual = (String) memberService.checkPassword(testPassword).getMessage();
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void memberServiceTest_SequenceError1_letter() {
		String testPassword = "1234bb56788";
		
		resCheckPwModel.setMessage(ResponseCheckMessageType.SequenceError.toString());
		String expected = resCheckPwModel.getMessage();
		String actual = (String) memberService.checkPassword(testPassword).getMessage();
		Assertions.assertEquals(expected, actual);
	}
	
}
