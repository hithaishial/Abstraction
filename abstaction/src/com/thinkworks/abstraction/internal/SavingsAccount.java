package com.thinkworks.abstraction.internal;

import com.thinkworks.abstraction.external.BankAccount;

public class SavingsAccount extends BankAccount {

    @Override
    public void deposit() {
        System.out.println("amount deposited in savings account");

    }

    @Override
    public void withdraw() {
        System.out.println("amount withdrawn from savings account");
    }

    @Override
    public void credit() {
        System.out.println("amount credited to savings account");
    }
}
