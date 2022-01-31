package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void bankCashMachinesArrayShouldHaveZeroLength() {
        Bank bankObject = new Bank();
        CashMachine[] cashMachinesArray = bankObject.getCashMachines();
        assertEquals(0, cashMachinesArray.length);
    }

    @Test
    public void shouldNotAddNullElementToArray() {
        Bank bankObject = new Bank();
        bankObject.addCashMachine(null);
        CashMachine[] cashMachinesArray = bankObject.getCashMachines();
        assertEquals(0, cashMachinesArray.length);
        // the method addCashMachine should be improved
    }

    @Test
    public void shouldAddTwoCashMachinesToArray() {
        Bank bankObject = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        bankObject.addCashMachine(cashMachine1);
        bankObject.addCashMachine(cashMachine2);
        CashMachine[] cashMachinesArray = bankObject.getCashMachines();
        assertEquals(2, cashMachinesArray.length);

    }

    @Test
    public void shouldCalculateAverageBankDeposit() {
        Bank bankObject = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        cashMachine1.addTransaction(-120);
        cashMachine1.addTransaction(50);
        cashMachine1.addTransaction(-520);
        cashMachine1.addTransaction(40);
        cashMachine1.addTransaction(-10);
        cashMachine1.addTransaction(250);

        cashMachine2.addTransaction(400);
        cashMachine2.addTransaction(50);
        cashMachine2.addTransaction(320);
        cashMachine2.addTransaction(40);
        bankObject.addCashMachine(cashMachine1);
        bankObject.addCashMachine(cashMachine2);

        CashMachine[] cashMachinesArray = bankObject.getCashMachines();
        double averageBankDeposit = bankObject.getAverageBankDeposit();
        assertEquals(164.28, averageBankDeposit);

    }


}
