package com.example.project1.dao;

import com.example.project1.domain.Account;
import com.example.project1.domain.AccountType;
import com.example.project1.domain.methods.AccountWithdraw;

;import java.util.List;

public interface AccountDAO {
    public List<Account>getClientAccounts(String clientID);
    public void createNewAccount(Account account);
    public void updateAccount(Account account);
    public List<Account>getClientAccountByType(String clientID, AccountType accountType);
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);
    public Account getClientAccount (String clientID,String accountID);
}
