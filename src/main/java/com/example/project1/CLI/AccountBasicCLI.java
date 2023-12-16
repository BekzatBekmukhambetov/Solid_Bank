package com.example.project1.CLI;

import com.example.project1.UI.CreateAccountOperationUI;
import com.example.project1.domain.Account;
import com.example.project1.domain.BankCore;
import com.example.project1.services.AccountListingService;

import java.util.List;

public class AccountBasicCLI {
    CreateAccountOperationUI createAccountOperationUI;
    BankCore bankCore;
    AccountListingService accountListingService;

    public AccountBasicCLI(){

    }


    public AccountBasicCLI(CreateAccountOperationUI createAccountOperationUI,
                           BankCore bankCore,
                           AccountListingService accountListingService) {
        this.createAccountOperationUI = createAccountOperationUI;
        this.bankCore = bankCore;
        this.accountListingService = accountListingService;
    }

    public void createAccount(String clientID){
        bankCore.createNewAccount(createAccountOperationUI.requestAccountType(),clientID);
    }

   public void getAccount(String clientID){
       List<Account> clientAccounts = accountListingService.getClientAccounts(clientID);
       if (clientAccounts.isEmpty()) {
           System.out.println("Please Create Account");
       }else{
           System.out.println("Your Accounts");
           for(Account account: clientAccounts)
               System.out.println("ID= "+account.getClientID()+" Balance= "+account.getBalance()+" ClientID= "+account.getId()+" TypeOfAccount= "+ account.getAccountType());
       }

    }

}
