/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviesondmand.Databases;
import com.mycompany.moviesondmand.models.Account;
import com.mycompany.moviesondmand.models.Customer;
import com.mycompany.moviesondmand.models.Movie;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author sandeeppulavazhy
 */
public class Database {
    public static List<Customer> customerDB = new ArrayList<>();
    public static List<Account> accountDB = new ArrayList<>();
    public static List<Movie> movieDB = new ArrayList<>();
        public static boolean init = true;
        
        
        
        public Database(){
            
            if(init){
                
                // manipulating data for customer class
                
        Customer c1 = new Customer (2, "Sandeep" , "Pulavazhy","x16101251@student.ncirl.ie", accountDB,movieDB);
        Customer c2 = new Customer (3, "David" , "Lyons","x17491304@student.ncirl.ie",accountDB,movieDB);
        Customer c3 = new Customer (4, "Ciaran" , "Byrne","x17367033@student.ncirl.ie",accountDB,movieDB);
        Customer c4 = new Customer (5, "Mindaugas" , "Prismantas","x17489412@student.ncirl.ie",accountDB,movieDB);
        
        customerDB.add(c1);
        customerDB.add(c2);
        customerDB.add(c3);
        customerDB.add(c4);
        
        
        //Manipulating data for Account Class
        
          
            Account a1 = new Account (2, "starDragon14", "PhoneElbowTree1490");
            Account a2 = new Account (3, "littleSaucerElf7","SmokeSmallTrees93");
            Account a3 = new Account (4, "FirstManOnUranus", "MartiansRule12IAmSpaceman");

             accountDB.add(a1);
             accountDB.add(a2);
             accountDB.add(a3);
             
             //Manipulating data for Movie Class
             
             Movie m1 = new Movie(1, "Finding Nemo", "The story of a fish trying to find a fish called Nemo", false, false);
            Movie m2 = new Movie(2, "Finding Dory", "The story of a fish trying to find a fish called Dory", false, false);
            Movie m3 = new Movie(3, "Sniper: Assassin's End", "Man with a sniper rifle trying to stop assassination", true, true);
            Movie m4 = new Movie(4, "Toy Story 4", "A story of moving toys trying to get to another side", false, true);
            
            movieDB.add(m1);
            movieDB.add(m2);
            movieDB.add(m3);
            movieDB.add(m4);

        
        init = false;
            }
        }
         
    public static List<Customer> getCustomersDB() {
        return customerDB;
    }
    
     
    public static List<Account> getAccountsDB() {
        return accountDB;
    }
    
     
    public static List<Movie> getMoviesDB() {
        return movieDB;
    }
}
