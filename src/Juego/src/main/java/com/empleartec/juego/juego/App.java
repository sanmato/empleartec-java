
package com.empleartec.juego.juego;


public class App {

    
    public static void main(String[] args) {
    System.out.println("Welcome to Mar del Plata Dueling, Food and Fitness Club!");   
    System.out.println("(Food and Fitness soon!)"); 
    System.out.println("------------------------------------------------------------------------");
    
     Character g = new Villain("Santi", "Destroyer", "Aman'Thul", "Neutral", 33);
     Character d = new Hero("Jorge", "Challenger", "Cthulhu", "Legal", 44);
     g.asignStats();
     d.asignStats();
     DuelService e = new DuelService();
     e.combat(g, d);
     
     UserService u = new UserService();
     u.createCharacter("Santiago", "Champion", "R'hilor", "Good", 23);
     
    }
    
}
