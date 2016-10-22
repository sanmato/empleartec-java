
package com.empleartec.juego.juego;


public class User {
    private String username, password;
    private boolean val;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

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