package com.example.project1.domain.methods;

import com.example.project1.domain.AccountType;

public class FixedAccount extends AccountDeposit{
    public FixedAccount(AccountType accountType, String id, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType.FIXED, id, clientID, balance, withdrawAllowed);
    }
}
