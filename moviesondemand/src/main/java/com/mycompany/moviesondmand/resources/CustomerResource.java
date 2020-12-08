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
 * @author sandeeppulavazhy
 */

@Path("/customers")
public class CustomerResource {
    
    CustomerService customerService = new CustomerService();
    
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Customer> getCustomersXML() {
        return customerService.getCustomers();
    }
    
    
     
    @GET
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

    
    
}
