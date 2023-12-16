package com.example.project1.domain.methods;


import com.example.project1.domain.Account;
import com.example.project1.domain.AccountType;


public class AccountDeposit  extends Account {
    public AccountDeposit(AccountType accountType, String id, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType, id, clientID, balance, withdrawAllowed);
    }
}
