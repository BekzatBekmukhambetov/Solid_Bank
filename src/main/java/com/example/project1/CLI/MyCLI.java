package com.example.project1.CLI;

import com.example.project1.UI.CLIUI;
import com.example.project1.domain.AccountType;

import java.util.Scanner;

public class MyCLI implements CLIUI {
    private Scanner scanner;

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public MyCLI(Scanner scanner) {
        this.scanner = scanner;
    }

   public MyCLI() {
        this.scanner = new Scanner(System.in);
    }

    public double requestClientAmount(){
        return 0;
    }

    public String requestClientAccountNumber(){
        return "";
    }


    @Override
    public AccountType requestAccountType() {
        switch (scanner.nextLine()) {
            case "CHECKING":
                return AccountType.CHECKING;
            case "SAVING":
                return AccountType.SAVING;
            case "FIXED":
                return AccountType.FIXED;
        }
        return null;
    }


}
