package com.webac.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webac.model.Account;

@RestController
@RequestMapping("/v1/forecasting")
public class AccountController {

    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public Account[] getAccounts() {
        Account[] accounts = new Account[] { new Account("123", "John R", BigDecimal.valueOf(235.00)),
                new Account("345", "Peter J", BigDecimal.valueOf(2505.60)) };

        return accounts;
    }

}
