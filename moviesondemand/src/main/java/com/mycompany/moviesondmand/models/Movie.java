/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviesondmand.models;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mynde, sandeeppulavazhy
 */
@XmlRootElement
public class Movie {
    private int id;
    private String name;
    private String summary;
    private boolean watched;
    private boolean recommended;
    
    public Movie(){
        
    }
    
    public Movie(int id, String name, String summary, boolean watched, boolean recommended){
        this.id = id;
        this.name = name;
        this.summary = summary;
        this.watched = false;
        this.recommended = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    public boolean isRecommended() {
        return recommended;
    }

    public void setRecommended(boolean recommended) {
        this.recommended = recommended;
    }
    
     public String printMovie(){
        String str = this.getId()+this.getSummary()+this.isRecommended()+this.isWatched();
        return str;
    }
  
}
