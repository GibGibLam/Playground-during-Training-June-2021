package com.fdmgroup.BankDesign;

public abstract class Customer {

	private int customerId;
	private static int tempId = 2_000_000;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Customer() {
		setCustomerId(tempId);
		tempId += 7;
	}

}
