package com.moqtar.transport.model;

public class PasswordBean {
	
		private String oldPassword;
		private String newPassword;
		private String conformPassword;
		
		
		public PasswordBean(String oldPassword, String newPassword, String conformPassword) {
			super();
			this.oldPassword = oldPassword;
			this.newPassword = newPassword;
			this.conformPassword = conformPassword;
		}


		public PasswordBean() {
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

	



