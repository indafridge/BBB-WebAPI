    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.moviesondmand.services;

import com.mycompany.moviesondmand.Databases.Database;
import com.mycompany.moviesondmand.models.Account;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Group BBB
 */
public class AccountService {
    
    public static List<Account> list = new ArrayList<>();
    public static boolean init = true;


   Database d = new Database();
   private List<Account> accountList = d.getAccountsDB();
   
    public List<Account> getAccounts(){
    return accountList;

    }

    public Account getAccount(int id) {
        return accountList.get(id-1);
    }
    
    public Account createAccount(Account a){
        a.setId(accountList.size() + 1);
        accountList.add(a);
        System.out.println("Account ID" + String.valueOf(a.getId()));
        System.out.println("Show movies" +a.printAccount());
        return a;
    }
}
