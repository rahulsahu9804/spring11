package com.pack.model;

public class User {
private String name;
private String password;
private String country;
private String AboutYou;
private String gender;
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
private String [] community;
private boolean mailingList;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getAboutYou() {
	return AboutYou;
}
public void setAboutYou(String aboutYou) {
	AboutYou = aboutYou;
}
public String[] getCommunity() {
	return community;
}
public void setCommunity(String[] community) {
	this.community = community;
}
public boolean isMailingList() {
	return mailingList;
}
public void setMailingList(boolean mailingList) {
	this.mailingList = mailingList;
}

}
