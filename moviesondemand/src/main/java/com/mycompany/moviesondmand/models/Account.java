/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.moviesondmand.models;

/**
 *
 * @author Group BBB
 */
public class Account {
    private int id;
    private String nickName;
    private String password;


    public Account(){

    }


        public Account(int id, String nickName, String password){
            
            this.id = id;
            this.nickName = nickName;
            this.password = password;

        }
}
