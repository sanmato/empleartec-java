/*
 *Globant, Java Inicial
 *
 *File: App.java (Main)
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

/**
 *Main class.
 * 
 * @author miguel.jessica
 *         dubois.christian
 *         mato.santiago
 * 
 */
public class App {

    
    public static void main(String[] args) {
    System.out.println("Welcome to Mar del Plata Dueling, Food and Fitness Club!");   
    System.out.println("(Food and Fitness soon)"); 
    System.out.println("------------------------------------------------------------------------");
    
    
    GameController controller = new GameController();
    controller.register("sanmato", "12345");
    controller.login("sanmato", "12345");
    controller.createHero("Santiago", "Destroyer", "Golganneth", "Neutral", 29);
    controller.register("jessicamiguel", "49334");
    controller.login("jessicamiguel", "49334");
    controller.createVillain("Cristian", "Pocho", "Sargeras", "Chaotic", 29);
    controller.combat(controller.characters.get(0), controller.characters.get(1));
    
    }
    
    
}
