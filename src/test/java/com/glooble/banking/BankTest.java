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
    private static final String JOHN = "John";
    private static final String DOE = "Doe";
    private Bank centralBank;
    private Bank bank1;
    Customer cust1;
    
    /**
     * Setting things up before running any test methods.
     */
    @BeforeClass
    public static void initSetup() {
       //moved this setup to the @Before method below. 
    }
    
    @Before
    public void setup() {
        bank1 = new Bank("Bank1");
        centralBank = new Bank("Central Bank");
        cust1 = new Customer(centralBank, DOE, JOHN);
    }
    
    @After
    public void tearDown() {
        bank1 = null;
        centralBank = null;
        cust1 = null;
    }
    
    public BankTest() {
        Bank someBank = null;
        assertNull(someBank);
        someBank = new Bank("someBank");
        assertNotNull(someBank);
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
     * Tests if the customerId output is correct. Note: as mentioned in the
     * assignment description, this test assumes all customer names are unique.
     */
    @Test
    public void testAddCustomer_existingCustomer() {
        String expectedResult = cust1.getCustomerId();
        String result = bank1.addCustomer(DOE, JOHN);
        assertEquals("Customer ID should be \"" + expectedResult + "\" but was \""
                + result + "\".", expectedResult, result);
        assertNotNull("Customer ID should not be null.", result);
    }

    /**
     * Test of the addCustomer method.
     * Tests the behavior of adding a customer without preexisting Customer object.
     */
    @Test
    public void testAddCustomer_newCustomer() {
        String result = bank1.addCustomer("Bob", "Jimmy");
        assertNotNull(result);
        
    }
    
    /**
     * Test of removeCustomer method, of class Bank.
     * Tests whether the Customer object is removed from the bank.
     */
    @Test
    public void testRemoveCustomer() {
        String customerId = cust1.getCustomerId();
        centralBank.removeCustomer(customerId);
        Customer result = centralBank.getCustomer(customerId);
        assertNotSame(cust1, result);
        
    }
    
    /**
     * Test of removeCustomer method to ensure the Customer object is not deleted
     * entirely, but only removed from the bank's listings.
     */
    @Test
    public void testRemoveCustomer_customerStillExists() {
        centralBank.removeCustomer(cust1.getCustomerId());
        assertNotNull("Removal from the bank should not delete the customer object.", cust1);
    }
    
    /**
     * Test of the removeCustomer method with the addCustomer method supplying 
     * the argument. This is not something I would expect to occur naturally; 
     * I am just trying things at this point.
     * 
     */
    @Test
    public void testRemoveAddedCustomer_whatWillThisDo() {
        //bank1.removeCustomer(bank1.addCustomer(DOE, JOHN));
        //assertNull(bank1.getCustomer(cust1.getCustomerId()));
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
