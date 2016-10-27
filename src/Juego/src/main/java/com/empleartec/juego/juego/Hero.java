
package com.empleartec.juego.juego;


public class Hero extends Character{

    public Hero(String name, String nickname, String religion, String alignment, int age) {
        super(name, nickname, religion, alignment, age);
    }

    @Override
    void phrase() {
        System.out.println("In the name of justice, i'll stop you!");
    }
    
    
    
}
