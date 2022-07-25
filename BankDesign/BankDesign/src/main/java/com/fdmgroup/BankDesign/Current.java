package com.fdmgroup.BankDesign;

public class Current extends Account {
	
	private static int chequeId;

	@Override
	public double withdrawAmount(int accountId, double amount) {
		double tempBalance = getBalMap().get(accountId);
		tempBalance -= amount;
		balMap.put(accountId, tempBalance);
		return tempBalance;
	}

	public static int getChequeId() {
		return chequeId;
	}
	
	public static int trackNextCheque() {
		return getChequeId()+1;
	}

	public static void setChequeId(int chequeId) {
		Current.chequeId = chequeId;
	}
	
	public void createCheque() {
		int currentCheque = getChequeId();
		currentCheque++;
		setChequeId(currentCheque);
	}


}
