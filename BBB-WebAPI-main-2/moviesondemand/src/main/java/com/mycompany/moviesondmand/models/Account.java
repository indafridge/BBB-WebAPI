/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.moviesondmand.models;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author Group BBB
 */
@XmlRootElement
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

        public int getId(){

            return id;
        }
        
        public void setId(){

            this.id = id;
        }
        
        public String getNickName(){
        
            return nickName;                
        }
        
        public void setNickName(){

            this.nickName = nickName;
        }
            
        public String getPassword(){

            return password;
        }

        public void setPassword(){

            this.password = password;
        }

        public String printAccount(){
            
            String str = this.getId()+ this.getNickName()+this.getPassword();
            return str;
        }


        
}
