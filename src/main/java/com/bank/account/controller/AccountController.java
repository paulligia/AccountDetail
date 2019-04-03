package com.bank.account.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.bank.account.model.AccountAttribute;
import com.bank.account.model.AccountTransaction;
import com.bank.account.service.AccountService;

/**
 * Controller for getting the account attributes and the transaction details of each account
 * @author Ligia
 *
 */
@RestController
@RequestMapping("/accounts")
public class AccountController {

	@Autowired
	private AccountService accountService;

	/**
	 * Returns the list of attributes of accounts assigned to the user (userId)
	 * @param userId
	 * @return
	 */
	@GetMapping("/list/{userId}")
	@ResponseBody
	public List<AccountAttribute> retrieveAccountAttributes(@PathVariable String userId) {
		return accountService.retrieveAccountAttributes(userId);
	}

	/**
	 * Returns the list of transaction details for the account id 
	 * @param accountId
	 * @return
	 */
	@GetMapping("/transaction/{accountId}")
	@ResponseBody
	public List<AccountTransaction> retrieveAccountTransaction(@PathVariable String accountId) {
		return accountService.retrieveAccountTransactions(accountId);
	}

}
