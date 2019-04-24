package com.webservice.webservicedemo.model.attributes;

public class Address {

	private String type;
	private String streetAddress;
	private String locality;
	private String region;
	private String postalCode;
	private String country;
	private String formatted;
	private boolean primary;
	@Override
	public String toString() {
		return "Address [type=" + type + ", streetAddress=" + streetAddress + ", locality=" + locality + ", region="
				+ region + ", postalCode=" + postalCode + ", country=" + country + ", formatted=" + formatted
				+ ", primary=" + primary + "]";
	}
	
	
}
