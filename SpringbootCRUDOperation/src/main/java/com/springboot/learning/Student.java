package com.springboot.learning;

import javax.management.loading.PrivateClassLoader;

public class Student {
  private String firstname;
  private String lastname;
  private int age;
  private long accountNumber;
  
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
}
public Student(String firstname, String lastname, int age,long accountNumber) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.age = age;
	this.accountNumber=accountNumber;
}
  
}