/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.moviesondmand.resources;

import com.mycompany.moviesondmand.models.Account;
import com.mycompany.moviesondmand.services.AccountService;
import java.util.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;





/**
 *
 * @author David , sandeep pulavazhy
 */
@Path("/accounts")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AccountResource {

    AccountService accountService = new AccountService();

    	
    @GET
    @Path("/")
    public List<Account> getAccounts(@PathParam("customerId") int c_id) {
        System.out.println("getAllAccountsForCustomer"+c_id);
	return accountService.getAllAccountsByCustomer(c_id);
    }
	
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Account postAccount(@PathParam("customerId") int c_id, Account a) {
	return accountService.createAccount(a, c_id);
    }
    @GET
    @Path("/{accountId}")
    public Account getAccount(@PathParam("accountId") int a_id,@PathParam("customerId") int c_id ) {
    	System.out.println("getAccountByID..."+a_id +" for CustomerId "+c_id);
	return accountService.getAccountByID(a_id,c_id);
    }
}
