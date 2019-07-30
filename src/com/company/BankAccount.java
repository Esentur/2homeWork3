package com.company;

public class BankAccount {
    private double amount;
    public void deposit(double sum){
        System.out.println("Ваш остаток на балансе: "+amount);
        amount=amount+sum;
        System.out.println("Теперь ваш баланс: "+amount);
    }
    public void withDraw(double sum) throws LimitException {

        if(sum>amount){
            throw new LimitException("Остаток меньше, чем запрашиваемая сумма",amount);
        }
        amount=amount-sum;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
