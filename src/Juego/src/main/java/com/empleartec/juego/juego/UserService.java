
package com.empleartec.juego.juego;

import java.util.ArrayList;
import java.util.List;


public class UserService {
    List <User> users = new ArrayList<>();
    
    public void register(String username, String password){
        if(username !=null && password != null){
         User user = new User(username, password);
         users.add(user);
         
        }else{
            System.out.println("Please, add a username and password!");
        }
        
        
    }
    
    public void login(String username, String password){
        User user = new User(username, password);
       if (users.contains(user) && users.contains(user))
            System.out.println("The user "+username+" is logged!");
       else{
           System.out.println("The user "+username+" not exists.");
       }
      
    }
    
    public boolean equals(User username){
        if (username instanceof User){
            User u=(User) username;
            if (username.getUsername().equals(users) && username.getPassword().equals(users)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
