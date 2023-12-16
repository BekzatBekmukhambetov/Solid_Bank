package com.example.project1.domain.methods;

import com.example.project1.domain.AccountType;

public class CheckingAccount extends AccountWithdraw{
    public CheckingAccount(AccountType accountType, String id, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType.CHECKING, id, clientID, balance, withdrawAllowed);
    }
}
