package com.moqtar.transport.dao.entity;

public class UserDetailes {
	private String fullName;
	private String middleName;
	private String lastName;
	private String userName;
	private String pswd;
	private String email;
	private String address;
	private String mobNumber;
	

	public UserDetailes(String fullName,String middleName, String lastName, String userName, String pswd, String email,  String address, String mobNumber) {
		this.fullName = fullName;
		this.middleName=middleName;
		this.lastName = lastName;
		this.userName = userName;
		this.pswd = pswd;
		this.email = email;
		this.address = address;
		this.mobNumber = mobNumber;
	}


	public UserDetailes() {
	}
	

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getMiddleName() {
		return this.fullName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return this.lastName;
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

	public String getPswd() {
		return this.pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobNumber() {
		return this.mobNumber;
	}

	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}


}

	
