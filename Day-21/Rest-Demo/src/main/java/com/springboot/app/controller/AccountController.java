package com.bfs.restdemo.controller;

import com.bfs.restdemo.domain.account.Account;
import com.bfs.restdemo.domain.account.AccountRequest;
import com.bfs.restdemo.domain.account.AccountResponse;
import com.bfs.restdemo.domain.common.ServiceStatus;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/spring-rest")
public class AccountController {

    private static List<Account> ACCOUNTS;

    public AccountController() {
        ACCOUNTS = new ArrayList<>();
        ACCOUNTS.add(new Account("12345-1", "Account1"));
        ACCOUNTS.add(new Account("12345-2", "Account2"));
        ACCOUNTS.add(new Account("12345-3", "Account3"));
        ACCOUNTS.add(new Account("12345-4", "Account4"));
    }

    @GetMapping(value = "/protected/account",produces = {MediaType.APPLICATION_JSON_VALUE})
    public AccountResponse getAccount(HttpServletRequest httpRequest) {
        AccountResponse response = new AccountResponse();

        response.setAccountList(ACCOUNTS);
        response.setUsername((String) httpRequest.getAttribute("username"));
        prepareResponse(response, true, "");

        return response;
    }

    //,produces = {MediaType.APPLICATION_XML_VALUE}
    @PostMapping(value = "/Account" ,produces = {MediaType.APPLICATION_XML_VALUE})
    public AccountResponse getAccountWithoutSecurity(@RequestBody AccountRequest request) {
        AccountResponse response = new AccountResponse();
        if (request == null || request.getAccountNumber() == null) {
            prepareResponse(response, false, "Request is Invalid!");
            return response;
        }

        Optional<Account> account = ACCOUNTS.stream()
                .filter(account1 -> request.getAccountNumber().equalsIgnoreCase(account1.getAccountNumber()))
                .findAny();

        if (!account.isPresent()) {
            prepareResponse(response, false, "Account Number does not exist");
            return response;
        }

        response.setAccount(account.get());
        prepareResponse(response, true, "");

        return response;
    }

    private void prepareResponse(AccountResponse response, boolean success, String errorMessage) {
        response.setServiceStatus(new ServiceStatus(success ? "SUCCESS" : "FAILED", success, errorMessage));
    }
}
