package com.bank.account.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.bank.account.model.AccountAttribute;
import com.bank.account.model.AccountTransaction;

@Component
public class AccountService {

	private static List<AccountAttribute> accountAttributes = null; 
	private static List<AccountTransaction> accountTransactions = null;
	
	public AccountService() {
		accountAttributes = new ArrayList<AccountAttribute>();
		accountTransactions = new ArrayList<AccountTransaction>();
	}

	public List<AccountAttribute> retrieveAccountAttributes(String userId) {
		return accountAttributes;
	}

	public List<AccountTransaction> retrieveAccountTransactions(String accountId) {
		return accountTransactions;
	}
}