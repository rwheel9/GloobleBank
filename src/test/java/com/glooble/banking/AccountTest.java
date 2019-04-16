/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.glooble.banking;

import org.junit.*; 
import static org.junit.Assert.*; 
import banking.Account;

/**
 *
 * @author Reid
 * @author William
 */
public class AccountTest {

    private primaryAccount account;
    
    @Before 
    public void setUp() 
    { 
        account = new SavingsAccount(100); 
    } 
    
    @After 
    public void tearDown() 
    { 
        account = null; 
    }
    
    
    @Test
    public void testDeposit() {
    }

    /**
     * Test of withdraw method, of class Account.
     */
    @Test
    public void testWithdraw() {
    }

    /**
     * Tests normal transfer of funds prior
     * to throwing the noted exception 
     */
    @Test
    public void testTransfer() 
    {
        public void testTransfer() throws 
                InsufficientFundsException 
        { 
            Account secondAccount = new Account(100); 
            account.transfer(100, secondAccount); 
            assertTrue (account.balance()==100); 
            assertTrue (secondAccount.balance()==0); 
        } 
    
        
    @Test
    public void testTransfer_InsufficientFundsException() 
        throws InsufficientFundsException 
        { 
        Account secondAccount = new Account(100); 
        account.transfer(101, secondAccount); 
        }
    }
    
    @Test
    public void testGetAccountDescription() {
    }

    /**
     * Test of setAccountDescription method, of class Account.
     */
    @Test
    public void testSetAccountDescription() {
    }

    /**
     * Test of getBalance method, of class Account.
     */
    @Test
    public void testGetBalance() {
    }

    /**
     * Test of getTransactions method, of class Account.
     */
    @Test
    public void testGetTransactions() {
    }

    /**
     * Test of getTransaction method, of class Account.
     */
    @Test
    public void testGetTransaction() {
    }

    /**
     * Test of getAccountId method, of class Account.
     */
    @Test
    public void testGetAccountId() {
    }

    /**
     * Test of getCustomerId method, of class Account.
     */
    @Test
    public void testGetCustomerId() {
    }

    /**
     * Test of getAccountCreationDate method, of class Account.
     */
    @Test
    public void testGetAccountCreationDate() {
    }

    /**
     * Test of hashCode method, of class Account.
     */
    @Test
    public void testHashCode() {
    }

    /**
     * Test of equals method, of class Account.
     */
    @Test
    public void testEquals() {
    }

    /**
     * Test of compareTo method, of class Account.
     */
    @Test
    public void testCompareTo() {
    }

    /**
     * Test of toString method, of class Account.
     */
    @Test
    public void testToString() {
    }

    public class AccountImpl extends Account {

        public AccountImpl() {
            super(null, 0.0, "");
        }

        public void deposit(double amount) {
        }

        public void withdraw(double amount) {
        }
    }
    
}
