package com.fdmgroup.BankDesign;

import java.util.List;

public class Person extends Customer {
	
	private String name;
	private String address;
	private int taxId;
	
	public Person(String name, String address, int taxId) {
		this.name = name;
		this.address = address;
		this.taxId = taxId;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", taxId=" + taxId + "]";
	}
	
	public void resetAllAcc(int customerId) {
		List<Integer> accList = accMap.get(customerId);
		for(int k: accList) {
			balMap.put(k, 0);
		}
	}
	
}
