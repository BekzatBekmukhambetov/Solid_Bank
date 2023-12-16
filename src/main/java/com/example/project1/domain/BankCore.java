package com.example.project1.domain;

import com.example.project1.services.AccountCreationService;

public class BankCore {
    private static long id =1;
    private long lastAccountNumber = 1;
    AccountCreationService accountCreation;

    public BankCore(AccountCreationService accountCreation) {
        this.accountCreation = accountCreation;
    }

    public BankCore() {

    }

    public void createNewAccount(AccountType accountType,String clientID){
        accountCreation.create(accountType,id,clientID,lastAccountNumber++);
    }

}
