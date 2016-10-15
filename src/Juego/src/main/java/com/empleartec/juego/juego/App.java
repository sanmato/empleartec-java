
package com.empleartec.juego.juego;


public class App {
    public static void main(String[] args) {
     Character c = new Hero("santi", "caco", "Dios", "neutral", 33);
     Character d = new Hero("jorge", "nitales", "Samael", "caotico", 44);
     c.asignStats();
     d.asignStats();
     DuelService e = new DuelService();
     e.combat(c, d);
        System.out.println("Hello world");
    }
    
}
