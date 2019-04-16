/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.glooble.banking;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Brandon Henriksen
 */
public class CustomerTest {
    private final static int VALID_NAME = "";
    private final static int VALID_ID = "";
}
    @Before
    public void init () {
        this.bank = null;
        this.customerId = "";
        this.lastName = "";
        this.firstName = "";
   }
    
    @Test
    public void startZeroCustomersWhenNewCreated() {
        CustomerList customers = new CustomerList();
        Assert.assertEquals(0, customers.getNumberOfCustomers());
    }

    @Test
    public void newCustomerAdded() {
        CustomerList customers = new CustomerList();
        Customer customer = ""
        customers.add(customer)
        Assert.assertEquals(1, customers.getNumberOfCustomers());
    }
    @Test
    public void nullWhenFindByIdInvokedWithNotId() {
        CustomerList customers = new CustomerList();
        Assert.assertEquals(null, customers.getCustomerId("")); 
            
    }

    @Test
    public void returnIdWhenInList() {
        CustomerList customers = new CustomerList();
        Customer customer = new Customer("name", 1, "customerId", 7);
        customers.add(customer);
        Assert.assertEquals(customer, customers.getCustomerId(1)); 
            
    public customerTest() {
        @Test(expected = IllegalArgumentException.class)
        public void shouldThrowExceptionWhenNameIsNull() {
            Custumer custumer = new Custumer(null, VALID_NAME, VALID_ID);
        }
    }

    /**
     * Test of getCustomerAccounts method, of class Customer.
     */
    @Test
    public void testGetCustomerAccounts() {
    }

    /**
     * Test of ytdFees method, of class Customer.
     */
    @Test
    public void testYtdFees() {
    }

    /**
     * Test of ytdInterest method, of class Customer.
     */
    @Test
    public void testYtdInterest() {
    }

    /**
     * Test of addSavingsAccount method, of class Customer.
     */
    @Test
    public void testAddSavingsAccount() {
    }

    /**
     * Test of removeAccount method, of class Customer.
     */
    @Test
    public void testRemoveAccount() {
    }

    /**
     * Test of getAccount method, of class Customer.
     */
    @Test
    public void testGetAccount() {
    }

    /**
     * Test of toString method, of class Customer.
     */
    @Test
    public void testToString() {
    }

    /**
     * Test of hashCode method, of class Customer.
     */
    @Test
    public void testHashCode() {
    }

    /**
     * Test of equals method, of class Customer.
     */
    @Test
    public void testEquals() {
    }

    /**
     * Test of compareTo method, of class Customer.
     */
    @Test
    public void testCompareTo() {
    }
    
}
