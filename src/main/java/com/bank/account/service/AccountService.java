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
/**
 * Returns Attributes of accounts
 * Here we can connect to repository using JPA to fetch the data from Database 
 * Query the database table using userId and fetch the attributes of accounts .
 * Right now we are passing an empty list
 * @param userId
 * @return
 */
	public List<AccountAttribute> retrieveAccountAttributes(String userId) {
		return accountAttributes;
	}

	/**
	 * Returns the transaction details.
	 * @param accountId
	 * @return
	 */
	public List<AccountTransaction> retrieveAccountTransactions(String accountId) {
		return accountTransactions;
	}
}