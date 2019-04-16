/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.glooble.banking;

import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Reid
 */
public class BankTest {
    
    /**
     * Setting things up before running any test methods.
     */
    @BeforeClass
    public static void setup() {
        Bank bankTest = new Bank("bankTest");
        String firstName = "Bob";
        String lastName = "Smith";
        Customer bobSmith = new Customer(bankTest, lastName, firstName);
    
    }
    
    public BankTest() {
    }

    /**
     * Test of main method, of class Bank.
     */
    @Test
    public void testMain() {
    }

    /**
     * Test of addAccountWizard method, of class Bank.
     */
    @Test
    public void testAddAccountWizard() {
    }

    /**
     * Test of getAllAccounts method, of class Bank.
     */
    @Test
    public void testGetAllAccounts() {
    }

    /**
     * Test of addCustomerWizard method, of class Bank.
     */
    @Test
    public void testAddCustomerWizard() {
    }

    /**
     * Test of addCustomer method, of class Bank.
     * Tests if the customerId output is correct.
     */
    @Test
    public void testAddCustomer() {
        final Bank bank1 = new Bank("Bank1");
        final Customer cust1 = new Customer(bank1, "Doe", "John");
        String expectedResult = cust1.getCustomerId();
        String result = bank1.addCustomer("Doe", "John");
        assertEquals("Customer ID should be \"" + expectedResult + "\" but was \""
                + result + "\".", expectedResult, result);
        assertNotNull("Customer ID should not be null.", result);
    }

    /**
     * Test of the addCustomer method.
     * Tests if a Customer object was added to the specified Bank.
     */
    @Test
    public void testAddCustomer_actuallyAdded() {
        final Bank bank1 = new Bank("Bank1");
        // To be continued or deleted
    }
    
    /**
     * Test of removeCustomer method, of class Bank.
     */
    @Test
    public void testRemoveCustomer() {
    }

    /**
     * Test of getAllCustomers method, of class Bank.
     */
    @Test
    public void testGetAllCustomers() {
    }

    /**
     * Test of getCustomer method, of class Bank.
     */
    @Test
    public void testGetCustomer_String() {
    }

    /**
     * Test of getCustomer method, of class Bank.
     */
    @Test
    public void testGetCustomer_String_String() {
    }

    /**
     * Test of getCustomersAccounts method, of class Bank.
     */
    @Test
    public void testGetCustomersAccounts() {
    }
    
}
