package com.cg.collectorresume;

import java.sql.Date;

import javax.servlet.RequestDispatcher;

public class Resume {
String firstName;
String lastName;
String gender;
Date dob;
String highestQualification;
long contactNumber;
String Hobbies;
String Email;


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}


public String getGender() {
	return gender;
}


public void setGender(String gender) {
	this.gender = gender;
}


public Date getDob() {
	return dob;
}


public void setDob(Date dob) {
	this.dob = dob;
}


public String getHighestQualification() {
	return highestQualification;
}


public void setHighestQualification(String highestQualification) {
	this.highestQualification = highestQualification;
}


public long getContactNumber() {
	return contactNumber;
}


public void setContactNumber(long contactNumber) {
	this.contactNumber = contactNumber;
}


public String getHobbies() {
	return Hobbies;
}


public void setHobbies(String hobbies) {
	Hobbies = hobbies;
}


public String getEmail() {
	return Email;
}


public void setEmail(String email) {
	Email = email;
}


public Resume(String firstName, String lastName, String gender, Date dob, String highestQualification,
		long contactNumber, String hobbies, String email) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.dob = dob;
	this.highestQualification = highestQualification;
	this.contactNumber = contactNumber;
	Hobbies = hobbies;
	Email = email;
}


}
