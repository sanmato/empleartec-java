
package com.empleartec.juego.juego;


public class App {
    public static void main(String[] args) {
    System.out.println("Welcome to Mar del Plata Dueling, Food and Fitness Club!");   
    System.out.println("(Food and Fitness soon!)"); 
    System.out.println("------------------------------------------------------------------------");
    
     Character c = new Villain("santi", "caco", "Dios", "neutral", 33);
     Character d = new Hero("jorge", "nitales", "Samael", "caotico", 44);
     c.asignStats();
     d.asignStats();
     DuelService e = new DuelService();
     e.combat(c, d);
     
    }
    
}
