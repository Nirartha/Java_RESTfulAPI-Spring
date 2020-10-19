package com.main.Springboot.Model;

import org.springframework.stereotype.Component;

@Component
public class ResponseCheckPwModel {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
