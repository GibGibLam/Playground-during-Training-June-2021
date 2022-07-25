package com.fdmgroup.BankDesign;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankTest {
	
	Account account;
	
	@BeforeEach
	public void init() {
		account = new Account(1000, "Personal Savings");
	}

	@Test
	public void getAccountId_ReturnsIntIdWhenCalled() {
		assertEquals(1000, account.getAccountId());
	}
	
	@Test
	public void getAccountBalance_ReturnsDoubleBalanceWhenCalled() {
		assertEquals(0, account.getAccountBalance(1000));
	}


}
