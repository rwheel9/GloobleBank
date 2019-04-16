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

    private Account primaryAccount;
    private Account secondAccount;
    
    @Before 
    public void setUp() 
    { 
        primaryAccount = new Account("John Smith", 100, "Johns Acocunt");
        secondAccount = new Account("Jane Doe", 100, "Janes Acocunt");
    } 
    
    @After 
    public void tearDown() 
    { 
        primaryAccount = null; 
        secondAccount = null;
    }
    
    @Test
    public void testDeposit() 
    {
        {
          assertEquals(0, primaryAccount.getBalance());
          primaryAccount.deposit(100);
          assertEquals(100, primaryAccount.getBalance());
        }
    }

    @Test
    public void testWithdraw() 
    {
        public void testWithdraw() 
        {
            assertEquals(100, primaryAccount.getBalance());          
            primaryAccount.withdraw(100);
            assertEquals(0, primaryAccount.getBalance());
        }
    }

    @Test
    public void testTransfer() 
    {
        public void testTransfer() throws 
                InsufficientFundsException 
        {  
            primaryAccount.transfer(100, secondAccount); 
            assertTrue (primaryAccount.balance()==100); 
            assertTrue (secondAccount.balance()==0); 
        } 
         
    @Test
    public void testTransfer_InsufficientFundsException() 
        throws InsufficientFundsException 
        { 
        primaryAccount.transfer(101, secondAccount); 
        }
    }
    
    @Test
    public void testGetAccountDescription() 
    {
        primaryAccount.getAccountDescription();
        //more to follow
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
