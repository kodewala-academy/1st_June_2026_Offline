package com.kodewala.account;

import java.io.Serializable;

public class Account implements Serializable
{
	
	private transient int balance; // skip the serialization
	private transient String name;
	private String ifscCode;
	private String location;

	
	public Account(int balance, String name, String ifscCode, String location) {
		super();
		
		this.balance = balance;
		this.name = name;
		this.ifscCode = ifscCode;
		this.location = location;
	}

	public int getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public String getLocation() {
		return location;
	}

	
	
	
}
