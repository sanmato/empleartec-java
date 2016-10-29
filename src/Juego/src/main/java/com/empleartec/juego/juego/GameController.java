/*
 *Globant, Java Inicial
 *
 *File: GameController.java
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

import java.util.ArrayList;
import java.util.List;

/**
 * This Class includes the methods of UserService & DuelService
 * 
 * @author miguel.jessica
 *         dubois.christian
 *         mato.santiago
 * 
 */
public class GameController {
    
    //Methods and Lists of UserService Class.
    
    //List of Users & Characters
    
    List <User> users = new ArrayList<>();
    List <Character> characters = new ArrayList<>();
    
    /**
     *Register an user.
     * 
     * @param username the username for the account
     * @param password the password for the account
     * 
     */
    public void register(String username, String password){
        if(username !=null && password != null){
         User user = new User(username, password);
         users.add(user);
         
        }else{
            System.out.println("Please, add a username and password!");
        }
        
        
    }
    
    /**
     *
     * @param username the username of registered account
     * @param password the password of registered account
     * 
     * Log a registered user.
     */
    public void login(String username, String password){
        User user = new User(username, password);
       if (users.contains(user) && users.contains(user))
            System.out.println("The user "+username+" is logged!");
       
       else{
           System.out.println("The user "+username+" not exists.");
       }
        System.out.println("------------------------------------------------------------------------");
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
    
    /**
     * Creates a Hero, then assigns its stats and then save it in a Character type List named characters.
     * 
     * Attributes of a Character
     * @param name
     * @param nickname
     * @param religion
     * @param alignment
     * @param age
     * 
     */
    
    public void createHero(String name, String nickname, String religion, String alignment, int age){
     Character hero = new Hero(name, nickname, religion, alignment, age);
     hero.asignStats();
     characters.add(hero);
    }
    
    /**
     *
     *Creates a Villain, then assigns its stats and then save it in a Character type List named characters.
     * 
     * Attributes of a Character
     * 
     * @param name
     * @param nickname
     * @param religion
     * @param alignment
     * @param age
     */
    
    public void createVillain(String name, String nickname, String religion, String alignment, int age){
     Character villain = new Villain(name, nickname, religion, alignment, age);
     villain.asignStats();
     characters.add(villain);
    }
    
    //Methods of the DuelService Class.
   
    /**
    *Combat method, two characters fights here.
    * 
    * @param fighterA first character.
    * @param fighterB second character.
    */
    
   public void combat(Character fighterA, Character fighterB)
    {
        System.out.println(fighterA.getName()+" vs "+fighterB.getName() );
        System.out.println("Let the Duel begins!");
        System.out.println("------------------------------------------------------------------------");
        boolean winner = false;
     
     do{
         //First Attack and Combat
         if(fighterA.stats.get("Agility")>fighterB.stats.get("Agility")){
          fighterA.attack(fighterB);
          fighterB.attack(fighterA);
         }else{
          fighterB.attack(fighterA);
          fighterA.attack(fighterB);
         }
         //Combat Condition
             }while((fighterB.getHealth()>0)&&(fighterA.getHealth()>0));
     
     //Results
     if(fighterB.getHealth()<=0)
     {
            System.out.println("Fighter"+ " " +fighterA.getName()+" "+ "Wins the duel");
                winner = true;
                
            }else{
                
                System.out.println("Fighter"+ " " +fighterB.getName()+" "+ "Wins the duel");
                winner=true;
            }
     }
    
    
}
