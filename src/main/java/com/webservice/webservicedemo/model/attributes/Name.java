package com.webservice.webservicedemo.model.attributes;

public class Name {

	private String formatted;
	private String familyName;
	private String givenName;
	private String middleName;
	private String honorificPrefix;
	private String honorificSuffix;

	public Name() {
	}

	public Name(String formatted, String familyName, String givenName, String middleName, String honorificPrefix,
			String honorificSuffix) {
		super();
		this.formatted = formatted;
		this.familyName = familyName;
		this.givenName = givenName;
		this.middleName = middleName;
		this.honorificPrefix = honorificPrefix;
		this.honorificSuffix = honorificSuffix;
	}

	@Override
	public String toString() {
		return "Name [formatted=" + formatted + ", familyName=" + familyName + ", givenName=" + givenName
				+ ", middleName=" + middleName + ", honorificPrefix=" + honorificPrefix + ", honorificSuffix="
				+ honorificSuffix + "]";
	}

	public String getFormatted() {
		return formatted;
	}

	public void setFormatted(String formatted) {
		this.formatted = formatted;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getHonorificPrefix() {
		return honorificPrefix;
	}

	public void setHonorificPrefix(String honorificPrefix) {
		this.honorificPrefix = honorificPrefix;
	}

	public String getHonorificSuffix() {
		return honorificSuffix;
	}

	public void setHonorificSuffix(String honorificSuffix) {
		this.honorificSuffix = honorificSuffix;
	}

}
