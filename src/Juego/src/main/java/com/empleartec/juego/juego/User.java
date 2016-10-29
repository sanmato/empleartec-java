/*
 *Globant, Java Inicial
 *
 *File: User.java
 *
 *Project: Game
 *
*Author:  Miguel, Jessica.
 *        Dubois, Christian.
 *        Mato, Santiago.
 *
 *
 *
 */

package com.empleartec.juego.juego;

/**
 * User class, contains an username and password
 *
 * @author miguel.jessica
 *         dubois.christian
 *         mato.santiago
 */

public class User {
    
    //User Attributes
    private String username, password;
    private boolean val;

    //Class Constructor
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //Getters & Setters
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    //equals method
    @Override  
   public boolean equals(Object o){
      if (o instanceof User){
          User u=(User) o;
          if (u.getUsername().equals(this.username) && u.getPassword().equals(this.password)){
              return true;
          }  
          else{
              return false;
          }
   }
      else {
          return false;
      }
   }
    

}