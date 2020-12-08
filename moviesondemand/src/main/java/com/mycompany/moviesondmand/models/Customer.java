/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviesondmand.models;

/**
 *
 * @author sandeep Pulavazhy
 */
public class Customer {
    private int id;
    private String fName;
    private String lName;
    private String emailAddress;
    
    
    
    public Customer(){
        
     }
    
    
    
        public Customer(int id, String fName, String lName, String emailAddress){
        
            this.id = id;
            this.fName = fName;
            this.lName = lName;
            this.emailAddress = emailAddress;
        
        }
        
        public int getId(){
        
            return id;
        }
        
        public void setId (int id){
        
            this.id = id;
        }
        
        public String getFName(){
         return fName;
        }
        
        public void setFName(String fName){
        
            this.fName = fName;
        }
        
       public String getLName(){
       return lName;
       }
       
       public void setLName(String lName){
        this.lName = lName;
       }
       
       public String getEmailAddress(){
      return emailAddress; 
      }
       
       public void setEmailAddress(String emailAddress){
       
       this.emailAddress = emailAddress;
       }
    
  
        
}


