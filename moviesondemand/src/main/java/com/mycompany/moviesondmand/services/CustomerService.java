/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviesondmand.services;

import com.mycompany.moviesondmand.Databases.Database;
import com.mycompany.moviesondmand.models.Customer;
import com.mycompany.moviesondmand.models.Customer;
import com.mycompany.moviesondmand.models.Movie;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author sandeep pulavazhy
 */
public class CustomerService {
    
    public static List<Customer> list = new ArrayList<>();

   
    
    Database d = new Database();
    private List<Customer> customerlist = d.getCustomersDB();
    
    public List<Customer> getCustomers() {
        return customerlist;
    }
       public Customer getCustomer(int id) {
        return customerlist.get(id-1);
    }  
       public Customer createCustomer(Customer c) {
	c.setId(customerlist.size() + 1);
      	customerlist.add(c);
	System.out.println("201 - resource created with path: /customers/" + String.valueOf(c.getId()));
        System.out.println("Updated Message:"+c.printCustomer());
	return c;
    }
       
       public List<Customer> getSearchCustomers(String fName, String emailAddress) {
        List<Customer> matcheslist = new ArrayList<>();
        
        for (Customer s: getCustomers()) {
            if ((fName == null || s.getFName().equals(fName)) 
                   && (emailAddress == null || s.getEmailAddress().equals(emailAddress))) {
               matcheslist.add(s);
            }
        }
        return matcheslist;
    }
}


    
