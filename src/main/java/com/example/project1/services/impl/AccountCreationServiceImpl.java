package com.example.project1.services.impl;

import com.example.project1.dao.AccountDAO;
import com.example.project1.domain.Account;
import com.example.project1.domain.AccountType;
import com.example.project1.services.AccountCreationService;


public class AccountCreationServiceImpl  implements AccountCreationService {
    AccountDAO accountDAO;

    public AccountCreationServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void create(AccountType accountType, long bankID, String clientID, long accountID) {
        String accountNumber = String.format("%03d%06d", 1, accountID);

        switch (accountType) {
            case CHECKING:
                accountDAO.createNewAccount(new Account(accountType,clientID,accountNumber,0.0,true));
                break;
            case SAVING:
                accountDAO.createNewAccount(new Account(accountType,clientID,accountNumber,0.0,true));
                break;
            case FIXED:
                accountDAO.createNewAccount(new Account(accountType,clientID,accountNumber,0.0,false));
                break;

        }
    }
}
