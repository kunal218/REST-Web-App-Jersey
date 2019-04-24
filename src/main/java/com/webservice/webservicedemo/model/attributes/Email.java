package com.webservice.webservicedemo.model.attributes;

public class Email {

	private String value;
	private String type;
	private boolean primary;
	@Override
	public String toString() {
		return "Email [value=" + value + ", type=" + type + ", primary=" + primary + "]";
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isPrimary() {
		return primary;
	}
	public void setPrimary(boolean primary) {
		this.primary = primary;
	}
	
}
