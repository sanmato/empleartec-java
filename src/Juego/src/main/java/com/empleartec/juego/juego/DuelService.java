
package com.empleartec.juego.juego;


public class DuelService {
    
    //Combat Method
    void combat(Character fighterA, Character fighterB)
    {
        System.out.println(fighterA.getName()+" vs "+fighterB.getName() );
        System.out.println("Let the Duel begins!");
        System.out.println("------------------------------------------------------------------------");
        boolean winner = false;
     
     do{
         //First Attack and Combat
         if(fighterA.stats.get("Agility")>fighterB.stats.get("Agility")){
          fighterA.attack(fighterB);
          fighterB.attack(fighterA);
         }else{
          fighterB.attack(fighterA);
          fighterA.attack(fighterB);
         }
         //Combat Condition
             }while((fighterB.getHealth()>0)&&(fighterA.getHealth()>0));
     
     //Results
     if(fighterB.getHealth()<=0)
     {
            System.out.println("Fighter"+ " " +fighterA.getName()+" "+ "Wins the duel");
                winner = true;
                
            }else{
                
                System.out.println("Fighter"+ " " +fighterB.getName()+" "+ "Wins the duel");
                winner=true;
            }
     }
   
        
        
    }
    
    
    

