package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private int numberOfCashMachines;

    public Bank() {
        this.numberOfCashMachines = 0;
        this.cashMachines = new CashMachine[numberOfCashMachines];
    }

    public void addCashMachine(CashMachine cashMachine) {
        if (cashMachine == null) {
            return;
        }
        this.numberOfCashMachines++;
        CashMachine[] newTab = new CashMachine[this.numberOfCashMachines];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.numberOfCashMachines - 1] = cashMachine;
        this.cashMachines = newTab;
    }

    public int getTotalBalance() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            CashMachine cashMachine = this.cashMachines[i];
            sum += cashMachine.getBalance();
        }
        return sum;
    }

    public int getBankNumberOfWithdrawals() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            CashMachine cashMachine = this.cashMachines[i];
            sum += cashMachine.getNumberOfWithdrawals();
        }
        return sum;
    }

    public int getBankNumberOfDeposits() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            CashMachine cashMachine = this.cashMachines[i];
            sum += cashMachine.getNumberOfDeposits();
        }
        return sum;
    }

    public double getAverageBankWithdrawal() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            CashMachine cashMachine = this.cashMachines[i];
            sum += cashMachine.getSumOfWithdrawals();
        }
        return sum / getBankNumberOfWithdrawals();
    }

    public double getAverageBankDeposit() {
        double sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            CashMachine cashMachine = this.cashMachines[i];
            sum += cashMachine.getSumOfDeposits();
        }
        double averageBankDeposit = sum / getBankNumberOfDeposits();
        return averageBankDeposit;
    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }
}

