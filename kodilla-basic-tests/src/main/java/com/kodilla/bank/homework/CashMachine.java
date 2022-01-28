package com.kodilla.bank.homework;

public class CashMachine {
    //variables
    private int[] transactions;
    private int numberOfTransactions;
    private int numberOfDeposits;
    private int numberOfWithdrawals;
    private int sumOfDeposits;
    private int sumOfWithdrawals;

    private int balance;

    // constructors

    public CashMachine() {
        this.numberOfTransactions = 0;
        //how about assigning 1 and placing deposit - ATM starting money 10000pln - then methods counting number of transactions should be - 1
        this.transactions = new int[numberOfTransactions];
    }
// methods

    //when adding should make sure to add 10, 20 etc.
    public void addTransaction(int transaction) {
        if (transaction > 0) {
            numberOfDeposits++;
            sumOfDeposits = sumOfDeposits + transaction;

        } else {
            numberOfWithdrawals--;
            sumOfWithdrawals = sumOfWithdrawals + transaction;
        }
        balance = balance + transaction;

        //check if withdrawal can be performed
        this.numberOfTransactions++;
        int[] newTab = new int[this.numberOfTransactions];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.numberOfTransactions - 1] = transaction;
        //following idea from line 18  it'd be -2 instead of -1 in line above
        this.transactions = newTab;
    }

    //getters and setters
    public int getNumberOfDeposits() {
        return numberOfDeposits;
    }

    public int getNumberOfWithdrawals() {
        return numberOfWithdrawals;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public int getBalance() {
        return balance;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getSumOfDeposits() {
        return sumOfDeposits;
    }

    public int getSumOfWithdrawals() {
        return sumOfWithdrawals;
    }
}

// needs to have some start balance 10000pln?
//  w metodzie weryfikacja czy jest ta kwota w bankomacie
// metoda do weryfikacji you can't withdraw more pln than there is in the cash machine



