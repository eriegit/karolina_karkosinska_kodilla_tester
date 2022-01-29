package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-120);
        cashMachine.addTransaction(250);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(-120, transactions[0]);
        assertEquals(250, transactions[1]);

    }

    @Test
    public void shouldAddZeroElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(0);
        cashMachine.addTransaction(-0);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }
    //Error message: expected: <0> but was: <2> Expected :0   Actual   :2,
    // to be fixed by defining that '0'cannot be added as transaction,
    // deposit >=10pln, withdrawal >= 10pln?

    @Test
    public void shouldCalculateNumberOfDeposits() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.addTransaction(-120);
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(-520);
        cashMachine.addTransaction(40);
        cashMachine.addTransaction(-10);
        cashMachine.addTransaction(250);

        assertEquals(3, cashMachine.getNumberOfDeposits());
    }

    @Test
    public void shouldCalculateNumberOfWithdrawals() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.addTransaction(-120);
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(-520);
        cashMachine.addTransaction(40);
        cashMachine.addTransaction(-10);
        cashMachine.addTransaction(250);

        assertEquals(3, cashMachine.getNumberOfWithdrawals());
    }

    @Test
    public void shouldCalculateNumberOfTransactions() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.addTransaction(-120);
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(-520);
        cashMachine.addTransaction(40);
        cashMachine.addTransaction(-10);
        cashMachine.addTransaction(250);

        assertEquals(6, cashMachine.getNumberOfTransactions());
    }

    @Test
    public void shouldCalculateBalance() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.addTransaction(-120);
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(-520);
        cashMachine.addTransaction(40);
        cashMachine.addTransaction(-10);
        cashMachine.addTransaction(250);

        assertEquals(-310, cashMachine.getBalance());
    }
// !!! There's less than 0 in a cash machine - impossible in real life.
// to be fixed - either set a beginning amount in a cash machine (e.g. 100000)
// or write a method that will not execute a withdrawal below 0)

    @Test
    public void shouldGetAllTransactions() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.addTransaction(-120);
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(-520);
        cashMachine.addTransaction(40);
        cashMachine.addTransaction(-10);
        cashMachine.addTransaction(250);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(6, transactions.length);
        assertEquals(-120, transactions[0]);
        assertEquals(50, transactions[1]);
        assertEquals(-520, transactions[2]);
        assertEquals(40, transactions[3]);
        assertEquals(-10, transactions[4]);
        assertEquals(250, transactions[5]);
    }

    @Test
    public void shouldCalculateSumOfDeposits() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.addTransaction(-120);
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(-520);
        cashMachine.addTransaction(40);
        cashMachine.addTransaction(-10);
        cashMachine.addTransaction(250);

        assertEquals(340, cashMachine.getSumOfDeposits());
    }

    @Test
    public void shouldCalculateSumOfWithdrawals() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.addTransaction(-120);
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(-520);
        cashMachine.addTransaction(40);
        cashMachine.addTransaction(-10);
        cashMachine.addTransaction(250);

        assertEquals(-650, cashMachine.getSumOfWithdrawals());
    }


}
