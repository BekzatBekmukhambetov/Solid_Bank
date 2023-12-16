package com.example.project1;

import com.example.project1.CLI.AccountBasicCLI;
import com.example.project1.CLI.MyCLI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Project1Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("props.xml");
        MyCLI myCLI = new MyCLI();
        AccountBasicCLI accountBasicCLI = context.getBean(AccountBasicCLI.class);
        System.out.println("Welcome To BaursakBank" +
                "\n1 - show accounts" +
                "\n2 - create account" +
                "\n3 - exit"

        );

        while(true){
            switch (myCLI.getScanner().nextLine()){
                case"1":
                    accountBasicCLI.getAccount("1");
                    break;
                case "2":
                    System.out.println("Choose account type" +
                            "\n[CHECKING,SAVING,FIXED]");
                    accountBasicCLI.createAccount("1");
                    System.out.println("Bank account created");
                    break;
                case"3":
                    System.out.println("Bye)))");
                    return ;
            }
        }
    }

}
