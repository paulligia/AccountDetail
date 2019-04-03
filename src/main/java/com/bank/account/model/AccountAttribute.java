package com.bank.account.model;

import java.sql.Date;

import javax.persistence.Entity;

@Entity
public class AccountAttribute {
	private Integer accountNumber;
	private String accountName;
	private String accountType;
	private Date balanceDate;
	private String currency;
	private Double availableBal;

	public AccountAttribute() {

	}

	public AccountAttribute(Integer accountNumber, String accountName, String accountType, Date balanceDate,
			String currency, Double availableBal) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountType = accountType;
		this.balanceDate = balanceDate;
		this.currency = currency;
		this.availableBal = availableBal;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getAvailableBal() {
		return availableBal;
	}

	public void setAvailableBal(Double availableBal) {
		this.availableBal = availableBal;
	}

	
}