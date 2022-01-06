package com.moqtar.transport.dao.entity;

public class Password {
	private String oldPassword;
	private String newPassword;
	private String conformPassword;
	
	public Password(String oldPassword, String newPassword, String conformPassword) {
		super();
		this.oldPassword = oldPassword;
		this.newPassword = newPassword;
		this.conformPassword = conformPassword;
		
	}

	public Password() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConformPassword() {
		return conformPassword;
	}

	public void setConformPassword(String conformPassword) {
		this.conformPassword = conformPassword;
	}

	
	}
	
