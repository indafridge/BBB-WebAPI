/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviesondmand.resources;

import com.mycompany.moviesondmand.models.Customer;
import com.mycompany.moviesondmand.services.CustomerService;
import java.util.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author sandeep pulavazhy
 */

@Path("/customers")
public class CustomerResource {
    
    CustomerService customerService = new CustomerService();
    
    
    
    
    
    
    
@GET 
@Produces(MediaType.APPLICATION_JSON)
//@Produces(MediaType.APPLICATION_XML)
 public List<Customer> getFilteredCustomers(@QueryParam("customer") String fName, @QueryParam("emailAddress") String emailAddress) 
 { 
   if ((fName != null) || (emailAddress != null)) 
      {        
          return customerService.getSearchCustomers(fName, emailAddress); 
      } 
    return customerService.getCustomers();    
 }  
    
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Customer> getCustomersXML() {
        return customerService.getCustomers();
    }
    
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> getCustomersJSON() {
        return customerService.getCustomers();
    }
    
    @GET
    @Path("/{customerId}")
    @Produces(MediaType.APPLICATION_XML)
    public Customer getCustomerXML(@PathParam("customerId") int id) {
        return customerService.getCustomer(id);
    }
    
    @GET
    @Path("/{customerId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer getCustomerJSON(@PathParam("customerId") int id) {
        return customerService.getCustomer(id);
    }
    
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Customer postCustomer(Customer c) {
	return customerService.createCustomer(c);
    }
    
    @Path("/{customerID}/accounts")
    public AccountResource getAccountsResource() {
	System.out.println("Getting accounts subresoruces...");
	return new AccountResource();
    }
    
     @Path("/{customerID}/movies")
    public MovieResource getMovieResource() {
	System.out.println("Getting movies subresoruces...");
	return new MovieResource();
    }
    
    
    
}
