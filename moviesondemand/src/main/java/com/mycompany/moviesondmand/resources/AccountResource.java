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
 * @author David
 */
@Path("/Accounts")
public class AccountResource {

    AccountService accountService = new AccountService();



    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Account> getAccountsXML() {
        return accountService.getAccounts();
    }



    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Account> getAccountsJSON() {
        return accountService.getAccounts();
    }

    
    @GET
    @Path("/{accountId}")
    @Produces(MediaType.APPLICATION_XML)
    public Account getAccountXML(@PathParam("accountId") int id) {
        return accountService.getAccount(id)
    }

    @GET
    @Path("/{accountId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Account getAccountJSON(@PathParam("accountId") int id) {
        return accountService.getAccount(id);
    }


}
