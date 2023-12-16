package com.example.project1.dao;

import com.example.project1.domain.Account;
import com.example.project1.domain.AccountType;
import com.example.project1.domain.methods.AccountWithdraw;


import java.util.ArrayList;
import java.util.List;

public class MemoryAccountDAO implements AccountDAO {
    List<Account> accountList = new ArrayList<>();

    @Override
    public List<Account> getClientAccounts(String clientID) {
       return accountList;
    }

    @Override
    public void createNewAccount(Account account) {
        accountList.add(account);
    }

    @Override
    public void updateAccount(Account account) {

    }

    @Override
    public List<Account> getClientAccountByType(String clientID, AccountType accountType) {
        return null;
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
        return null;
    }

    @Override
    public Account getClientAccount(String clientID, String accountID) {
        return null;
    }
}
