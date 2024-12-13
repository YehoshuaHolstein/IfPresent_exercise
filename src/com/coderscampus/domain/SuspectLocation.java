package com.coderscampus.domain;

public class SuspectLocation {
	
	String country;
	String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public SuspectLocation(String country, String name) {
		this.name = name;
		this.country = country;
	}
	
	

}
