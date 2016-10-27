
package com.empleartec.juego.juego;


public class Villain extends Character{

    public Villain(String name, String nickname, String religion, String alignment, int age) {
        super(name, nickname, religion, alignment, age);
    }

    @Override
    void phrase() {
        System.out.println("I'll destroy you!");
    }
    
}
