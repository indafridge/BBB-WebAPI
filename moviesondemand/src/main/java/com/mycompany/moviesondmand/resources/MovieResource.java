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
 * @author mynde, sandeeppulavazhy
 */
@Path("/movies")
public class MovieResource {
    
    MovieService movieService = new MovieService();
     @GET
    public List<Movie> getMovies(@PathParam("customerId") int c_id) {
        System.out.println("getAllMoviesForCustomer"+c_id);
	return movieService.getAllMoviesByCustomer(c_id);
    }
	
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Movie postMovie(@PathParam("customerId") int c_id, Movie m) {
	return movieService.createMovie(m, c_id);
    }
    
    //delete Movie
    
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Movie deleteMovie(@PathParam("customerId") int c_id, Movie m) {
	return movieService.deleteMovie(m, c_id);
    }
    
    
    @GET
    @Path("/{movieId}")
    public Movie getMovie(@PathParam("movieId") int m_id,@PathParam("customerId") int c_id ) {
    	System.out.println("getMoviesByID..."+m_id +" for CustomerId "+c_id);
	return movieService.getMovieByID(m_id,c_id);
    }
}
