package com.fdmgroup.BankDesign;

import java.util.List;

public class Company extends Customer {

	private String name;
	private String address;
	private int taxId;
	
	public Company(String name, String address, int taxId) {
		this.name = name;
		this.address = address;
		this.taxId = taxId;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", address=" + address + ", taxId=" + taxId + "]";
	}
	
	public void addAllAcc(int customerId, int amount) {
		List<Integer> accList = accMap.get(customerId);
		for(int k: accList) {
			double tempBalance = balMap.get(k);
			tempBalance += amount;
			balMap.put(k, tempBalance);
		}
	}
}
