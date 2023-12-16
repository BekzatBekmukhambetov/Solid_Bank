package com.example.project1.domain.methods;

import com.example.project1.domain.AccountType;

public class SavingAccount extends AccountWithdraw{
    public SavingAccount(AccountType accountType, String id, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType.SAVING, id, clientID, balance, withdrawAllowed);
    }
}
