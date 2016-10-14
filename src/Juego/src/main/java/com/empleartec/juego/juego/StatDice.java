
package com.empleartec.juego.juego;


public class StatDice {
   static Integer num1;
    
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
