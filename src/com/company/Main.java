package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {
            BankAccount  bankAccount = new BankAccount();
            bankAccount.setAmount(10000.0);
            while (true){
                bankAccount.withDraw(1000);
                System.out.println("остаток: "+bankAccount.getAmount());
            }
    }
}
