package com.xworkz.main;

public class TheatreDto {

	private String name;
	private String ownerName;
	private int noOfSeats;
	private boolean comfortable;
	private int noOfScreens;
	private String location;
	private long pincode;
	private boolean affordable;
	private int noOfWorkers;
	private boolean hygenic;

	public TheatreDto() {
		System.out.println("Default Constructor from TheatreDTO");
	}

	public TheatreDto(String name, String ownerName, int noOfSeats, boolean comfortable, int noOfScreens,
			String location, long pincode, boolean affordable, int noOfWorkers, boolean hygenic) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.noOfSeats = noOfSeats;
		this.comfortable = comfortable;
		this.noOfScreens = noOfScreens;
		this.location = location;
		this.pincode = pincode;
		this.affordable = affordable;
		this.noOfWorkers = noOfWorkers;
		this.hygenic = hygenic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public boolean isComfortable() {
		return comfortable;
	}

	public void setComfortable(boolean comfortable) {
		this.comfortable = comfortable;
	}

	public int getNoOfScreens() {
		return noOfScreens;
	}

	public void setNoOfScreens(int noOfScreens) {
		this.noOfScreens = noOfScreens;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public boolean isAffordable() {
		return affordable;
	}

	public void setAffordable(boolean affordable) {
		this.affordable = affordable;
	}

	public int getNoOfWorkers() {
		return noOfWorkers;
	}

	public void setNoOfWorkers(int noOfWorkers) {
		this.noOfWorkers = noOfWorkers;
	}

	public boolean isHygenic() {
		return hygenic;
	}

	public void setHygenic(boolean hygenic) {
		this.hygenic = hygenic;
	}

	@Override
	public String toString() {
		return "TheatreDto [name=" + name + ", ownerName=" + ownerName + ", noOfSeats=" + noOfSeats + ", comfortable="
				+ comfortable + ", noOfScreens=" + noOfScreens + ", location=" + location + ", pincode=" + pincode
				+ ", affordable=" + affordable + ", noOfWorkers=" + noOfWorkers + ", hygenic=" + hygenic + "]";
	}
	
	

}
