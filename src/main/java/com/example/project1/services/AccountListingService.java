package com.example.project1.services;

import com.example.project1.domain.Account;
import com.example.project1.domain.AccountType;
import com.example.project1.domain.methods.AccountWithdraw;

import java.util.List;

public interface AccountListingService {

    public Account getClientAccount(String clientID,String AccountID);
    AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);
    List<Account> getClientAccounts(String clientID);
    List<Account>getClientAccountByType(String clientID, AccountType accountType);
}
