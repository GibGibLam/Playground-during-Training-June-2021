package com.fdmgroup.BankDesign;

import java.util.HashMap;
import java.util.Map;

public abstract class Account {
	
	private int accountId;
	private static int accTempId = 1000;
	private static double balance = 0;
	
	// Integer - accountId, Double - balance
	Map<Integer, Double> balMap = new HashMap<>();
	
	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public static double getBalance() {
		return balance;
	}

	public static void setBalance(double balance) {
		Account.balance = balance;
	}

	public Map<Integer, Double> getBalMap() {
		return balMap;
	}

	public void setBalMap(Map<Integer, Double> balMap) {
		this.balMap = balMap;
	}

	public Account() {
		setAccountId(accTempId);
		accTempId += 5;
	}
	
	public double depositAmount(int accountId, double amount) {
		double tempBalance = balMap.get(accountId);
		tempBalance += amount;
		balMap.put(accountId, tempBalance);
		return tempBalance;
	}
	
	public abstract double withdrawAmount(int accountId, double amount);
	
	public double correctAmount(int accountId, double amount) {
		balMap.put(accountId, amount);
		return balMap.get(accountId);
	}
}
