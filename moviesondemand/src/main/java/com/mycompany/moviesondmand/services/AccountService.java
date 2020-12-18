/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.moviesondmand.services;

import com.mycompany.moviesondmand.Databases.Database;
import com.mycompany.moviesondmand.models.Account;
import com.mycompany.moviesondmand.models.Customer;
import com.mycompany.moviesondmand.models.Movie;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Group BBB , sandeeppulavazhy
 */
public class AccountService {
    
    
    private List<Customer> customerslist = new Database().getCustomersDB();
    private List<Account> accountslist = new Database().getAccountsDB(); 
    
    public List<Account> getAllAccountsByCustomer(int CustomerId) {
        return customerslist.get(CustomerId-1).getAccounts();
    }
    
    public Account getAccountByID(int CustomerId, int AccountId) {
        return customerslist.get(CustomerId-1).getAccounts().get(AccountId-1);
    }

    public List<Account> getAllAccounts() {
        return accountslist;
    }
    
    public Account createAccount(Account a, int c_id){
    
        
        Customer cust = customerslist.get(c_id-1);
        a.setId(cust.getAccounts().size() + 1);
	cust.addAccountToCust(a);
        
        
	System.out.println("201 - resource created with path: /messages/" + String.valueOf(cust.getId())+"/comments/"+String.valueOf(a.getId()));
        System.out.println("Updated Message:"+a.printAccount());
	return a;
    }
    

}
