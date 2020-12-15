/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.moviesondmand.services;

import com.mycompany.movies.ondmand.models.Account;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Group BBB
 */
public class AccountService {
    
    public static List<Account> list = new ArrayList<>();
    public static boolean init = true;


    public AccountService(){
    
        if (init) {
            
            Account c1 = new Account (2, "starDragon14", "PhoneElbowTree1490");
            Account c2 = new Account (3, "littleSaucerElf7","SmokeSmallTrees93");
            Account c3 = new Account (4, "FirstManOnUranus", "MartiansRule12IAmSpaceman");

            list.add(c1);
            list.add(c2);
            list.add(c3);

            init = false;            
        }


    }

    public List<Account> getAccounts(){
    return list;
    }

}
