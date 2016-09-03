/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author alumno
 */
public class Resta extends Operacion{

    public Resta(int num1, int num2) {
        this.num1=num1;
        this.num2=num2;
    }
 
    
    @Override
    public int calcular(){
        return num1-num2;
    }
}
