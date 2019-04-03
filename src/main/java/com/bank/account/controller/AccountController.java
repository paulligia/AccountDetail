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

@RestController
@RequestMapping("/accounts")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@GetMapping("/list/{userId}")
	@ResponseBody
	public List<AccountAttribute> retrieveAccountAttributes(@PathVariable String userId) {
		return accountService.retrieveAccountAttributes(userId);
	}

	@GetMapping("/transaction/{accountId}")
	@ResponseBody
	public List<AccountTransaction> retrieveAccountTransaction(@PathVariable String accountId) {
		return accountService.retrieveAccountTransactions(accountId);
	}

}
