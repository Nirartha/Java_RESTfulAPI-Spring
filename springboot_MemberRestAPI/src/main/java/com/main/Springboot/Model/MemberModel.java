package com.main.Springboot.Model;

import org.springframework.stereotype.Component;

@Component
public class MemberModel {
	
	private String Account;
	private String Password;
	
	public String getAccount() {
		return Account;
	}
	
	public void setAccount(String mAccount) {
		this.Account = mAccount;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String mPassword) {
		this.Password = mPassword;
	}
	
}
