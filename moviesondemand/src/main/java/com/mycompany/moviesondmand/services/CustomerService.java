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

    
    
   /* public CustomerService(){
    
    if (init){
    
    
        Customer c1 = new Customer (2, "Sandeep" , "Pulavazhy","x16101251@student.ncirl.ie");
        Customer c2 = new Customer (3, "David" , "Lyons","x17491304@student.ncirl.ie");
        Customer c3 = new Customer (4, "Ciaran" , "Byrne","x17367033@student.ncirl.ie");
        Customer c4 = new Customer (5, "Mindaugas" , "Prismantas","x17489412@student.ncirl.ie");
        
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        init = false;
    }
    
     
    }
    
    public List<Customer> getCustomers(){
    return list;
    }
    
     
     public Customer getCustomer(int id) {
        return list.get(id-1);
   }  
   */
    
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
}


    
