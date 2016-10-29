/*
 *Globant, Java Inicial
 *
 *File: StatDice.java
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
 *This class simulates a dice to assign each stat in a Character.
 * 
 * @author miguel.jessica
 *         dubois.christian
 *         mato.santiago
 * 
 */
public class StatDice {
    //Stat Value.
   static Integer num1;
    
   
    //Stat Methods, each one return a random number from 1 to 21.
    public static int rollStrength(){
    num1 = (int)(Math.random()*(20-0+1)+0);
        return num1;
    }
    
    public static int rollAgility(){
    num1 = (int)(Math.random()*(20-0+1)+0);
        return num1;
    }
    
    public static int rollStamina(){
    num1 = (int)(Math.random()*(20-0+1)+0);
        return num1;
    }
    
    public static int rollIntellect(){
    num1 = (int)(Math.random()*(20-0+1)+0);
        return num1;
    }
}
