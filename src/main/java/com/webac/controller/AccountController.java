package com.webac.controller;

import com.webac.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;

@Controller
@RequestMapping("/v1/forecasting")
public class AccountController {

        @RequestMapping(value = "/accounts", method = RequestMethod.GET)
        public @ResponseBody Account[] getAccounts() {
            Account[] accounts = new Account[] { new Account("123", "John R", BigDecimal.valueOf(235.00)),
                    new Account("345", "Peter J", BigDecimal.valueOf(2506.60)) };
            return accounts;
            }
        }
}
