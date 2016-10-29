/*
 *Globant, Java Inicial
 *
 *File: Duel.java
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
 *This class contains two characters required for a duel.
 * 
 * @author miguel.jessica
 *         dubois.christian
 *         mato.santiago
 * 
 */
public class Duel {
    private Character fighterA;
    private Character fighterB;

    //Class Constructor.
    public Duel(Character fighterA, Character fighterB) {
        this.fighterA = fighterA;
        this.fighterB = fighterB;
    }

    //Getters and Setters.
    public Character getFighterA() {
        return fighterA;
    }

    public void setFighterA(Character fighterA) {
        this.fighterA = fighterA;
    }

    public Character getFighterB() {
        return fighterB;
    }

    public void setFighterB(Character fighterB) {
        this.fighterB = fighterB;
    }
    
    
    
}
