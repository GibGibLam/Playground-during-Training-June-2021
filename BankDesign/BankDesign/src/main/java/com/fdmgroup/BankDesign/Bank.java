package com.fdmgroup.BankDesign;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {

	static Map<Integer, Customer> customerMap = new HashMap<>();
	static Map<Integer, List<Integer>> accMap = new HashMap<>();
	List<Integer> accIds = new ArrayList<>();
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.createCustomer(new Person("Ryan", "Bedok", 25943));
		bank.createCustomer(new Person("Gibson", "Bedok", 12345));
		bank.createCustomer(new Company("HW", "Bedok", 54321));
		bank.createCustomer(new Company("FDM", "Bedok", 454564));
		bank.createAccount(2_000_000, new Savings());
		bank.createAccount(2_000_000, new Current());
		bank.createAccount(2_000_007, new Current());
		bank.createAccount(2_000_014, new Savings());
		bank.createAccount(2_000_021, new Current());
		accMap.forEach((key, value) -> System.out.println(key + ":" + value));	
	}

	public void createCustomer(Customer type) {
		customerMap.put(type.getCustomerId(), type);
		System.out.println("Customer profile created.");
		for (Integer k : customerMap.keySet()) {
			String key = k.toString();
			String value = customerMap.get(k).toString();
			System.out.println(key + " " + value);
		}
	}
	
	public void createAccount(int customerId, Account type) {
		if(customerMap.get(customerId).getClass() == Person.class) {
			accIds.add(type.getAccountId());
			accMap.put(customerId, accIds);
			System.out.println("Customer " + customerId + " is a person");
		} 
		else if (customerMap.get(customerId).getClass() == Company.class) {
			accIds.add(type.getAccountId());
			accMap.put(customerId, accIds);
			System.out.println("Customer " + customerId + " is a company");
		}
		else {
			System.out.println("No such customer profile exist");
		}
	}
	
	public void deleteCustomer(int customerId) {
		customerMap.remove(customerId);
		for (Integer k : accMap.get(customerId)) {
			balMap.remove(k);
		}
		accMap.remove(customerId);
		
	}
}
