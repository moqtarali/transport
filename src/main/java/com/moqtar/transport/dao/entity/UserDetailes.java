package com.moqtar.transport.dao.entity;

public class UserDetailes {
	private String FullName;
	private String Lastname;
	private String UserName;
	private String Pswd;
	private String Email;
	private String DOfB;
	private String Address;
	private String MobNumber;
	
	public UserDetailes(){
			}
	
	 public UserDetailes(String FullName,String Lastname,String UserName,String Pswd,String Email,String DOfB, String Address,String MobNumber)
	    {
	        this.FullName =FullName;
	        this.Lastname=Lastname;
	        this.UserName=UserName;
	        this.Pswd=Pswd;
	        this.Email= Email;
	        this.DOfB= DOfB;
	        this.Address= Address;
	        this.MobNumber=MobNumber;
	     }
	 public  String getFullname() {
			return this.FullName;
		}

		public void setFullname(String FullName) {
			this. FullName =  FullName;
		}
		 public  String getLastname() {
				return this.Lastname;
			}

			public void setLastname(String Lastname) {
				this. Lastname = Lastname;
			}
			public String getuserName() {
				return this.UserName;
			}

			public void setUserName(String UserName) {
				this.UserName =UserName;
			}
			public String getPswd() {
				return this.Pswd;
			}

			public void setPswd(String Pswd) {
				this.Pswd =Pswd;
			}
			public String getEmail() {
				return this.Email;
			}

			public void setEmail(String email) {
				this.Email = email;
			}
			public String getDOfB() {
				return this.DOfB;
			}

			public void setDOfB(String DOfB) {
				this.DOfB=DOfB;
			}
			public String getAddress() {
				return this.Address;
			}

			public void setAddress(String Address) {
				this.Address=Address;
			}
			public String getMobNumber() {
				return this.MobNumber;
			}

			public void setMobNumber(String MobNumber) {
				this.MobNumber=MobNumber;
			}
			
		

	   
	



}
