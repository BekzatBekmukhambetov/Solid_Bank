package com.example.project1.services.impl;

import com.example.project1.dao.AccountDAO;
import com.example.project1.domain.Account;
import com.example.project1.domain.AccountType;
import com.example.project1.domain.methods.AccountWithdraw;
import com.example.project1.services.AccountListingService;

import java.util.ArrayList;
import java.util.List;

public class AccountListingServiceImpl  implements AccountListingService {
    AccountDAO accountDAO;

    public AccountListingServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public Account getClientAccount(String clientID, String AccountID) {
        Account ClientAccount=accountDAO.getClientAccount(clientID, AccountID);
        return ClientAccount;
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
        return null;
    }

    @Override
    public List<Account> getClientAccounts(String clientID) {
        return accountDAO.getClientAccounts(clientID);

    }

    @Override
    public List<Account> getClientAccountByType(String clientID, AccountType accountType) {
        return null;
    }
}
