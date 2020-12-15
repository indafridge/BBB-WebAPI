/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviesondmand.services;


import com.mycompany.moviesondmand.models.Movie;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mynde
 */
public class MovieService {
    
    public static List<Movie> list = new ArrayList<>();
    public static boolean init = true;
    
    
    public MovieService(){
        if(init){
            Movie m1 = new Movie(1, "Finding Nemo", "The story of a fish trying to find a fish called Nemo", false, false);
            Movie m2 = new Movie(2, "Finding Dory", "The story of a fish trying to find a fish called Dory", false, false);
            Movie m3 = new Movie(3, "Sniper: Assassin's End", "Man with a sniper rifle trying to stop assassination", true, true);
            Movie m4 = new Movie(4, "Toy Story 4", "A story of moving toys trying to get to another side", false, true);
            
            list.add(m1);
            list.add(m2);
            list.add(m3);
            list.add(m4);
            init = false;
        }
    }
    
    public List<Movie> getMovie(){
        return list;
    }
        
    public Movie getMovie(int id){
        return list.get(id - 1);
    }
    
}
