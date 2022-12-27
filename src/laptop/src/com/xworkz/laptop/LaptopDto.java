package com.xworkz.laptop;


public class LaptopDto {
	
	private String company;
	private String name;
	private double price;
	private int RAM;
	private int ROM;
	private int windows;
	private String color;
	private boolean affordable;
	private String processor;
	private int warranty;
	
	public LaptopDto() {
		
	}
	
	
	public LaptopDto(String company, String name, double price, int RAM, int ROM, int windows, String color,
			boolean affordable, String processor, int warranty) {
		super();
		this.company = company;
		this.name = name;
		this.price = price;
		this.RAM = RAM;
		this.ROM = ROM;
		this.windows = windows;
		this.color = color;
		this.affordable = affordable;
		this.processor = processor;
		this.warranty = warranty;
	}






	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		RAM = rAM;
	}
	public int getROM() {
		return ROM;
	}
	public void setROM(int rOM) {
		ROM = rOM;
	}
	public int getWindows() {
		return windows;
	}
	public void setWindows(int windows) {
		this.windows = windows;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isAffordable() {
		return affordable;
	}
	public void setAffordable(boolean affordable) {
		this.affordable = affordable;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}


	@Override
	public String toString() {
		return "LaptopDto [company=" + company + ", name=" + name + ", price=" + price + ", RAM=" + RAM + ", ROM=" + ROM
				+ ", windows=" + windows + ", color=" + color + ", affordable=" + affordable + ", processor="
				+ processor + ", warranty=" + warranty + "]";
	}
	
	
	
	
	

}
