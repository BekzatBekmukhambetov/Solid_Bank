package com.example.project1.services;

import com.example.project1.domain.AccountType;

public interface AccountCreationService {
    void create(AccountType accountType,long bankID, String clientID, long accountID);
}
