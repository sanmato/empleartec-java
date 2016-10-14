
package com.empleartec.juego.juego;

import java.util.HashMap;
import java.util.Map;


public abstract class Character {
    String name, nickname, religion, alignment;
    int level=1, nightvision=500, age, health=100, damage;
  
    
    Map <String, Integer> stats = new HashMap <>();

    public Character(String name, String nickname, String religion, String alignment, int age) {
        this.name = name;
        this.nickname = nickname;
        this.religion = religion;
        this.alignment = alignment;
        this.age = age;
        
    }

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
    
    abstract void run();
    
    void walk(){
        
    }
    
    void stop(){
        
    }
    //REVISAR
    int totalDamage(){
       damage = 1+(stats.get("Strength"));
        
        return damage;
    }
   
    //REVISAR
    void attack(Character fighterB){
        System.out.println("Health of character"+name+"Is reduced by"+damage+"points");
        System.out.println("Health remaining: "+(health - damage));
        
        
    }
    
    void stats(){
        stats.put("Strength", 0);
        stats.put("Agility", 0);
        stats.put("Stamina", 0);
        stats.put("Intellect", 0);
    }
    
    public void asignStats(){
        stats.put("Strength", StatDice.rollStrength());
        stats.put("Agility", StatDice.rollAgility());
        stats.put("Stamina", StatDice.rollStamina());
        stats.put("Intellect", StatDice.rollIntellect());
        
    }
    
    
    
}
