/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author ADMIN
 */
public class Account {
    private long balance=10000;

    public Account() {
        System.out.println("Account balance is "+balance);
    }

    public long getBalance() {
        return balance;
    }
    public synchronized void withdraw(long amount){
        System.out.println("the withdrawal transaction is made with "+amount);
        if(balance<(amount+80)){
            System.out.println("\033[31m The amount in the account is not enough");
            System.out.println("\033[31m Waiting!!!");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        balance -=amount;
        System.out.println("Successful withdrawal! balance is "+balance);
    }
    public synchronized void deposit(long amount){
        System.out.println("the deposit transaction is made with "+amount);
        balance +=amount;
        System.out.println("deposit successfully, balance is "+balance);
        notify();
    }
    
}
