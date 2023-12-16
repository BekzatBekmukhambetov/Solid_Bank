package com.example.project1.domain;



public class Account {
    private AccountType accountType;
    private String id;
    private String clientID;
    private double balance;
    private boolean WithdrawAllowed;

    @Override
    public String toString() {
        return "Account{" +
                "accountType=" + accountType +
                ", id='" + id + '\'' +
                ", clientID='" + clientID + '\'' +
                ", balance=" + balance +
                ", WithdrawAllowed=" + WithdrawAllowed +
                '}';
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isWithdrawAllowed() {
        return WithdrawAllowed;
    }

    public void setWithdrawAllowed(boolean withdrawAllowed) {
        WithdrawAllowed = withdrawAllowed;
    }

    public Account(AccountType accountType, String id, String clientID, double balance, boolean withdrawAllowed) {
        this.accountType = accountType;
        this.id = id;
        this.clientID = clientID;
        this.balance = balance;
        WithdrawAllowed = withdrawAllowed;
    }


}
