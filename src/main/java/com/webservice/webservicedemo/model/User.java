package com.webservice.webservicedemo.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.webservice.webservicedemo.model.attributes.Address;
import com.webservice.webservicedemo.model.attributes.Email;
import com.webservice.webservicedemo.model.attributes.Name;
import com.webservice.webservicedemo.model.attributes.PhoneNumber;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 647906186411671998L;
	private String id;
	private String externalId;
	private Name name;
	private String userName;
	private String displayName;
	private String nickName;
	private String profileUrl;

	private List<Email> emails;

	private String userType;
	private String title;
	private String preferredLanguage;
	private String locale;
	private String timezone;
	private boolean active;
	private String password;

	public User() {
	}

	public User(String id, String externalId, Name name, String userName, String displayName, String nickName,
			String profileUrl, List<Email> emails, List<Address> addresses, List<PhoneNumber> phoneNumbers,
			String userType, String title, String preferredLanguage, String locale, String timezone, boolean active,
			String password) {
		super();
		this.id = id;
		this.externalId = externalId;
		this.name = name; //
		this.userName = userName;
		this.displayName = displayName;
		this.nickName = nickName;
		this.profileUrl = profileUrl;
		this.emails = emails; //
		this.userType = userType;
		this.title = title;
		this.preferredLanguage = preferredLanguage;
		this.locale = locale;
		this.timezone = timezone;
		this.active = active;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getProfileUrl() {
		return profileUrl;
	}

	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPreferredLanguage() {
		return preferredLanguage;
	}

	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", externalId=" + externalId + ", name=" + name + ", userName=" + userName
				+ ", displayName=" + displayName + ", nickName=" + nickName + ", profileUrl=" + profileUrl + ", emails="
				+ emails + ", userType=" + userType + ", title=" + title + ", preferredLanguage=" + preferredLanguage
				+ ", locale=" + locale + ", timezone=" + timezone + ", active=" + active + ", password=" + password
				+ "]";
	}

}
