/*
 *Globant, Java Inicial
 *
 *File: Villain.java
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
 *Villain is a typpe of character (child of abstract class Character)
 * 
 * @author miguel.jessica
 *         dubois.christian
 *         mato.santiago
 */
public class Villain extends Character{

    //Superclass Constructor.
    public Villain(String name, String nickname, String religion, String alignment, int age) {
        super(name, nickname, religion, alignment, age);
    }

    //Redefined abstract method.
    @Override
    public void phrase() {
        System.out.println("I'll destroy you!");
    }
    
}
