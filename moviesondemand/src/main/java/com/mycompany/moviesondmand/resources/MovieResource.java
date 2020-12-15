/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviesondmand.resources;

import com.mycompany.moviesondmand.models.Movie;
import com.mycompany.moviesondmand.services.MovieService;
import java.util.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
/**
 *
 * @author mynde
 */
@Path("/movies")
public class MovieResource {
    
    MovieService movieService = new MovieService();
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Movie> getMovieXML(){
        return movieService.getMovie();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Movie> getMovieJSON(){
        return movieService.getMovie();
    }
    
    @GET
    @Path("/{movieId}")
    @Produces(MediaType.APPLICATION_XML)
    public Movie getMovieXML(@PathParam("movieId") int id){
        return movieService.getMovie(id);
    }
    
    @GET
    @Path("/{movieId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Movie getMovieJSON(@PathParam("movieId") int id){
        return movieService.getMovie(id);
    }
}
