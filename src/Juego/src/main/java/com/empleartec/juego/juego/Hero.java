/*
 *Globant, Java Inicial
 *
 *File: Hero.java
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
 * 
 *Villain is a type of character (child of abstract class Character)
 * 
 * @author miguel.jessica
 *         dubois.christian
 *         mato.santiago
 * 
 */

public class Hero extends Character{

    //Superclass Constructor.
    public Hero(String name, String nickname, String religion, String alignment, int age) {
        super(name, nickname, religion, alignment, age);
    }
    
    ////Redefined abstract method.
    @Override
    public void phrase() {
        System.out.println("In the name of justice, i'll stop you!");
    }
    
    
    
}
