package com.moqtar.transport.dao.entity;

public class Commodity {
	private String commodityDetailes;
	private String carName;
	private String registrationNumber;
	private String sourceAdd;
	private String destinationAdd;
	
	public Commodity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Commodity(String commodityDetailes, String carName, String registrationNumber, String sourceAdd,
			String destinationAdd) {
		super();
		this.commodityDetailes = commodityDetailes;
		this.carName = carName;
		this.registrationNumber = registrationNumber;
		this.sourceAdd = sourceAdd;
		this.destinationAdd = destinationAdd;
	}

	public String getCommodityDetailes() {
		return commodityDetailes;
	}
	public void setCommodityDetailes(String commodityDetailes) {
		this.commodityDetailes = commodityDetailes;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getSourceAdd() {
		return sourceAdd;
	}
	public void setSourceAdd(String sourceAdd) {
		this.sourceAdd = sourceAdd;
	}
	public String getDestinationAdd() {
		return destinationAdd;
	}
	public void setDestinationAdd(String destinationAdd) {
		this.destinationAdd = destinationAdd;
	}
	
	
}