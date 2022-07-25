package com.fdmgroup.BankDesign;

public class Savings extends Account {

	private double intRate;

	@Override
	public double withdrawAmount(int accountId, double amount) {
		double tempBalance = getBalMap().get(accountId);
		if (amount <= tempBalance) {
			tempBalance -= amount;
			balMap.put(accountId, tempBalance);
		}
		return tempBalance;
	}

	public double getIntRate() {
		return intRate;
	}

	public void setIntRate(double intRate) {
		this.intRate = intRate;
	}
	
}
