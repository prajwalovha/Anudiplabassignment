package com.exaple;

import javax.persistence.Embeddable;

@Embeddable  
public class Address {
	
	private String Area;
	private String City;
	private int Pincode;
	public String getArea() {
		return Area;
	}
	public Address() {
	
		// TODO Auto-generated constructor stub
	}
	public Address(String area, String city, int pincode) {
		super();
		Area = area;
		City = city;
		Pincode = pincode;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}

}
