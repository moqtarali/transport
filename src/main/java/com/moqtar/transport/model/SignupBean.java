package com.moqtar.transport.model;

public class SignupBean {
	private String fullName;
	private String middleName;
	private String lastName;
	private String userName;
	private String password;
	private String email;
	private String address;
	private String mobileNumber;
	
	

	public  String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public  String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return  mobileNumber;
	}

	public void setMobileNumber(String  mobileNumber) {
		this. mobileNumber =  mobileNumber;
	}

	@Override
	public String toString() {
		return "{" +
			" fullName='" + getFullName() + "'" +
			", lastName='" + getLastName() + "'" +
			", userName='" + getUserName() + "'" +
			", password='" + getPassword() + "'" +
			", email='" + getEmail() + "'" +
			", address='" + getAddress() + "'" +
			", mobileNumber='" + getMobileNumber() + "'" +
			"}";
	}

}
