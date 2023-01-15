package com.bridgelabz.oopsPrograms;


public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1000);
            account.debit(300);
        System.out.println("New balance after Debit: " + account.getBalance());

        }
    }
