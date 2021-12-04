package com.moqtar.transport.model;

public class CommodityBean {
	private String commodityDetailes;
	private String name;
	private String dateOfShipping;
	private String carName;
	private String registrationNumber;
	private String sourceAdd;
	private String destinationAdd;
	private String estimatedAmount;

	public CommodityBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommodityBean(String commodityDetailes, String name, String dateOfShipping, String carName,
			String registrationNumber, String sourceAdd, String destinationAdd,String estimatedAmount) {
		super();
		this.commodityDetailes = commodityDetailes;
		this.name = name;
		this.dateOfShipping = dateOfShipping;
		this.carName = carName;
		this.registrationNumber = registrationNumber;
		this.sourceAdd = sourceAdd;
		this.destinationAdd = destinationAdd;
		this.estimatedAmount = estimatedAmount;
	}

	public String getCommodityDetailes() {
		return commodityDetailes;
	}

	public void setCommodityDetailes(String commodityDetailes) {
		this.commodityDetailes = commodityDetailes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfShipping() {
		return dateOfShipping;
	}

	public void setDateOfShipping(String dateOfShipping) {
		this.dateOfShipping = dateOfShipping;
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
	public String getEstimatedAmount() {
		return estimatedAmount;
	}

	public void setEstimatedAmount(String estimatedAmount) {
		this.estimatedAmount = estimatedAmount;
	}


	}

