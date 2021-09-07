package com.springcore.lifecycle;

	public class Samosa {
	private String  price;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Samosa() {
		super();
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}

	}
