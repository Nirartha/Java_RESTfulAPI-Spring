package com.main.Springboot.Model;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Table;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

//@Entity
//@Table(name = "memberaccount")
public class MemberAccountJPA {
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

//	@Column(name = "Account")
	private String account;
	
//	@Column(name = "Email")
	private String email;
	
//	@Column(name = "Cellphone")
	private String cellphone;
	
//	@Column(name = "Password")
	private String password;
	
//	@Column(name = "Address")
	private String address;
	

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
