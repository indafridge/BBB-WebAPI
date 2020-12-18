/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviesondmand.services;


import com.mycompany.moviesondmand.Databases.Database;
import com.mycompany.moviesondmand.models.Customer;
import com.mycompany.moviesondmand.models.Movie;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mynde, sandeeppulavazhy
 */
public class MovieService {
    
      private List<Customer> customerslist = new Database().getCustomersDB();
    private List<Movie> movieslist = new Database().getMoviesDB(); 
    
    public List<Movie> getAllMoviesByCustomer(int CustomerId) {
        return customerslist.get(CustomerId).getMovies();
    }
    
    public Movie getMovieByID(int CustomerId, int MovieId) {
        return customerslist.get(CustomerId).getMovies().get(MovieId);
    }

    public List<Movie> getAllMovies() {
        return movieslist;
    }
    
    // Create movie
    
    public Movie createMovie(Movie m, int c_id){
    
        
        Customer cust = customerslist.get(c_id-1);
        m.setId(cust.getMovies().size() + 1);
	cust.addMovieToCust(m);
        
        
	System.out.println("201 - resource created with path: /customers/" + String.valueOf(cust.getId())+"/movies/"+String.valueOf(m.getId()));
        System.out.println("Updated Message:"+m.printMovie());
	return m;
    }
    
    //delete Movie
    
    public Movie deleteMovie(Movie m, int c_id){
        
        Customer cust = customerslist.get(c_id-1);
        m.setId(cust.getMovies().size() - 1);
        cust.deleteMovieFromCust(m);
         
	System.out.println("201 - resource created with path: /customers/" + String.valueOf(cust.getId())+"/movies/"+String.valueOf(m.getId()));
        System.out.println("Updated Message:"+m.printMovie());
	return m;
    }
}
