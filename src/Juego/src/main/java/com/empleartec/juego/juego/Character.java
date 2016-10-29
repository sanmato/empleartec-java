/*
 *Globant, Java Inicial
 *
 *File: Character.java
 *
 *Project: Game
 *
 *Author: Miguel, Jessica.
 *        Dubois, Christian.
 *        Mato, Santiago.
 *
 *
 *
 */

package com.empleartec.juego.juego;

import java.util.HashMap;
import java.util.Map;

/**
 *Character abstract class, contains attributes and methods of a simple character in a game.
 *Superclass
 * 
 * @author miguel.jessica
 *         dubois.christian
 *         mato.santiago
 * 
 */

public abstract class Character {
    //Character Attributes.
   private String name, nickname, religion, alignment;
   private int level=1, nightvision=500, age, health=100, damage;
  
    //Stat HashMap.
    Map <String, Integer> stats = new HashMap <>();

    //Class Constructor.
    public Character(String name, String nickname, String religion, String alignment, int age) {
        this.name = name;
        this.nickname = nickname;
        this.religion = religion;
        this.alignment = alignment;
        this.age = age;
        this.stats.put("Strength", 0);
        this.stats.put("Agility", 0);
        this.stats.put("Stamina", 0);
        this.stats.put("Intellect", 0);
        
    }

    //Getters and Setters.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getNightvision() {
        return nightvision;
    }

    public void setNightvision(int nightvision) {
        this.nightvision = nightvision;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Map<String, Integer> getStats() {
        return stats;
    }

    public void setStats(Map<String, Integer> stats) {
        this.stats = stats;
    }
    
    //Abstract Method.
    public abstract void phrase();
 
    /**
     * This method calculate the damage of a character
     *
     * @return 1 + the Strength of the character
     */
    public int totalDamage(){
       damage = 1+(stats.get("Strength"));
        
        return damage;
    }
   
    /**
     *fighterA (character) attacks fighterB
     *The damage value calculated in totalDamage method will be subtracted from the amount of health.
     * 
     * @param fighterB receives the attack
     * 
     */
    public void attack(Character fighterB){
        System.out.println("Health of character"+ " " +fighterB.name+" is reduced by"+ " " +totalDamage()+ " "+ "points");
        fighterB.setHealth((fighterB.health - totalDamage()));
        System.out.println("Health remaining: "+fighterB.getHealth());
        
        
    }
    
    /**
     *Assigns a value for each stat in the Stat HashMap
     *the methods to assign stats belongs to StatDice class and return a random number from 1 to 21.
     */
    
    public void asignStats(){
        stats.put("Strength", StatDice.rollStrength());
        stats.put("Agility", StatDice.rollAgility());
        stats.put("Stamina", StatDice.rollStamina());
        stats.put("Intellect", StatDice.rollIntellect());
        
    }
    
    
    
}
