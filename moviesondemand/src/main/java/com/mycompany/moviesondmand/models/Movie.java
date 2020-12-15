/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviesondmand.models;

/**
 *
 * @author mynde
 */
public class Movie {
    private String name;
    private String summary;
    private boolean watched;
    private boolean recommended;
    
    public Movie(){
        
    }
    
    public Movie(String name, String summary, boolean watched, boolean recommended){
        this.name = name;
        this.summary = summary;
        this.watched = false;
        this.recommended = false;
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
    
}
