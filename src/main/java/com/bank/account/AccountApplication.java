package com.bank.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class AccountApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(
				AccountApplication.class, args);
	}
}