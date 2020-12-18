/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviesondmand.models;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sandeep pulavazhy
 */
@XmlRootElement
public class Customer {
    private int id;
    private String fName;
    private String lName;
    private String emailAddress;
  private List<Account> accounts = new ArrayList<>();
  private List<Movie> movies = new ArrayList<>();
    
    
    public Customer(){
        
     }
    
    
    
        public Customer(int id, String fName, String lName, String emailAddress,List<Account> accounts, List<Movie> movies){
        
            this.id = id;
            this.fName = fName;
            this.lName = lName;
            this.emailAddress = emailAddress;
            this.accounts = accounts;
            this.movies = movies;
        
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
        public List<Account> getAccounts() {
	return accounts;
    }
          public void setAccounts(List<Account> accounts) {
	this.accounts = accounts;
    }

     public void addAccountToCust(Account account) {
	(this.accounts).add(account);
        System.out.println("add  a new account");
    }
     
     
     public List<Movie> getMovies() {
	return movies;
    }
          public void setMovies(List<Movie> movies) {
	this.movies = movies;
    }

     public void addMovieToCust(Movie movie) {
	(this.movies).add(movie);
        System.out.println("add  movie");
    }
     
     
     public void deleteMovieFromCust(Movie movie){
         (this.movies).remove(movie);
         System.out.println("delete movie");
     }
     
     
     
     
     
       
    public String printCustomer(){
        String str = this.getId()+ this.getFName()+this.getLName()+this.getEmailAddress();
        return str;
    }
  
     public String printAllAccounts() {
         String acc = "";
         for ( int i=0; i<accounts.size(); i++)
             acc=acc+accounts.get(i).printAccount()+" ";
	return acc;
    }
     
     public String printAllMovies(){
         String mov = "";
         for ( int i=0; i<movies.size(); i++)
             mov=mov+movies.get(i).printMovie()+" ";
	return mov;
     }

        
}


